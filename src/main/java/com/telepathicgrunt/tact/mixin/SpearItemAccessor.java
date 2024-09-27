package com.telepathicgrunt.tact.mixin;

import com.github.alexmodguy.alexscaves.server.item.SpearItem;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SpearItem.class)
public interface SpearItemAccessor {
    @Mutable
    @Accessor
    void setDefaultModifiers(Multimap<Attribute, AttributeModifier> defaultModifiers);
}
