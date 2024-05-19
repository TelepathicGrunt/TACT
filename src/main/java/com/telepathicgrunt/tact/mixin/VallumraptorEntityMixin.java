package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.VallumraptorEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(VallumraptorEntity.class)
public class VallumraptorEntityMixin {

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 2),
            require = 0)
    private double tact_elderMaxHealth1(double maxHealth) {
        return Config.VALLUMRAPTOR_MAX_HEALTH.get() * (4d / 3d);
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/VallumraptorEntity;heal(F)V", ordinal = 0),
            require = 0)
    private float tact_elderHeal1(float healAmount) {
        return (float) (Config.VALLUMRAPTOR_MAX_HEALTH.get() * (4d / 3d));
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 4),
            require = 0)
    private double tact_elderMaxHealth2(double maxHealth) {
        return Config.VALLUMRAPTOR_MAX_HEALTH.get() * (7d / 6d);
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/VallumraptorEntity;heal(F)V", ordinal = 1),
            require = 0)
    private float tact_elderHeal2(float healAmount) {
        return (float) (Config.VALLUMRAPTOR_MAX_HEALTH.get() * (7d / 6d));
    }
}