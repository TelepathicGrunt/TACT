package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.ForsakenEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.LuxtructosaurusEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LuxtructosaurusEntity.class)
public abstract class LuxtructosaurusEntityMixin extends LivingEntity {

    protected LuxtructosaurusEntityMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @ModifyArg(method = "burnWithBreath(F)V",
            at = @At(value = "INVOKE",
                    target = "Lcom/github/alexmodguy/alexscaves/server/entity/living/LuxtructosaurusEntity;hurtEntitiesAround(Lnet/minecraft/world/phys/Vec3;FFFZZ)Z",
                    ordinal = 0,
                    remap = false),
            remap = false,
            require = 0,
            index = 2)
    private float tact_tremorzillaScratchDamaging(float damage) {
        return Config.LUXTRUCTOSAURUS_FIRE_BREATH_ATTACK_DAMAGE.get().floatValue();
    }
}