package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.TremorzillaEntity;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TremorzillaEntity.class)
public abstract class TremorzillaEntityMixin extends LivingEntity {

    protected TremorzillaEntityMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;stompEffect(ZFFFF)V",
                    ordinal = 0,
                    remap = false),
            require = 0,
            index = 4)
    private float tact_tremorzillaWeakStompDamaging(float damage) {
        return Config.TREMORZILLA_WEAK_STOMP_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;stompEffect(ZFFFF)V",
                    ordinal = 1,
                    remap = false),
            require = 0,
            index = 4)
    private float tact_tremorzillaStrongStompDamaging(float damage) {
        return Config.TREMORZILLA_STRONG_STOMP_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 0,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaScratchDamaging(float damage) {
        return Config.TREMORZILLA_SCRATCH_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 1,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaTailDamaging1(float damage) {
        return Config.TREMORZILLA_TAIL_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 2,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaTailDamaging2(float damage) {
        return Config.TREMORZILLA_TAIL_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 3,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaTailDamaging3(float damage) {
        return Config.TREMORZILLA_TAIL_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 4,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaTailDamaging4(float damage) {
        return Config.TREMORZILLA_TAIL_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 5,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaTailDamaging5(float damage) {
        return Config.TREMORZILLA_TAIL_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 6,
                    remap = false),
            require = 0,
            index = 2)
    private float tact_tremorzillaBiteDamaging(float damage) {
        return Config.TREMORZILLA_BITE_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tickBreath()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 0,
                    remap = false),
            require = 0,
            index = 2,
            remap = false)
    private float tact_tremorzillaBeamDamaging1(float damage) {
        return Config.TREMORZILLA_BEAM_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tickBreath()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZZ)Z",
                    ordinal = 1,
                    remap = false),
            require = 0,
            index = 2,
            remap = false)
    private float tact_tremorzillaBeamDamaging2(float damage) {
        return Config.TREMORZILLA_BEAM_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 0,
                    remap = false),
            index = 0)
    private int tact_tremorzillaLowHealthRate(int tick) {
        return Config.TREMORZILLA_LOW_HEALTH_RECOVERY_RATE_IN_TICKS.get();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 0,
                    remap = false),
            index = 1)
    private float tact_tremorzillaLowHealthAmount(float health) {
        return Config.TREMORZILLA_LOW_HEALTH_RECOVERY_AMOUNT.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 1,
                    remap = false),
            index = 0)
    private int tact_tremorzillaMediumHealthRate(int tick) {
        return Config.TREMORZILLA_MEDIUM_HEALTH_RECOVERY_RATE_IN_TICKS.get();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 1,
                    remap = false),
            index = 1)
    private float tact_tremorzillaMediumHealthAmount(float health) {
        return Config.TREMORZILLA_MEDIUM_HEALTH_RECOVERY_AMOUNT.get().floatValue();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 2,
                    remap = false),
            index = 0)
    private int tact_tremorzillaHighHealthRate(int tick) {
        return Config.TREMORZILLA_HIGH_HEALTH_RECOVERY_RATE_IN_TICKS.get();
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/TremorzillaEntity;healEveryTick(IF)V",
                    ordinal = 2,
                    remap = false),
            index = 1)
    private float tact_tremorzillaHighHealthAmount(float health) {
        return Config.TREMORZILLA_HIGH_HEALTH_RECOVERY_AMOUNT.get().floatValue();
    }

    @ModifyReturnValue(method = "getStepHeight()F",
            at = @At(value = "RETURN"),
            remap = false)
    private float tact_tremorzillaStepHeight(float stepHeight) {
        return Config.TREMORZILLA_STEP_HEIGHT.get().floatValue();
    }

    @Inject(method = "breakBlocksInBoundingBox(F)Z",
            at = @At(value = "HEAD"),
            cancellable = true,
            remap = false)
    private void tact_tremorzillaStepBlockBreaking(float dropChance, CallbackInfoReturnable<Boolean> cir) {
        if (!Config.TREMORZILLA_WALKING_BLOCK_GRIEFING.get()) {
            cir.setReturnValue(false);
        }
    }
}