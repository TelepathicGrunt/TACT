package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.AlexsCaves;
import com.google.common.base.Suppliers;
import com.telepathicgrunt.tact.mixin.BlockStateBaseAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;
import java.util.function.Supplier;

public class BlockModifications {

    static void setupModifications(final FMLCommonSetupEvent event) {
        if (Config.REPLACEABLE_SMALL_PLANTS.get()) {
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "underweed"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "tree_star"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "fiddlehead"));
            makeReplaceable(new ResourceLocation(TACT.ALEXS_CAVES_MODID, "curly_fern"));
        }
    }

    private static final Supplier<Item> GUANO = Suppliers.memoize(() -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(AlexsCaves.MODID, "guano")));
    private static final Supplier<Item> GUANO_BLOCK = Suppliers.memoize(() -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(AlexsCaves.MODID, "guano_block")));
    private static final Supplier<Item> GUANO_LAYER = Suppliers.memoize(() -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(AlexsCaves.MODID, "guano_layer")));

    static void burnTimeModifications(final FurnaceFuelBurnTimeEvent event) {
        if (Config.GUANO_BURN_FUEL.get()) {
            ItemStack currentStack = event.getItemStack();
            if (currentStack.is(GUANO.get())) {
                event.setBurnTime(1600);
            }
            else if (currentStack.is(GUANO_BLOCK.get())) {
                event.setBurnTime(7000);
            }
            else if (currentStack.is(GUANO_LAYER.get())) {
                event.setBurnTime(3500);
            }
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
