package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.entity.living.SubterranodonEntity;
import com.github.alexmodguy.alexscaves.server.entity.living.VallumraptorEntity;
import com.telepathicgrunt.tact.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SubterranodonEntity.class)
public class SubterranodonEntityMixin {

    @Shadow(remap = false)
    public float getMeterAmount() {
        throw new RuntimeException("TACT SubterranodonEntityMixin's getMeterAmount not found");
    }

    @ModifyVariable(method = "setMeterAmount(F)V",
            at = @At(value = "HEAD"),
            argsOnly = true,
            remap = false,
            require = 0)
    private float tact_subterranodonFlight(float flightPower) {
        float diff = flightPower - getMeterAmount();
        if (diff > 0) {
            diff *= Config.SUBTERRANODON_FLIGHT_METER_RECHARGE_SPEED.get().floatValue();
        }
        else {
            diff *= Config.SUBTERRANODON_FLIGHT_METER_USAGE_SPEED.get().floatValue();
        }
        return diff + getMeterAmount();
    }
}