package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.DreadbowItem;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.DreadbowRainAttackModification;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(DreadbowItem.class)
public abstract class DreadbowItemMixin {

    @ModifyVariable(method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V",
            at = @At(value = "FIELD", target = "Lnet/minecraft/world/entity/projectile/AbstractArrow;pickup:Lnet/minecraft/world/entity/projectile/AbstractArrow$Pickup;", ordinal = 0, shift = At.Shift.AFTER),
            require = 0, ordinal = 4)
    private int tact_adjustDreadbowArrowAmount(int arrowAmount, @Local(ordinal = 1) ItemStack ammoStack) {
        if (DreadbowRainAttackModification.DREADBOW_OVERRIDES.containsKey(ammoStack.getItem())) {
            return DreadbowRainAttackModification.DREADBOW_OVERRIDES.get(ammoStack.getItem());
        }
        return arrowAmount;
    }
}