package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.PrimitiveClubItem;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.telepathicgrunt.tact.DreadbowRainAttackModification;
import com.telepathicgrunt.tact.TACT;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PrimitiveClubItem.class)
public abstract class PrimitiveClubItemMixin {

    @Unique
    private static final TagKey<EntityType<?>> TACT_PRIMITIVE_CLUB_STUN_IMMUNE = TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(TACT.MODID, "primitive_club_stun_immune"));

    @ModifyExpressionValue(method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/util/RandomSource;nextFloat()F", ordinal = 0),
            require = 0)
    private float tact_primitiveClubImmuneTag(float original, @Local(ordinal = 0, argsOnly = true) LivingEntity hurtEntity) {
        if (hurtEntity.getType().is(TACT_PRIMITIVE_CLUB_STUN_IMMUNE)) {
            return 1;
        }
        return original;
    }
}