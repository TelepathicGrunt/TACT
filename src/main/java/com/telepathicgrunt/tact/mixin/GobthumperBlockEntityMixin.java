package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.block.blockentity.GobthumperBlockEntity;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.telepathicgrunt.tact.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(GobthumperBlockEntity.class)
public abstract class GobthumperBlockEntityMixin {

    @Unique
    private static ResourceKey<Biome> TACT$CANDY_CAVITY_BIOME_KEY = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("alexscaves", "candy_cavity"));

    @WrapOperation(method = "thumpTick(Lnet/minecraft/world/level/Level;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;isLoaded(Lnet/minecraft/core/BlockPos;)Z", ordinal = 0),
            remap = false,
            require = 0)
    private static boolean tact_gobthumperSummonLogic(Level level, BlockPos blockPos, Operation<Boolean> original) {
        if (original.call(level, blockPos)) {
            if (Config.GOBTHUMPER_DISABLE_WORM_SPAWNING.get()) {
                return false;
            }

            if (Config.GOBTHUMPER_SPAWNS_WORMS_FROM_CANDY_CAVITY_BIOME.get()) {
                return level.getBiome(blockPos).is(TACT$CANDY_CAVITY_BIOME_KEY);
            }

            return true;
        }

        return false;
    }
}