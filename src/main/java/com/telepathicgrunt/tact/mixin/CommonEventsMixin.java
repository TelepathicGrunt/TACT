package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.event.CommonEvents;
import com.github.alexmodguy.alexscaves.server.item.DarknessArmorItem;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CommonEvents.class)
public abstract class CommonEventsMixin {

    @WrapOperation(method = "livingTick(Lnet/minecraftforge/event/entity/living/LivingEvent$LivingTickEvent;)V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/potion/DarknessIncarnateEffect;isInLight(Lnet/minecraft/world/entity/LivingEntity;I)Z", ordinal = 0, remap = false),
            require = 0, remap = false)
    private boolean tact_configurableDarknessCloakAbilityInLight2(LivingEntity living, int threshold, Operation<Boolean> original) {
        if (Config.allowedCloakOfDarknessAbilityInLight) {
            return false;
        }
        return original.call(living, threshold);
    }
}