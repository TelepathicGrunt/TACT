package com.telepathicgrunt.tact;

import com.mojang.logging.LogUtils;
import com.telepathicgrunt.tact.mixin.BlockStateBaseAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.PlayLevelSoundEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.resource.PathPackResources;
import org.slf4j.Logger;

import java.io.IOException;
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

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (Config.replaceableSmallPlants) {
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "bone_worms"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "underweed"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "tree_star"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "fiddlehead"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "curly_fern"));
                makeReplaceable(new ResourceLocation(ALEXSCAVES_MODID, "pewen_pines"));
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
            if (Config.adjustStructureNbtFiles && event.getPackType() == PackType.SERVER_DATA) {
                var resourcePath =  ModList.get().getModFileById(MODID).getFile()
                        .findResource("datapacks/adjusted_structure_nbt_files");

                var pack = Pack.readMetaAndCreate(
                        "builtin/adjusted_structure_nbt_files",
                        Component.literal("TACT - Adjusted Structure NBT Files"),
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
}
