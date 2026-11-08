package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.SpinningPeppermintEntity;
import com.github.alexmodguy.alexscaves.server.entity.item.WaterBoltEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SpinningPeppermintEntity.class)
public abstract class SpinningPeppermintEntityMixin {

    @ModifyConstant(method = "hurtEntities()V",
            constant = {@Constant(floatValue = 3.0F, ordinal = 0)},
            remap = false)
    private float tact_configurableSpinningPeppermintDamage(float original) {
        if (((SpinningPeppermintEntity) (Object) this).getOwner() instanceof Player) {
            return Config.SPINNING_PEPPERMINT_PLAYER_OWNER_DAMAGE.get().floatValue();
        } else {
            return Config.SPINNING_PEPPERMINT_MOB_OWNER_DAMAGE.get().floatValue();
        }
    }
}