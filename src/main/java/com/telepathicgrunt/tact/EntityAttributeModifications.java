package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.entity.ACEntityRegistry;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

public class EntityAttributeModifications {

    public static void AttributeModifications(EntityAttributeModificationEvent event) {
        event.add(ACEntityRegistry.BOUNDROID.get(), Attributes.MAX_HEALTH, Config.boundroidMaxHealth);
        event.add(ACEntityRegistry.BOUNDROID.get(), Attributes.ATTACK_DAMAGE, Config.boundroidAttackDamage);

        event.add(ACEntityRegistry.BOUNDROID_WINCH.get(), Attributes.MAX_HEALTH, Config.boundroidWrinchMaxHealth);

        event.add(ACEntityRegistry.CORRODENT.get(), Attributes.MAX_HEALTH, Config.corrodentMaxHealth);
        event.add(ACEntityRegistry.CORRODENT.get(), Attributes.ATTACK_DAMAGE, Config.corrodentAttackDamage);

        event.add(ACEntityRegistry.DEEP_ONE.get(), Attributes.MAX_HEALTH, Config.deepOneMaxHealth);
        event.add(ACEntityRegistry.DEEP_ONE.get(), Attributes.ATTACK_DAMAGE, Config.deepOneAttackDamage);

        event.add(ACEntityRegistry.DEEP_ONE_KNIGHT.get(), Attributes.MAX_HEALTH, Config.deepOneKnightMaxHealth);
        event.add(ACEntityRegistry.DEEP_ONE_KNIGHT.get(), Attributes.ATTACK_DAMAGE, Config.deepOneKnightAttackDamage);

        event.add(ACEntityRegistry.DEEP_ONE_MAGE.get(), Attributes.MAX_HEALTH, Config.deepOneMageMaxHealth);
        event.add(ACEntityRegistry.DEEP_ONE_MAGE.get(), Attributes.ATTACK_DAMAGE, Config.deepOneMageAttackDamage);

        event.add(ACEntityRegistry.FERROUSLIME.get(), Attributes.MAX_HEALTH, Config.ferrouslimeMaxHealth);
        event.add(ACEntityRegistry.FERROUSLIME.get(), Attributes.ATTACK_DAMAGE, Config.ferrouslimeAttackDamage);

        event.add(ACEntityRegistry.FORSAKEN.get(), Attributes.MAX_HEALTH, Config.forsakenMaxHealth);
        event.add(ACEntityRegistry.FORSAKEN.get(), Attributes.ATTACK_DAMAGE, Config.forsakenAttackDamage);

        event.add(ACEntityRegistry.GAMMAROACH.get(), Attributes.MAX_HEALTH, Config.gammaroachMaxHealth);
        event.add(ACEntityRegistry.GAMMAROACH.get(), Attributes.ATTACK_DAMAGE, Config.gammaroachAttackDamage);

        event.add(ACEntityRegistry.GLOOMOTH.get(), Attributes.MAX_HEALTH, Config.gloomothMaxHealth);

        event.add(ACEntityRegistry.GOSSAMER_WORM.get(), Attributes.MAX_HEALTH, Config.gossamerWormMaxHealth);

        event.add(ACEntityRegistry.GROTTOCERATOPS.get(), Attributes.MAX_HEALTH, Config.grottoceratopsMaxHealth);
        event.add(ACEntityRegistry.GROTTOCERATOPS.get(), Attributes.ATTACK_DAMAGE, Config.grottoceratopsAttackDamage);

        event.add(ACEntityRegistry.HULLBREAKER.get(), Attributes.MAX_HEALTH, Config.hullbreakerMaxHealth);
        event.add(ACEntityRegistry.HULLBREAKER.get(), Attributes.ATTACK_DAMAGE, Config.hullbreakerAttackDamage);

        event.add(ACEntityRegistry.LANTERNFISH.get(), Attributes.MAX_HEALTH, Config.lanternfishMaxHealth);

        event.add(ACEntityRegistry.MAGNETRON.get(), Attributes.MAX_HEALTH, Config.magnetronMaxHealth);
        event.add(ACEntityRegistry.MAGNETRON.get(), Attributes.ATTACK_DAMAGE, Config.magnetronAttackDamage);

        event.add(ACEntityRegistry.MINE_GUARDIAN.get(), Attributes.MAX_HEALTH, Config.mineGuardianMaxHealth);
        event.add(ACEntityRegistry.MINE_GUARDIAN.get(), Attributes.ATTACK_DAMAGE, Config.mineGuardianAttackDamage);

        event.add(ACEntityRegistry.NOTOR.get(), Attributes.MAX_HEALTH, Config.notorMaxHealth);

        event.add(ACEntityRegistry.NUCLEEPER.get(), Attributes.MAX_HEALTH, Config.nucleeperMaxHealth);

        event.add(ACEntityRegistry.RADGILL.get(), Attributes.MAX_HEALTH, Config.radgillMaxHealth);

        event.add(ACEntityRegistry.RAYCAT.get(), Attributes.MAX_HEALTH, Config.raycatMaxHealth);
        event.add(ACEntityRegistry.RAYCAT.get(), Attributes.ATTACK_DAMAGE, Config.raycatAttackDamage);

        event.add(ACEntityRegistry.RELICHEIRUS.get(), Attributes.MAX_HEALTH, Config.relicheirusMaxHealth);
        event.add(ACEntityRegistry.RELICHEIRUS.get(), Attributes.ATTACK_DAMAGE, Config.relicheirusAttackDamage);

        event.add(ACEntityRegistry.SEA_PIG.get(), Attributes.MAX_HEALTH, Config.seaPigMaxHealth);

        event.add(ACEntityRegistry.SUBTERRANODON.get(), Attributes.MAX_HEALTH, Config.subterranodonMaxHealth);
        event.add(ACEntityRegistry.SUBTERRANODON.get(), Attributes.ATTACK_DAMAGE, Config.subterranodonAttackDamage);

        event.add(ACEntityRegistry.TELETOR.get(), Attributes.MAX_HEALTH, Config.teletorMaxHealth);
        event.add(ACEntityRegistry.TELETOR.get(), Attributes.ATTACK_DAMAGE, Config.teletorAttackDamage);

        event.add(ACEntityRegistry.TREMORSAURUS.get(), Attributes.MAX_HEALTH, Config.tremorsaurusMaxHealth);
        event.add(ACEntityRegistry.TREMORSAURUS.get(), Attributes.ATTACK_DAMAGE, Config.tremorsaurusAttackDamage);

        event.add(ACEntityRegistry.TRILOCARIS.get(), Attributes.MAX_HEALTH, Config.trilocarisMaxHealth);
        event.add(ACEntityRegistry.TRILOCARIS.get(), Attributes.ATTACK_DAMAGE, Config.trilocarisAttackDamage);

        event.add(ACEntityRegistry.TRIPODFISH.get(), Attributes.MAX_HEALTH, Config.tripodfishMaxHealth);

        event.add(ACEntityRegistry.UNDERZEALOT.get(), Attributes.MAX_HEALTH, Config.underzealotMaxHealth);
        event.add(ACEntityRegistry.UNDERZEALOT.get(), Attributes.ATTACK_DAMAGE, Config.underzealotAttackDamage);

        event.add(ACEntityRegistry.VALLUMRAPTOR.get(), Attributes.MAX_HEALTH, Config.vallumraptorMaxHealth);
        event.add(ACEntityRegistry.VALLUMRAPTOR.get(), Attributes.ATTACK_DAMAGE, Config.vallumraptorAttackDamage);

        event.add(ACEntityRegistry.VESPER.get(), Attributes.MAX_HEALTH, Config.vesperMaxHealth);
        event.add(ACEntityRegistry.VESPER.get(), Attributes.ATTACK_DAMAGE, Config.vesperAttackDamage);

        event.add(ACEntityRegistry.WATCHER.get(), Attributes.MAX_HEALTH, Config.watcherMaxHealth);
        event.add(ACEntityRegistry.WATCHER.get(), Attributes.ATTACK_DAMAGE, Config.watcherAttackDamage);
    }
}
