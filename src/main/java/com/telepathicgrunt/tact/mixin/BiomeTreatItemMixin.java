package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.BiomeTreatItem;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(BiomeTreatItem.class)
public abstract class BiomeTreatItemMixin {

    @WrapOperation(method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResultHolder;",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;canEat(Z)Z", ordinal = 0),
            require = 0)
    private boolean tact_configurableBiomeTreatEating(Player instance, boolean alwaysEat, Operation<Boolean> original) {
        if (Config.CAN_EAT_BIOME_TREAT_WHEN_NOT_HUNGRY.get()) {
            return true;
        }

        return original.call(instance, alwaysEat);
    }
}