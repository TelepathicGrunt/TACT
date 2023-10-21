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

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean friendlyCompassBlocking;

    static void onLoad(final ModConfigEvent event) {
        friendlyCompassBlocking = FRIENDLY_COMPASS_BLOCKING.get();
    }
}
