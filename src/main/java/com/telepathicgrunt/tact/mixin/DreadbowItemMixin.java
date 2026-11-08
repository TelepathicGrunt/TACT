package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.WaterBoltEntity;
import com.github.alexmodguy.alexscaves.server.item.DreadbowItem;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.Config;
import com.telepathicgrunt.tact.DreadbowRainAttackModification;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(DreadbowItem.class)
public abstract class DreadbowItemMixin {

    @ModifyVariable(method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V",
            at = @At(value = "FIELD", target = "Lnet/minecraft/world/entity/projectile/AbstractArrow;pickup:Lnet/minecraft/world/entity/projectile/AbstractArrow$Pickup;", ordinal = 0, shift = At.Shift.AFTER, opcode = Opcodes.PUTFIELD),
            require = 0, name = "maxArrows")
    private int tact_adjustDreadbowArrowAmount(int maxArrows, @Local(name = "ammoStack") ItemStack ammoStack) {
        if (DreadbowRainAttackModification.DREADBOW_OVERRIDES.containsKey(ammoStack.getItem())) {
            return DreadbowRainAttackModification.DREADBOW_OVERRIDES.get(ammoStack.getItem());
        }
        return maxArrows;
    }

    @ModifyConstant(method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V",
            constant = {@Constant(floatValue = 3.0F, ordinal = 0)})
    private float tact_configurableDreadbowDarkArrowDamage(float original) {
        return Config.DREADBOW_DARK_NORMAL_ARROW_DAMAGE.get().floatValue();
    }

    @ModifyConstant(method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V",
            constant = {@Constant(floatValue = 2.0F, ordinal = 0)})
    private float tact_configurableDreadbowDarkArrowPreciseDamage(float original) {
        return Config.DREADBOW_DARK_PRECISE_ARROW_DAMAGE.get().floatValue();
    }
}