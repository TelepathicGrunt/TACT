package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.ShotGumItem;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ShotGumItem.class)
public abstract class ShotGumItemMixin {

    @ModifyArg(method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;IZ)V",
            at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/item/GumballEntity;setDamage(F)V", remap = false, ordinal = 0),
            require = 0)
    private float tact_configurableShotGumGumballDamage(float damage) {
        return Config.SHOT_GUM_GUMBALL_DAMAGE.get().floatValue();
    }
}