package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.telepathicgrunt.tact.mixin.BlockStateBaseAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.Optional;

public class BlockModifications {

    static void setupModifications(final FMLCommonSetupEvent event) {
        if (Config.REPLACEABLE_SMALL_PLANTS.get()) {
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "underweed"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "tree_star"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "fiddlehead"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "curly_fern"));
        }
    }

    private static void makeReplaceable(ResourceLocation targetBlock) {
        Optional<Block> block = BuiltInRegistries.BLOCK.getOptional(targetBlock);
        block.ifPresent(value ->
                value.getStateDefinition().getPossibleStates().forEach(blockState ->
                        ((BlockStateBaseAccessor) blockState).setReplaceable(true)
                ));
    }
}
