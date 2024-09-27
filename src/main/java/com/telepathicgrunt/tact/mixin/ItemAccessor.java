package com.telepathicgrunt.tact.mixin;

import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.UUID;

@Mixin(Item.class)
public interface ItemAccessor {
    @Accessor
    static UUID getBASE_ATTACK_DAMAGE_UUID() {
        throw new UnsupportedOperationException();
    }
}
