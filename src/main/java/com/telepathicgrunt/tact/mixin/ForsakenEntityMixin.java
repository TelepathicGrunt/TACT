package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.ForsakenEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.TremorsaurusEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ForsakenEntity.class)
public abstract class ForsakenEntityMixin extends LivingEntity {

    protected ForsakenEntityMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @ModifyConstant(method = "getSonicDamageAgainst(Lnet/minecraft/world/entity/LivingEntity;)F",
            constant = {@Constant(floatValue = 45.0F)},
            remap = false)
    private float tact_forsakenWeakTaggedSonicBoomDamaging(float damage) {
        return Config.FORSAKEN_SONIC_BOOM_WEAK_TAGGED_ATTACK_DAMAGE.get().floatValue();
    }

    @ModifyConstant(method = "getSonicDamageAgainst(Lnet/minecraft/world/entity/LivingEntity;)F",
            constant = {@Constant(floatValue = 4.0F)},
            remap = false)
    private float tact_forsakenNormalSonicBoomDamaging(float damage) {
        return Config.FORSAKEN_SONIC_BOOM_NORMAL_ATTACK_DAMAGE.get().floatValue();
    }
}