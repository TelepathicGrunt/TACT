package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import com.telepathicgrunt.tact.mixin.MobEffectInstanceAccessor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ItemModifications {

    static void stunEffectAdjustment(final MobEffectEvent.Added event) {
        LivingEntity affectedEntity = event.getEntity();
        if (affectedEntity == null || affectedEntity.level().isClientSide()) {
            return;
        }

        MobEffectInstance currentEffect = event.getEffectInstance();
        if (currentEffect.getEffect() == ACEffectRegistry.STUNNED.get() && affectedEntity.getLastAttacker() != null) {
            LivingEntity attacker = affectedEntity.getLastAttacker();
            ItemStack usedItem = attacker.getMainHandItem();

            if (usedItem.is(ACItemRegistry.PRIMITIVE_CLUB.get())) {
                int extraTime = Config.PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME.get() == 0 ?
                        0 : affectedEntity.getRandom().nextInt(Config.PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME.get());

                ((MobEffectInstanceAccessor)currentEffect).setDuration(Config.PRIMITIVE_CLUB_BASE_STUN_TIME.get() + extraTime);
            }
        }
    }
}
