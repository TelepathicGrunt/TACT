package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.DarknessArmorItem;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.effect.MobEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DarknessArmorItem.class)
public abstract class DarknessArmorItemMixin {

    @ModifyConstant(method = "getMeterProgress(Lnet/minecraft/world/item/ItemStack;)F",
            constant = @Constant(floatValue = 1000),
            require = 0, remap = false)
    private static float tact_cloakOfDarknessRechargeTime1(float originalCharge) {
        return Config.cloakOfDarknessTicksTillRecharged;
    }

    @ModifyConstant(method = "onArmorTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;)V",
            constant = @Constant(intValue = 1000),
            require = 0, remap = false)
    private int tact_cloakOfDarknessRechargeTime2(int originalCharge) {
        return Config.cloakOfDarknessTicksTillRecharged;
    }

    @ModifyArg(method = "onKeyPacket(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;I)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)Z", ordinal = 0),
            require = 0)
    private MobEffectInstance tact_cloakOfDarknessFlightTime(MobEffectInstance mobEffectInstance) {
        ((MobEffectInstanceAccessor)mobEffectInstance).setDuration(Config.cloakOfDarknessTickLength);
        return mobEffectInstance;
    }
}