package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.LimestoneSpearEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LimestoneSpearEntity.class)
public abstract class LimestoneSpearEntityMixin {

    @ModifyConstant(method = "onHitEntity(Lnet/minecraft/world/phys/EntityHitResult;)V",
            constant = {@Constant(floatValue = 4, ordinal = 0)})
    private float tact_configurableLimestoneSpearDamage(float original) {
       return Config.LIMESTONE_SPEAR_THROWN_DAMAGE.get().floatValue();
    }
}