package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.DesolateDaggerEntity;
import com.github.alexmodguy.alexscaves.server.item.DesolateDaggerItem;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DesolateDaggerEntity.class)
public abstract class DesolateDaggerEntityMixin {

    @ModifyConstant(method = "tick()V",
            constant = {@Constant(floatValue = 2.0F, ordinal = 0)},
            remap = false)
    private float tact_desolateDaggerAbilityDamage1(float damage) {
        return Config.DESOLATE_DAGGERS_ABILITY_BASE_DAMAGE.get().floatValue();
    }

    @ModifyConstant(method = "tick()V",
            constant = {@Constant(floatValue = 2.0F, ordinal = 1)},
            remap = false)
    private float tact_desolateDaggerAbilityDamage2(float damage) {
        return Config.DESOLATE_DAGGERS_ABILITY_IMPEDING_STAB_DAMAGE.get().floatValue();
    }
}