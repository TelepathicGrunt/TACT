package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.MagnetronEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.VallumraptorEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MagnetronEntity.class)
public class MagnetronEntityMixin {

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 0),
            require = 0)
    private double tact_formedMaxHealth(double maxHealth) {
        return Config.MAGNETRON_MAX_HEALTH.get() * (5d / 3d);
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/MagnetronEntity;heal(F)V", ordinal = 0),
            require = 0)
    private float tact_formedHeal(float healAmount) {
        return (float) (Config.MAGNETRON_MAX_HEALTH.get() * (5d / 3d));
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 2),
            require = 0)
    private double tact_notFormedMaxHealth(double maxHealth) {
        return Config.MAGNETRON_MAX_HEALTH.get();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/MagnetronEntity;heal(F)V", ordinal = 1),
            require = 0)
    private float tact_notFormedHeal(float healAmount) {
        return Config.MAGNETRON_MAX_HEALTH.get().floatValue();
    }
}