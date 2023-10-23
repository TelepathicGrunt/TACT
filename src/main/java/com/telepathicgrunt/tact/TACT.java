package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import com.mojang.logging.LogUtils;
import com.telepathicgrunt.tact.mixin.BlockStateBaseAccessor;
import com.telepathicgrunt.tact.mixin.LivingEntityAccessor;
import com.telepathicgrunt.tact.mixin.MobEffectInstanceAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.resource.PathPackResources;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.Optional;

@Mod(TACT.MODID)
public class TACT {
    public static final String MODID = "tact";
    public static final String ALEXSCAVES_MODID = "alexscaves";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TACT() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(Config::onLoad);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::setupBuiltInDataPack);

        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.addListener(this::stunEffectAdjustment);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (Config.replaceableSmallPlants) {
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "underweed"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "tree_star"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "fiddlehead"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "curly_fern"));
            }
        });
    }

    private static void makeReplaceable(ResourceLocation targetBlock) {
        Optional<Block> block = BuiltInRegistries.BLOCK.getOptional(targetBlock);
        block.ifPresent(value ->
            value.getStateDefinition().getPossibleStates().forEach(blockState ->
                ((BlockStateBaseAccessor) blockState).setReplaceable(true)
        ));
    }

    private void setupBuiltInDataPack(final AddPackFindersEvent event) {
        try {
            if (Config.applyTagAdjustments && event.getPackType() == PackType.SERVER_DATA) {
                var resourcePath =  ModList.get().getModFileById(MODID).getFile()
                        .findResource("datapacks/apply_tag_adjustments");

                var pack = Pack.readMetaAndCreate(
                        "builtin/apply_tag_adjustments",
                        Component.literal("TACT - Adjusted Tags"),
                        false,
                        (path) -> new PathPackResources(path, false, resourcePath),
                        PackType.SERVER_DATA,
                        Pack.Position.BOTTOM,
                        PackSource.BUILT_IN);

                event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
            }
        }
        catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void stunEffectAdjustment(final MobEffectEvent.Added event) {
        LivingEntity affectedEntity = event.getEntity();
        if (affectedEntity == null || affectedEntity.level().isClientSide()) {
            return;
        }

        MobEffectInstance currentEffect = event.getEffectInstance();
        if (currentEffect.getEffect() == ACEffectRegistry.STUNNED.get() &&
            affectedEntity.getLastAttacker() != null &&
            ((LivingEntityAccessor)affectedEntity).getLastHurtByPlayerTime() == 100)
        {

            LivingEntity attacker = affectedEntity.getLastAttacker();
            ItemStack usedItem = attacker.getItemInHand(attacker.getUsedItemHand());

            if (usedItem.is(ACItemRegistry.PRIMITIVE_CLUB.get())) {
                ((MobEffectInstanceAccessor)currentEffect).setDuration(
                    Config.primitiveClubBaseStunTime + affectedEntity.getRandom().nextInt(Config.primitiveClubRandomExtraStunTime)
                );
            }
        }
    }
}
