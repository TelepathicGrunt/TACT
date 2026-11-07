package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.FrostmintSpearEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FrostmintSpearEntity.class)
public abstract class FrostmintSpearEntityMixin {

    @ModifyConstant(method = "onHitEntity(Lnet/minecraft/world/phys/EntityHitResult;)V",
            constant = {@Constant(floatValue = 6, ordinal = 0)})
    private float tact_configurableFrostmintSpearDamage(float original) {
       return Config.FROSTMINT_SPEAR_THROWN_DAMAGE.get().floatValue();
    }
}