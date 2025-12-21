package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.event.CommonEvents;
import net.minecraftforge.event.entity.EntityEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CommonEvents.class, remap = false)
public abstract class ResizeEventFixMixin {

    @Inject(method = "resizeEntity(Lnet/minecraftforge/event/entity/EntityEvent$Size;)V",
            at = @At(value = "HEAD"),
            cancellable = true,
            remap = false)
    private void tact_configurableBiomeTreatEating(EntityEvent.Size event, CallbackInfo ci) {
        ci.cancel();
    }
}