package com.telepathicgrunt.tact;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.Map;

public class DreadbowRainAttackModification {
    public static final Map<Item, Integer> DREADBOW_OVERRIDES = new Object2IntOpenHashMap<>();

    public static void setDreadbowOverrides(String configOverrides) {
        DREADBOW_OVERRIDES.clear();
        if (configOverrides.trim().isEmpty()) {
            return;
        }

        String[] overrideEntries = configOverrides.trim().split(",");
        for (String entry : overrideEntries) {
            try {
                BuiltInRegistries.ITEM.getOptional(new ResourceLocation(entry.trim().split("=")[0]))
                        .ifPresent(item -> DREADBOW_OVERRIDES.put(item, Integer.parseInt(entry.trim().split("=")[1])));
            }
            catch (Exception e) {
                TACT.LOGGER.error("Invalid dreadbowArrowRainOverrides entry found: {}\n" +
                    "   This should be in format of namespace:path=arrowamount. Multiple entries separated by comma.",
                    entry);
            }
        }
    }
}
