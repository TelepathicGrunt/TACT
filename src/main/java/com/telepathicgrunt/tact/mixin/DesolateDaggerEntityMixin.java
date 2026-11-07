package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.DesolateDaggerEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DesolateDaggerEntity.class)
public abstract class DesolateDaggerEntityMixin {

    @ModifyConstant(method = "tick()V",
            constant = {@Constant(floatValue = 2.0F, ordinal = 0)})
    private float tact_desolateDaggerAbilityDamage1(float damage) {
        return Config.DESOLATE_DAGGERS_ABILITY_BASE_DAMAGE.get().floatValue();
    }

    @ModifyConstant(method = "tick()V",
            constant = {@Constant(floatValue = 2.0F, ordinal = 1)})
    private float tact_desolateDaggerAbilityDamage2(float damage) {
        return Config.DESOLATE_DAGGERS_ABILITY_IMPEDING_STAB_DAMAGE.get().floatValue();
    }
}