package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.RaygunItem;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(RaygunItem.class)
public abstract class RaygunItemMixin {

    @ModifyArg(method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", ordinal = 0),
            require = 0)
    private float tact_configurableRaygunDamaging(float damage, @Local(ordinal = 1) boolean gamma) {
        if (gamma) {
            return Config.raygunGammaDamage;
        }
        else {
            return Config.raygunNormalDamage;
        }
    }
}