package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.WaterBoltEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterBoltEntity.class)
public abstract class WaterBoltEntityMixin {

    @ModifyConstant(method = "damageMobs()V",
            constant = {@Constant(floatValue = 3.0F, ordinal = 0)},
            remap = false)
    private float tact_configurableWaterBoltDamage(float original) {
        if (((WaterBoltEntity) (Object) this).getOwner() instanceof Player) {
            return Config.WATER_BOLT_PLAYER_OWNER_DAMAGE.get().floatValue();
        } else {
            return Config.WATER_BOLT_MOB_OWNER_DAMAGE.get().floatValue();
        }
    }
}