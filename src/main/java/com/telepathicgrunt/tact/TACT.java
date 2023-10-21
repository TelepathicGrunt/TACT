package com.telepathicgrunt.tact;

import com.mojang.logging.LogUtils;
import com.telepathicgrunt.tact.mixin.BlockStateBaseAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Collection;
import java.util.List;
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
}
