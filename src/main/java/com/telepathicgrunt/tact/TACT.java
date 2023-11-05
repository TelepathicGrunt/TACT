package com.telepathicgrunt.tact;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TACT.MODID)
public class TACT {
    public static final String MODID = "tact";
    public static final String ALEXS_CAVES_MODID = "alexscaves";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TACT() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(Config::onLoad);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataAndResourcePacks::setupBuiltInDataPack);
        modEventBus.addListener(EntityAttributeModifications::AttributeModifications);

        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.addListener(ItemModifications::stunEffectAdjustment);

        BlockModifications.setupEarlyModifications();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> BlockModifications.setupModifications(event));
    }
}
