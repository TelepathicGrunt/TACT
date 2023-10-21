package com.telepathicgrunt.tact;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue FRIENDLY_COMPASS_BLOCKING = BUILDER
            .comment("""
                    Whether to disable the laughing that plays when Alex's Caves blocks a compass from locating cave biomes.
                    Instead, a friendly action bar message will show instead saying to use Alex's Cave's book instead.
                    """)
            .define("friendlyCompassBlocking", true);

    private static final ForgeConfigSpec.BooleanValue REPLACEABLE_SMALL_PLANTS = BUILDER
            .comment("""
                    Whether to make Bone Worms, Underweed, Tree Star, Fiddlehead, Curly Fern, and Pewen Pines be
                    replaceable by another block when right clicking them while holding a block in your hands.
                    """)
            .define("replaceableSmallPlants", true);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean friendlyCompassBlocking;
    public static boolean replaceableSmallPlants;

    static void onLoad(final ModConfigEvent event) {
        friendlyCompassBlocking = FRIENDLY_COMPASS_BLOCKING.get();
        replaceableSmallPlants = REPLACEABLE_SMALL_PLANTS.get();
    }
}
