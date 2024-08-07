package com.telepathicgrunt.tact;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
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
    public static final Logger LOGGER = LogUtils.getLogger();

    public static TagKey<Biome> MANUALLY_CARVED = TagKey.create(Registries.BIOME, new ResourceLocation(MODID, "manually_carved"));

    public TACT() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataAndResourcePacks::setupBuiltInDataPack);
        modEventBus.addListener(EntityAttributeModifications::AttributeModifications);

        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.addListener(EventPriority.LOWEST, ItemModifications::stunEffectAdjustment);
        forgeBus.addListener(CompendiumUnlock::playerLoggedIn);
        forgeBus.addListener(BlockModifications::burnTimeModifications);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> BlockModifications.setupModifications(event));
    }
}
