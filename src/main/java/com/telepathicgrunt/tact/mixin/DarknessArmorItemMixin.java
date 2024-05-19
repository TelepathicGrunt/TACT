package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.DarknessArmorItem;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DarknessArmorItem.class)
public abstract class DarknessArmorItemMixin {

    @WrapOperation(method = "canChargeUp(Lnet/minecraft/world/entity/LivingEntity;Z)Z",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/potion/DarknessIncarnateEffect;isInLight(Lnet/minecraft/world/entity/LivingEntity;I)Z", ordinal = 0, remap = false),
            require = 0, remap = false)
    private static boolean tact_configurableDarknessCloakAbilityInLight1(LivingEntity living, int threshold, Operation<Boolean> original) {
        if (Config.ALLOWED_CLOAK_OF_DARKNESS_ABILITY_IN_LIGHT.get()) {
            return false;
        }
        return original.call(living, threshold);
    }
}