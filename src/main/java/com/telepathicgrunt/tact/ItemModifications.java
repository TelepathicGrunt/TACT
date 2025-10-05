package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.telepathicgrunt.tact.mixin.ItemAccessor;
import com.telepathicgrunt.tact.mixin.MobEffectInstanceAccessor;
import com.telepathicgrunt.tact.mixin.SpearItemAccessor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.Map;

public class ItemModifications {
    public static TagKey<Item> RADIOACTIVE_AND_ACID_RESISTANT_ARMOR_TAG = TagKey.create(Registries.ITEM, new ResourceLocation(TACT.MODID, "radioactive_and_acid_resistant_armor"));

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

    static void doItemAttributeModifications(final FMLCommonSetupEvent event) {
        Multimap<Attribute, AttributeModifier> extinctionSpearAttributes = ACItemRegistry.EXTINCTION_SPEAR.get().getDefaultAttributeModifiers(EquipmentSlot.MAINHAND);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        for (Map.Entry<Attribute, AttributeModifier> modifier : extinctionSpearAttributes.entries()) {
            if (modifier.getKey() == Attributes.ATTACK_DAMAGE && modifier.getValue().getId().equals(ItemAccessor.getBASE_ATTACK_DAMAGE_UUID())) {
                builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ItemAccessor.getBASE_ATTACK_DAMAGE_UUID(), "Tool modifier", Config.EXTINCTION_SPEAR_MELEE_DAMAGE.get().floatValue(), AttributeModifier.Operation.ADDITION));
            }
            else {
                builder.put(modifier);
            }
        }
        ((SpearItemAccessor)ACItemRegistry.EXTINCTION_SPEAR.get()).setDefaultModifiers(builder.build());
    }

    public static int howManyEquippedRadioactiveOrAcidResistantArmorOnEntity(final LivingEntity entity) {
        int resistantArmor = 0;
        if (entity.getItemBySlot(EquipmentSlot.HEAD).is(RADIOACTIVE_AND_ACID_RESISTANT_ARMOR_TAG)) {
            ++resistantArmor;
        }

        if (entity.getItemBySlot(EquipmentSlot.CHEST).is(RADIOACTIVE_AND_ACID_RESISTANT_ARMOR_TAG)) {
            ++resistantArmor;
        }

        if (entity.getItemBySlot(EquipmentSlot.LEGS).is(RADIOACTIVE_AND_ACID_RESISTANT_ARMOR_TAG)) {
            ++resistantArmor;
        }

        if (entity.getItemBySlot(EquipmentSlot.FEET).is(RADIOACTIVE_AND_ACID_RESISTANT_ARMOR_TAG)) {
            ++resistantArmor;
        }

        return resistantArmor;
    }
}
