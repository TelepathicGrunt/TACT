package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.item.WaveEntity;
import com.telepathicgrunt.tact.Config;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(WaveEntity.class)
public abstract class WaveEntityMixin {

    @ModifyArg(method = "tick()V",
        at = @At(value = "INVOKE", target = "Lcom/github/alexmodguy/alexscaves/server/entity/item/WaveEntity;attackEntities(F)V", ordinal = 0, remap = false)
    )
    private float tact_configurableWaveEntityDamageScaling(float original) {
        if (((WaveEntity) (Object) this).getOwner() instanceof Player) {
            return original * Config.WAVE_ENTITY_PLAYER_OWNER_DAMAGE.get().floatValue();
        } else {
            return original * Config.WAVE_ENTITY_MOB_OWNER_DAMAGE.get().floatValue();
        }
    }
}