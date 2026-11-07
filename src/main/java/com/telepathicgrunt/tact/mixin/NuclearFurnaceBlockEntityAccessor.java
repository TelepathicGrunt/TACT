package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.block.blockentity.NuclearFurnaceBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(NuclearFurnaceBlockEntity.class)
public interface NuclearFurnaceBlockEntityAccessor {
    @Mutable
    @Accessor(remap = false)
    void setMaxCookTime(int maxCookTime);

    @Accessor(remap = false)
    int getMaxCookTime();
}