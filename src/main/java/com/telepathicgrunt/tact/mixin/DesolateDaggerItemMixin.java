package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.DesolateDaggerEntity;
import com.github.alexmodguy.alexscaves.server.item.DesolateDaggerItem;
import com.github.alexmodguy.alexscaves.server.item.DreadbowItem;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.Config;
import com.telepathicgrunt.tact.DreadbowRainAttackModification;
import com.telepathicgrunt.tact.TACT;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DesolateDaggerItem.class)
public abstract class DesolateDaggerItemMixin {

    @Inject(
            method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z")
    )
    private void tact_desolateDaggerAbilityDelay(CallbackInfoReturnable<Boolean> cir, @Local(ordinal = 0) DesolateDaggerEntity daggerEntity) {
        daggerEntity.orbitFor = (int) (daggerEntity.orbitFor * Config.DESOLATE_DAGGERS_ABILITY_DELAY_MULTIPLIER.get());
    }
}