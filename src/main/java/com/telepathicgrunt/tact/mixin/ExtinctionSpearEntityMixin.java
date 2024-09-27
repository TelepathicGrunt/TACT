package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.ExtinctionSpearEntity;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ExtinctionSpearEntity.class)
public abstract class ExtinctionSpearEntityMixin {

    @ModifyConstant(method = "onHitEntity(Lnet/minecraft/world/phys/EntityHitResult;)V",
            constant = {@Constant(floatValue = 10)})
    private float tact_configurableExtinctionSpearDamage(float original) {
       return Config.EXTINCTION_SPEAR_THROWN_DAMAGE.get().floatValue();
    }
}