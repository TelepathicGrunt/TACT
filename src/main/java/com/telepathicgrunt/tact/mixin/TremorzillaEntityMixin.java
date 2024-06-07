package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.TremorsaurusEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.TremorzillaEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

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
}