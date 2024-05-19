package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.item.CaveInfoItem;
import com.github.alexmodguy.alexscaves.server.misc.CaveBookProgress;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CompendiumUnlock {

    private static final TagKey<Biome> ALEXS_CAVES_BIOME_TAG =
            TagKey.create(Registries.BIOME, new ResourceLocation("alexscaves", "alexs_caves_biomes"));

    public static void playerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
        if (!Config.UNLOCK_ALL_COMPENDIUM_INFO.get()) {
            return;
        }

        if (!(event.getEntity() instanceof ServerPlayer serverPlayer)) {
            return;
        }

        if (!(serverPlayer.level() instanceof ServerLevel serverLevel)) {
            return;
        }

        Registry<Biome> biomeRegistry = serverLevel.registryAccess().registry(Registries.BIOME).orElseThrow();
        CaveBookProgress caveBookProgress = CaveBookProgress.getCaveBookProgress(serverPlayer);

        for (Holder<Biome> biomeHolder : biomeRegistry.getOrCreateTag(ALEXS_CAVES_BIOME_TAG)) {
            for (int i = 0; i < CaveBookProgress.Subcategory.values().length; i++) {
                caveBookProgress.unlockNextFor(biomeHolder.unwrapKey().get().location().toString());
                CaveBookProgress.saveCaveBookProgress(caveBookProgress, serverPlayer);
            }
        }
    }
}
