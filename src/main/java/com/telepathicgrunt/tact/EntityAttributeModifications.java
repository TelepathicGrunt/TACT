package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.entity.ACEntityRegistry;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ConfigTracker;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Optional;

public class EntityAttributeModifications {

    public static void AttributeModifications(EntityAttributeModificationEvent event) {
        loadTACTConfigsEarly();

        event.add(ACEntityRegistry.ATLATITAN.get(), Attributes.MAX_HEALTH, Config.ATLATITAN_MAX_HEALTH.get());
        event.add(ACEntityRegistry.ATLATITAN.get(), Attributes.ATTACK_DAMAGE, Config.ATLATITAN_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.ATLATITAN.get(), Attributes.ARMOR, Config.ATLATITAN_ARMOR.get());

        event.add(ACEntityRegistry.BOUNDROID.get(), Attributes.MAX_HEALTH, Config.BOUNDROID_MAX_HEALTH.get());
        event.add(ACEntityRegistry.BOUNDROID.get(), Attributes.ATTACK_DAMAGE, Config.BOUNDROID_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.BOUNDROID.get(), Attributes.ARMOR, Config.BOUNDROID_ARMOR.get());

        event.add(ACEntityRegistry.BOUNDROID_WINCH.get(), Attributes.MAX_HEALTH, Config.BOUNDROID_WINCH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.BOUNDROID_WINCH.get(), Attributes.ARMOR, Config.BOUNDROID_WINCH_ARMOR.get());

        event.add(ACEntityRegistry.BRAINIAC.get(), Attributes.MAX_HEALTH, Config.BRAINIAC_MAX_HEALTH.get());
        event.add(ACEntityRegistry.BRAINIAC.get(), Attributes.ATTACK_DAMAGE, Config.BRAINIAC_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.BRAINIAC.get(), Attributes.ARMOR, Config.BRAINIAC_ARMOR.get());

        event.add(ACEntityRegistry.CANDICORN.get(), Attributes.MAX_HEALTH, Config.CANDICORN_MAX_HEALTH.get());
        event.add(ACEntityRegistry.CANDICORN.get(), Attributes.ATTACK_DAMAGE, Config.CANDICORN_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.CANIAC.get(), Attributes.MAX_HEALTH, Config.CANIAC_MAX_HEALTH.get());
        event.add(ACEntityRegistry.CANIAC.get(), Attributes.ATTACK_DAMAGE, Config.CANIAC_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.CARAMEL_CUBE.get(), Attributes.MAX_HEALTH, Config.CARAMEL_CUBE_MAX_HEALTH.get());
        event.add(ACEntityRegistry.CARAMEL_CUBE.get(), Attributes.ATTACK_DAMAGE, Config.CARAMEL_CUBE_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.CORRODENT.get(), Attributes.MAX_HEALTH, Config.CORRODENT_MAX_HEALTH.get());
        event.add(ACEntityRegistry.CORRODENT.get(), Attributes.ATTACK_DAMAGE, Config.CORRODENT_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.CORRODENT.get(), Attributes.ARMOR, Config.BOUNDROID_ARMOR.get());

        event.add(ACEntityRegistry.DEEP_ONE.get(), Attributes.MAX_HEALTH, Config.DEEP_ONE_MAX_HEALTH.get());
        event.add(ACEntityRegistry.DEEP_ONE.get(), Attributes.ATTACK_DAMAGE, Config.DEEP_ONE_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.DEEP_ONE.get(), Attributes.ARMOR, Config.DEEP_ONE_ARMOR.get());

        event.add(ACEntityRegistry.DEEP_ONE_KNIGHT.get(), Attributes.MAX_HEALTH, Config.DEEP_ONE_KNIGHT_MAX_HEALTH.get());
        event.add(ACEntityRegistry.DEEP_ONE_KNIGHT.get(), Attributes.ATTACK_DAMAGE, Config.DEEP_ONE_KNIGHT_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.DEEP_ONE_KNIGHT.get(), Attributes.ARMOR, Config.DEEP_ONE_KNIGHT_ARMOR.get());

        event.add(ACEntityRegistry.DEEP_ONE_MAGE.get(), Attributes.MAX_HEALTH, Config.DEEP_ONE_MAGE_MAX_HEALTH.get());
        event.add(ACEntityRegistry.DEEP_ONE_MAGE.get(), Attributes.ATTACK_DAMAGE, Config.DEEP_ONE_MAGE_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.DEEP_ONE_MAGE.get(), Attributes.ARMOR, Config.DEEP_ONE_MAGE_ARMOR.get());

        event.add(ACEntityRegistry.FERROUSLIME.get(), Attributes.MAX_HEALTH, Config.FERROUSLIME_MAX_HEALTH.get());
        event.add(ACEntityRegistry.FERROUSLIME.get(), Attributes.ATTACK_DAMAGE, Config.FERROUSLIME_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.FERROUSLIME.get(), Attributes.ARMOR, Config.FERROUSLIME_ARMOR.get());

        event.add(ACEntityRegistry.FORSAKEN.get(), Attributes.MAX_HEALTH, Config.FORSAKEN_MAX_HEALTH.get());
        event.add(ACEntityRegistry.FORSAKEN.get(), Attributes.ATTACK_DAMAGE, Config.FORSAKEN_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.FORSAKEN.get(), Attributes.ARMOR, Config.FORSAKEN_ARMOR.get());

        event.add(ACEntityRegistry.GAMMAROACH.get(), Attributes.MAX_HEALTH, Config.GAMMAROACH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GAMMAROACH.get(), Attributes.ATTACK_DAMAGE, Config.GAMMAROACH_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.GAMMAROACH.get(), Attributes.ARMOR, Config.GAMMAROACH_ARMOR.get());

        event.add(ACEntityRegistry.GINGERBREAD_MAN.get(), Attributes.MAX_HEALTH, Config.GINGERBREAD_MAN_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GINGERBREAD_MAN.get(), Attributes.ATTACK_DAMAGE, Config.GINGERBREAD_MAN_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.GLOOMOTH.get(), Attributes.MAX_HEALTH, Config.GLOOMOTH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GLOOMOTH.get(), Attributes.ARMOR, Config.GLOOMOTH_ARMOR.get());

        event.add(ACEntityRegistry.GOSSAMER_WORM.get(), Attributes.MAX_HEALTH, Config.GOSSAMER_WORM_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GOSSAMER_WORM.get(), Attributes.ARMOR, Config.GOSSAMER_WORM_ARMOR.get());

        event.add(ACEntityRegistry.GROTTOCERATOPS.get(), Attributes.MAX_HEALTH, Config.GROTTOCERATOPS_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GROTTOCERATOPS.get(), Attributes.ATTACK_DAMAGE, Config.GROTTOCERATOPS_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.GROTTOCERATOPS.get(), Attributes.ARMOR, Config.GROTTOCERATOPS_ARMOR.get());

        event.add(ACEntityRegistry.GUMBEEPER.get(), Attributes.MAX_HEALTH, Config.GUMBEEPER_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GUMBEEPER.get(), Attributes.ATTACK_DAMAGE, Config.GUMBEEPER_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.GUMBEEPER.get(), Attributes.ARMOR, Config.GUMBEEPER_ARMOR.get());

        event.add(ACEntityRegistry.GUMMY_BEAR.get(), Attributes.MAX_HEALTH, Config.GUMMY_BEAR_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GUMMY_BEAR.get(), Attributes.ATTACK_DAMAGE, Config.GUMMY_BEAR_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.GUM_WORM.get(), Attributes.MAX_HEALTH, Config.GUM_WORM_MAX_HEALTH.get());
        event.add(ACEntityRegistry.GUM_WORM.get(), Attributes.ATTACK_DAMAGE, Config.GUM_WORM_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.GUM_WORM.get(), Attributes.ARMOR, Config.GUM_WORM_ARMOR.get());

        event.add(ACEntityRegistry.HULLBREAKER.get(), Attributes.MAX_HEALTH, Config.HULLBREAKER_MAX_HEALTH.get());
        event.add(ACEntityRegistry.HULLBREAKER.get(), Attributes.ATTACK_DAMAGE, Config.HULLBREAKER_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.HULLBREAKER.get(), Attributes.ARMOR, Config.HULLBREAKER_ARMOR.get());

        event.add(ACEntityRegistry.LANTERNFISH.get(), Attributes.MAX_HEALTH, Config.LANTERNFISH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.LANTERNFISH.get(), Attributes.ARMOR, Config.LANTERNFISH_ARMOR.get());

        event.add(ACEntityRegistry.LICOWITCH.get(), Attributes.MAX_HEALTH, Config.LICOWITCH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.LICOWITCH.get(), Attributes.ATTACK_DAMAGE, Config.LICOWITCH_ATTACK_DAMAGE.get());

        event.add(ACEntityRegistry.LUXTRUCTOSAURUS.get(), Attributes.MAX_HEALTH, Config.LUXTRUCTOSAURUS_MAX_HEALTH.get());
        event.add(ACEntityRegistry.LUXTRUCTOSAURUS.get(), Attributes.ATTACK_DAMAGE, Config.LUXTRUCTOSAURUS_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.LUXTRUCTOSAURUS.get(), Attributes.ARMOR, Config.LUXTRUCTOSAURUS_ARMOR.get());

        event.add(ACEntityRegistry.MAGNETRON.get(), Attributes.MAX_HEALTH, Config.MAGNETRON_MAX_HEALTH.get());
        event.add(ACEntityRegistry.MAGNETRON.get(), Attributes.ATTACK_DAMAGE, Config.MAGNETRON_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.MAGNETRON.get(), Attributes.ARMOR, Config.MAGNETRON_ARMOR.get());

        event.add(ACEntityRegistry.MINE_GUARDIAN.get(), Attributes.MAX_HEALTH, Config.MINE_GUARDIAN_MAX_HEALTH.get());
        event.add(ACEntityRegistry.MINE_GUARDIAN.get(), Attributes.ATTACK_DAMAGE, Config.MINE_GUARDIAN_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.MINE_GUARDIAN.get(), Attributes.ARMOR, Config.MINE_GUARDIAN_ARMOR.get());

        event.add(ACEntityRegistry.NOTOR.get(), Attributes.MAX_HEALTH, Config.NOTOR_MAX_HEALTH.get());
        event.add(ACEntityRegistry.NOTOR.get(), Attributes.ARMOR, Config.NOTOR_ARMOR.get());

        event.add(ACEntityRegistry.NUCLEEPER.get(), Attributes.MAX_HEALTH, Config.NUCLEEPER_MAX_HEALTH.get());
        event.add(ACEntityRegistry.NUCLEEPER.get(), Attributes.ARMOR, Config.NUCLEEPER_ARMOR.get());

        event.add(ACEntityRegistry.RADGILL.get(), Attributes.MAX_HEALTH, Config.RADGILL_MAX_HEALTH.get());
        event.add(ACEntityRegistry.RADGILL.get(), Attributes.ARMOR, Config.RADGILL_ARMOR.get());

        event.add(ACEntityRegistry.RAYCAT.get(), Attributes.MAX_HEALTH, Config.RAYCAT_MAX_HEALTH.get());
        event.add(ACEntityRegistry.RAYCAT.get(), Attributes.ATTACK_DAMAGE, Config.RAYCAT_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.RAYCAT.get(), Attributes.ARMOR, Config.RAYCAT_ARMOR.get());

        event.add(ACEntityRegistry.RELICHEIRUS.get(), Attributes.MAX_HEALTH, Config.RELICHEIRUS_MAX_HEALTH.get());
        event.add(ACEntityRegistry.RELICHEIRUS.get(), Attributes.ATTACK_DAMAGE, Config.RELICHEIRUS_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.RELICHEIRUS.get(), Attributes.ARMOR, Config.RELICHEIRUS_ARMOR.get());

        event.add(ACEntityRegistry.SEA_PIG.get(), Attributes.MAX_HEALTH, Config.SEA_PIG_MAX_HEALTH.get());
        event.add(ACEntityRegistry.SEA_PIG.get(), Attributes.ARMOR, Config.SEA_PIG_ARMOR.get());

        event.add(ACEntityRegistry.SUBTERRANODON.get(), Attributes.MAX_HEALTH, Config.SUBTERRANODON_MAX_HEALTH.get());
        event.add(ACEntityRegistry.SUBTERRANODON.get(), Attributes.ATTACK_DAMAGE, Config.SUBTERRANODON_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.SUBTERRANODON.get(), Attributes.ARMOR, Config.SUBTERRANODON_ARMOR.get());

        event.add(ACEntityRegistry.SWEETISH_FISH.get(), Attributes.MAX_HEALTH, Config.SUBTERRANODON_MAX_HEALTH.get());

        event.add(ACEntityRegistry.TELETOR.get(), Attributes.MAX_HEALTH, Config.TELETOR_MAX_HEALTH.get());
        event.add(ACEntityRegistry.TELETOR.get(), Attributes.ATTACK_DAMAGE, Config.TELETOR_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.TELETOR.get(), Attributes.ARMOR, Config.TELETOR_ARMOR.get());

        event.add(ACEntityRegistry.TREMORSAURUS.get(), Attributes.MAX_HEALTH, Config.TREMORSAURUS_MAX_HEALTH.get());
        event.add(ACEntityRegistry.TREMORSAURUS.get(), Attributes.ATTACK_DAMAGE, Config.TREMORSAURUS_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.TREMORSAURUS.get(), Attributes.ARMOR, Config.TREMORSAURUS_ARMOR.get());

        event.add(ACEntityRegistry.TREMORZILLA.get(), Attributes.MAX_HEALTH, Config.TREMORZILLA_MAX_HEALTH.get());
        event.add(ACEntityRegistry.TREMORZILLA.get(), Attributes.ARMOR, Config.TREMORZILLA_ARMOR.get());

        event.add(ACEntityRegistry.TRILOCARIS.get(), Attributes.MAX_HEALTH, Config.TRILOCARIS_MAX_HEALTH.get());
        event.add(ACEntityRegistry.TRILOCARIS.get(), Attributes.ATTACK_DAMAGE, Config.TRILOCARIS_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.TRILOCARIS.get(), Attributes.ARMOR, Config.TRILOCARIS_ARMOR.get());

        event.add(ACEntityRegistry.TRIPODFISH.get(), Attributes.MAX_HEALTH, Config.TRIPODFISH_MAX_HEALTH.get());
        event.add(ACEntityRegistry.TRIPODFISH.get(), Attributes.ARMOR, Config.TRIPODFISH_ARMOR.get());

        event.add(ACEntityRegistry.UNDERZEALOT.get(), Attributes.MAX_HEALTH, Config.UNDERZEALOT_MAX_HEALTH.get());
        event.add(ACEntityRegistry.UNDERZEALOT.get(), Attributes.ATTACK_DAMAGE, Config.UNDERZEALOT_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.UNDERZEALOT.get(), Attributes.ARMOR, Config.UNDERZEALOT_ARMOR.get());

        event.add(ACEntityRegistry.VALLUMRAPTOR.get(), Attributes.MAX_HEALTH, Config.VALLUMRAPTOR_MAX_HEALTH.get());
        event.add(ACEntityRegistry.VALLUMRAPTOR.get(), Attributes.ATTACK_DAMAGE, Config.VALLUMRAPTOR_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.VALLUMRAPTOR.get(), Attributes.ARMOR, Config.VALLUMRAPTOR_ARMOR.get());

        event.add(ACEntityRegistry.VESPER.get(), Attributes.MAX_HEALTH, Config.VESPER_MAX_HEALTH.get());
        event.add(ACEntityRegistry.VESPER.get(), Attributes.ATTACK_DAMAGE, Config.VESPER_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.VESPER.get(), Attributes.ARMOR, Config.VESPER_ARMOR.get());

        event.add(ACEntityRegistry.WATCHER.get(), Attributes.MAX_HEALTH, Config.WATCHER_MAX_HEALTH.get());
        event.add(ACEntityRegistry.WATCHER.get(), Attributes.ATTACK_DAMAGE, Config.WATCHER_ATTACK_DAMAGE.get());
        event.add(ACEntityRegistry.WATCHER.get(), Attributes.ARMOR, Config.WATCHER_ARMOR.get());

    }

    private static void loadTACTConfigsEarly() {
        Optional<? extends ModContainer> modContainerById = ModList.get().getModContainerById(TACT.MODID);
        modContainerById.ifPresent(container -> {
            ConfigTracker.INSTANCE.configSets()
                    .get(ModConfig.Type.COMMON)
                    .forEach(c -> {
                        if (c.getFileName().equals("tact-common.toml")) {
                            try {
                                Method method = ConfigTracker.INSTANCE.getClass().getDeclaredMethod("openConfig", ModConfig.class, Path.class);
                                method.setAccessible(true);
                                method.invoke(ConfigTracker.INSTANCE, c, FMLPaths.CONFIGDIR.get());
                                method.setAccessible(false);
                            }
                            catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });
        });
    }
}
