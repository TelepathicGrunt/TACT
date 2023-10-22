package com.telepathicgrunt.tact;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue ADJUST_STRUCTURE_NBT_FILES = BUILDER
            .comment("""
                    Whether to replace Alex's Caves structure NBT files with ones that fit a bit better with terrain.
                    """)
            .define("adjustStructureNbtFiles", true);

    private static final ForgeConfigSpec.BooleanValue REPLACEABLE_SMALL_PLANTS = BUILDER
            .comment("""
                    Whether to make Bone Worms, Underweed, Tree Star, Fiddlehead, Curly Fern, and Pewen Pines be
                    replaceable by another block when right clicking them while holding a block in your hands.
                    """)
            .define("replaceableSmallPlants", true);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean adjustStructureNbtFiles;
    public static boolean replaceableSmallPlants;

    static void onLoad(final ModConfigEvent event) {
        adjustStructureNbtFiles = ADJUST_STRUCTURE_NBT_FILES.get();
        replaceableSmallPlants = REPLACEABLE_SMALL_PLANTS.get();
    }
}
