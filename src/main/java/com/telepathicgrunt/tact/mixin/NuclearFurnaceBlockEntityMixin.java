package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.block.blockentity.NuclearFurnaceBlockEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NuclearFurnaceBlockEntity.class)
public abstract class NuclearFurnaceBlockEntityMixin {

    @Inject(method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lcom/github/alexmodguy/alexscaves/server/block/blockentity/NuclearFurnaceBlockEntity;)V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/block/blockentity/NuclearFurnaceBlockEntity;canFitInResultSlot(Lnet/minecraft/world/item/ItemStack;I)Z", ordinal = 0),
            remap = false,
            require = 0)
    private static void tact_furnaceSmeltSpeed(Level level, BlockPos blockPos, BlockState state, NuclearFurnaceBlockEntity entity, CallbackInfo ci) {
        int newMaxTime = (int) (((NuclearFurnaceBlockEntityAccessor)entity).getMaxCookTime() * Config.NUCLEAR_FURNACE_SMELTING_SPEED_MODIFIER.get());
        ((NuclearFurnaceBlockEntityAccessor)entity).setMaxCookTime(Math.max(newMaxTime, 1));
    }
}