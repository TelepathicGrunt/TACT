package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.FerrouslimeEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.VallumraptorEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(FerrouslimeEntity.class)
public abstract class FerrouslimeEntityMixin {

    @Shadow
    public abstract int getHeadCount();

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 0),
            require = 0)
    private double tact_headMaxHealth(double maxHealth) {
        double baseHealth = Config.ferrouslimeMaxHealth;
        return Mth.clamp(this.getHeadCount() * baseHealth, baseHealth, baseHealth * 10);
    }

    @ModifyArg(method = "tick()V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;setBaseValue(D)V", ordinal = 1),
            require = 0)
    private double tact_headAttackDamage(double attackDamage) {
        double baseAttackDamage = Config.ferrouslimeAttackDamage;
        return Mth.clamp(this.getHeadCount() * baseAttackDamage, baseAttackDamage, baseAttackDamage * 5);
    }
}