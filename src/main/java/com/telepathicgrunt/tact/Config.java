package com.telepathicgrunt.tact;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue APPLY_TAG_ADJUSTMENTS = BUILDER
            .comment("""
                    Whether to activate an internal datapack to add Alex's Caves biomes and blocks to certain tags for better mod compat.
                    """)
            .define("applyTagAdjustments", true);

    private static final ForgeConfigSpec.BooleanValue REPLACEABLE_SMALL_PLANTS = BUILDER
            .comment("""
                    Whether to make Underweed, Tree Star, Fiddlehead, and Curly Fern be
                    replaceable by another block when right clicking them while holding a block in your hands.
                    """)
            .define("replaceableSmallPlants", true);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean applyTagAdjustments;
    public static boolean replaceableSmallPlants;

    static void onLoad(final ModConfigEvent event) {
        applyTagAdjustments = APPLY_TAG_ADJUSTMENTS.get();
        replaceableSmallPlants = REPLACEABLE_SMALL_PLANTS.get();
    }
}
