package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.HazmatArmorItem;
import com.telepathicgrunt.tact.ItemModifications;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HazmatArmorItem.class)
public abstract class HazmatArmorItemMixin {

    @Inject(method = "getWornAmount(Lnet/minecraft/world/entity/LivingEntity;)I",
            at = @At(value = "HEAD"),
            remap = false,
            cancellable = true,
            require = 0)
    private static void tact_taggedRadioactiveAcidResistantArmor(LivingEntity entity, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(ItemModifications.howManyEquippedRadioactiveOrAcidResistantArmorOnEntity(entity));
    }
}