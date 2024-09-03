package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.block.blockentity.NuclearFurnaceBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NuclearFurnaceBlockEntity.class)
public interface NuclearFurnaceBlockEntityAccessor {
    @Mutable
    @Accessor(remap = false)
    void setMaxCookTime(int maxCookTime);

    @Accessor(remap = false)
    int getMaxCookTime();
}