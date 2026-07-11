package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.ai.LuxtructosaurusMeleeGoal;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LuxtructosaurusMeleeGoal.class)
public abstract class LuxtructosaurusMeleeGoalMixin {

    @ModifyExpressionValue(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/ai/LuxtructosaurusMeleeGoal;canReach(Lnet/minecraft/world/entity/LivingEntity;)Z", ordinal = 0),
            require = 0)
    private boolean tact_luxtructosaurusDisableJump(boolean original) {
        return original || Config.LUXTRUCTOSAURUS_DISABLE_JUMP.get();
    }
}