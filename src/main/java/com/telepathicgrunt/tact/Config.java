package com.telepathicgrunt.tact;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class Config {

    static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue APPLY_TAG_ADJUSTMENTS;
    public static final ForgeConfigSpec.BooleanValue APPLY_SPELUNKERY_COMPAT_ADJUSTMENTS;
    public static final ForgeConfigSpec.BooleanValue REPLACEABLE_SMALL_PLANTS;
    public static final ForgeConfigSpec.BooleanValue GUANO_BURN_FUEL;
    public static final ForgeConfigSpec.IntValue PRIMITIVE_CLUB_BASE_STUN_TIME;
    public static final ForgeConfigSpec.IntValue PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME;
    public static final ForgeConfigSpec.BooleanValue RESTORE_END_STORY;
    public static final ForgeConfigSpec.BooleanValue UNLOCK_ALL_COMPENDIUM_INFO;
    public static final ForgeConfigSpec.ConfigValue<String> DREADBOW_ARROW_RAIN_OVERRIDES;
    public static final ForgeConfigSpec.DoubleValue SUBTERRANODON_FLIGHT_METER_RECHARGE_SPEED;
    public static final ForgeConfigSpec.DoubleValue SUBTERRANODON_FLIGHT_METER_USAGE_SPEED;

    public static final ForgeConfigSpec.DoubleValue RAYGUN_NORMAL_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue RAYGUN_GAMMA_DAMAGE;
    public static final ForgeConfigSpec.BooleanValue ALLOWED_CLOAK_OF_DARKNESS_ABILITY_IN_LIGHT;

    public static final ForgeConfigSpec.DoubleValue ATLATITAN_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue ATLATITAN_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue ATLATITAN_ARMOR;
    public static final ForgeConfigSpec.DoubleValue BOUNDROID_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue BOUNDROID_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue BOUNDROID_ARMOR;
    public static final ForgeConfigSpec.DoubleValue BOUNDROID_WINCH_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue BOUNDROID_WINCH_ARMOR;
    public static final ForgeConfigSpec.DoubleValue BRAINIAC_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue BRAINIAC_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue BRAINIAC_ARMOR;
    public static final ForgeConfigSpec.DoubleValue CORRODENT_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue CORRODENT_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue CORRODENT_ARMOR;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_ARMOR;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_KNIGHT_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_KNIGHT_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_KNIGHT_ARMOR;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAGE_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAGE_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAGE_ARMOR;
    public static final ForgeConfigSpec.DoubleValue FERROUSLIME_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue FERROUSLIME_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue FERROUSLIME_ARMOR;
    public static final ForgeConfigSpec.DoubleValue FORSAKEN_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue FORSAKEN_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue FORSAKEN_SONIC_BOOM_NORMAL_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue FORSAKEN_SONIC_BOOM_WEAK_TAGGED_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue FORSAKEN_ARMOR;
    public static final ForgeConfigSpec.DoubleValue GAMMAROACH_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue GAMMAROACH_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue GAMMAROACH_ARMOR;
    public static final ForgeConfigSpec.DoubleValue GLOOMOTH_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue GLOOMOTH_ARMOR;
    public static final ForgeConfigSpec.DoubleValue GOSSAMER_WORM_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue GOSSAMER_WORM_ARMOR;
    public static final ForgeConfigSpec.DoubleValue GROTTOCERATOPS_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue GROTTOCERATOPS_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue GROTTOCERATOPS_ARMOR;
    public static final ForgeConfigSpec.DoubleValue HULLBREAKER_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue HULLBREAKER_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue HULLBREAKER_ARMOR;
    public static final ForgeConfigSpec.DoubleValue LANTERNFISH_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue LANTERNFISH_ARMOR;
    public static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_ARMOR;
    public static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_FIRE_BREATH_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue MAGNETRON_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue MAGNETRON_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue MAGNETRON_ARMOR;
    public static final ForgeConfigSpec.DoubleValue MINE_GUARDIAN_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue MINE_GUARDIAN_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue MINE_GUARDIAN_ARMOR;
    public static final ForgeConfigSpec.DoubleValue NOTOR_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue NOTOR_ARMOR;
    public static final ForgeConfigSpec.DoubleValue NUCLEEPER_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue NUCLEEPER_ARMOR;
    public static final ForgeConfigSpec.DoubleValue RADGILL_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue RADGILL_ARMOR;
    public static final ForgeConfigSpec.DoubleValue RAYCAT_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue RAYCAT_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue RAYCAT_ARMOR;
    public static final ForgeConfigSpec.DoubleValue RELICHEIRUS_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue RELICHEIRUS_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue RELICHEIRUS_ARMOR;
    public static final ForgeConfigSpec.DoubleValue SEA_PIG_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue SEA_PIG_ARMOR;
    public static final ForgeConfigSpec.DoubleValue SUBTERRANODON_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue SUBTERRANODON_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue SUBTERRANODON_ARMOR;
    public static final ForgeConfigSpec.DoubleValue TELETOR_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue TELETOR_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TELETOR_ARMOR;
    public static final ForgeConfigSpec.DoubleValue TREMORSAURUS_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue TREMORSAURUS_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORSAURUS_ARMOR;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_ARMOR;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_WEAK_STOMP_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_STRONG_STOMP_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_SCRATCH_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_TAIL_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_BITE_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TREMORZILLA_BEAM_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TRILOCARIS_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue TRILOCARIS_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue TRILOCARIS_ARMOR;
    public static final ForgeConfigSpec.DoubleValue TRIPODFISH_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue TRIPODFISH_ARMOR;
    public static final ForgeConfigSpec.DoubleValue UNDERZEALOT_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue UNDERZEALOT_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue UNDERZEALOT_ARMOR;
    public static final ForgeConfigSpec.DoubleValue VALLUMRAPTOR_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue VALLUMRAPTOR_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue VALLUMRAPTOR_ARMOR;
    public static final ForgeConfigSpec.DoubleValue VESPER_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue VESPER_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue VESPER_ARMOR;
    public static final ForgeConfigSpec.DoubleValue WATCHER_MAX_HEALTH;
    public static final ForgeConfigSpec.DoubleValue WATCHER_ATTACK_DAMAGE;
    public static final ForgeConfigSpec.DoubleValue WATCHER_ARMOR;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();

        APPLY_TAG_ADJUSTMENTS = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to activate an internal datapack to add Alex's Caves biomes and blocks to certain tags for better mod compat.
                    """)
                .define("applyTagAdjustments", true);

        APPLY_SPELUNKERY_COMPAT_ADJUSTMENTS = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to activate an internal datapack to remove Spelunkery mod's wall mushrooms from Alex's Caves's Primordial Cave biome due to the mushrooms not having safe generation.
                    """)
                .define("applySpelunkeryCompatAdjustments", true);

        REPLACEABLE_SMALL_PLANTS = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to make Underweed, Tree Star, Fiddlehead, and Curly Fern be replaceable by
                     another block when right clicking them while holding a block in your hands.
                    """)
                .define("replaceableSmallPlants", true);

        GUANO_BURN_FUEL = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to make Guano, Guano Block, and Guano Layer be able to be used as fuel in Furnaces.
                    """)
                .define("guanoBurnFuel", true);

        PRIMITIVE_CLUB_BASE_STUN_TIME = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Minimum amount of time that Primative Club can stun a mob.
                     Full stun time calculation is (Base Time) + (a random number between 0 and Random Extra Time)
                    """)
                .defineInRange("primitiveClubBaseStunTime", 150, 0, 1000000);

        PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Random amount of extra time that Primative Club can stun a mob.
                     Full stun time calculation is (Base Time) + (a random number between 0 and Random Extra Time)
                    """)
                .defineInRange("primitiveClubRandomExtraStunTime", 150, 0, 1000000);

        RESTORE_END_STORY = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to revert the End Story back to its original form when beating Minecraft.
                     Alex's Caves replaces this story with their own. This config puts it back to normal if enabled.
                    """)
                .define("restoreEndStory", false);

        UNLOCK_ALL_COMPENDIUM_INFO = configBuilder
                .comment("""
                    ----------------------------------
                    
                     If enabled, this config makes the Compendium have all biomes and their info unlocked immediately on log-in.
                    """)
                .define("unlockAllCompendiumInfo", false);

        DREADBOW_ARROW_RAIN_OVERRIDES = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Allows setting overrides for how many arrows to spawn with Dreadbow's rain-like attack.
                     Format is the arrow item registry name. Then an equal sign =. And ends with the arrow amount.
                     Separate multiple entries with a comma , and whitespace will be ignored.
                     Example: "alexscaves:seeking_arrow=5, alexscaves:burrowing_arrow=100"
                     
                     Otherwise, will default to Alex's Caves original code for determining arrow amount for
                     the attack which is 30 arrows for dark colored arrows and 5 arrows for all other arrows.
                    """)
                .define("dreadbowArrowRainOverrides", "");

        SUBTERRANODON_FLIGHT_METER_RECHARGE_SPEED = configBuilder
                .comment("""
                    ----------------------------------
                    
                     How quickly the flight meter will recharge for Subterranodon.
                     Putting 2 will recharge twice as fast. Putting 0.5 will halve the recharge rate.
                    """)
                .defineInRange("subterranodonFlightMeterRechargeSpeed", 1D, 0, 1000);

        SUBTERRANODON_FLIGHT_METER_USAGE_SPEED = configBuilder
                .comment("""
                    ----------------------------------
                    
                     How quickly the flight meter will be depleted when flying with Subterranodon.
                     Putting 2 will deplete the meter twice as fast. Putting 0.5 will slow the meter's usage rate.
                    """)
                .defineInRange("subterranodonFlightMeterUsageSpeed", 1D, 0, 1000);

        configBuilder.push("Cloak of Darkness Options");

        ALLOWED_CLOAK_OF_DARKNESS_ABILITY_IN_LIGHT = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether Cloak of Darkness's ability should be usable anywhere. Including in bright light or sunlight.
                    """)
                .define("AllowedCloakOfDarknessAbilityInLight",  false);

        configBuilder.pop();

        configBuilder.push("Raygun Options");

        RAYGUN_NORMAL_DAMAGE = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Rate of damage for Raygun normally.
                    """)
                .defineInRange("raygunNormalDamage", 1.5D, 0, 1000);

        RAYGUN_GAMMA_DAMAGE = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Rate of damage for Raygun when gamma enchanted.
                    """)
                .defineInRange("raygunGammaDamage", 2.0D, 0, 1000);

        configBuilder.pop();

        configBuilder.push("Mob Attack/Health Options");

        ATLATITAN_MAX_HEALTH = configBuilder
                .defineInRange("atlatitanMaxHealth", 400d, 1, 1000000);

        ATLATITAN_ATTACK_DAMAGE = configBuilder
                .defineInRange("atlatitanAttackDamage", 8.0d, 1, 1000000);

        ATLATITAN_ARMOR = configBuilder
                .defineInRange("atlatitanArmor", 0.0d, 0, 1000000);

        BOUNDROID_MAX_HEALTH = configBuilder
                .defineInRange("boundroidMaxHealth", 20d, 1, 1000000);

        BOUNDROID_ATTACK_DAMAGE = configBuilder
                .defineInRange("boundroidAttackDamage", 5.0d, 1, 1000000);

        BOUNDROID_ARMOR = configBuilder
                .defineInRange("boundroidArmor", 20.0d, 0, 1000000);

        BOUNDROID_WINCH_MAX_HEALTH = configBuilder
                .defineInRange("boundroidWrinchMaxHealth", 20d, 1, 1000000);

        BOUNDROID_WINCH_ARMOR = configBuilder
                .defineInRange("boundroidWrinchArmor", 0.0d, 0, 1000000);

        BRAINIAC_MAX_HEALTH = configBuilder
                .defineInRange("brainiacWrinchMaxHealth", 40d, 1, 1000000);

        BRAINIAC_ATTACK_DAMAGE = configBuilder
                .defineInRange("brainiacAttackDamage", 5.0d, 1, 1000000);

        BRAINIAC_ARMOR = configBuilder
                .defineInRange("brainiacArmor", 8.0d, 0, 1000000);

        CORRODENT_MAX_HEALTH = configBuilder
                .defineInRange("corrodentMaxHealth", 16d, 1, 1000000);

        CORRODENT_ATTACK_DAMAGE = configBuilder
                .defineInRange("corrodentAttackDamage", 3.0d, 1, 1000000);

        CORRODENT_ARMOR = configBuilder
                .defineInRange("corrodentArmor", 2.0d, 0, 1000000);

        DEEP_ONE_MAX_HEALTH = configBuilder
                .defineInRange("deepOneMaxHealth", 30d, 1, 1000000);

        DEEP_ONE_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneAttackDamage", 3.0d, 1, 1000000);

        DEEP_ONE_ARMOR = configBuilder
                .defineInRange("deepOneArmor", 0.0d, 0, 1000000);

        DEEP_ONE_KNIGHT_MAX_HEALTH = configBuilder
                .defineInRange("deepOneKnightMaxHealth", 60d, 1, 1000000);

        DEEP_ONE_KNIGHT_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneKnightAttackDamage", 5.0d, 1, 1000000);

        DEEP_ONE_KNIGHT_ARMOR = configBuilder
                .defineInRange("deepOneKnightArmor", 0.0d, 0, 1000000);

        DEEP_ONE_MAGE_MAX_HEALTH = configBuilder
                .defineInRange("deepOneMageMaxHealth", 80d, 1, 1000000);

        DEEP_ONE_MAGE_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneMageAttackDamage", 4.0d, 1, 1000000);

        DEEP_ONE_MAGE_ARMOR = configBuilder
                .defineInRange("deepOneMageArmor", 0.0d, 0, 1000000);

        FERROUSLIME_MAX_HEALTH = configBuilder
                .defineInRange("ferrouslimeMaxHealth", 10d, 1, 1000000);

        FERROUSLIME_ATTACK_DAMAGE = configBuilder
                .defineInRange("ferrouslimeAttackDamage", 2.0d, 1, 1000000);

        FERROUSLIME_ARMOR = configBuilder
                .defineInRange("ferrouslimeArmor", 0.0d, 0, 1000000);

        FORSAKEN_MAX_HEALTH = configBuilder
                .defineInRange("forsakenMaxHealth", 250d, 1, 1000000);

        FORSAKEN_ATTACK_DAMAGE = configBuilder
                .defineInRange("forsakenAttackDamage", 10.0d, 1, 1000000);

        FORSAKEN_SONIC_BOOM_NORMAL_ATTACK_DAMAGE = configBuilder
                .defineInRange("forsakenSonicBoomNormalAttackDamage", 4.0d, 1, 1000000);

        FORSAKEN_SONIC_BOOM_WEAK_TAGGED_ATTACK_DAMAGE = configBuilder
                .defineInRange("forsakenSonicBoomWeakTaggedAttackDamage", 45.0d, 1, 1000000);

        FORSAKEN_ARMOR = configBuilder
                .defineInRange("forsakenArmor", 0.0d, 0, 1000000);

        GAMMAROACH_MAX_HEALTH = configBuilder
                .defineInRange("gammaroachMaxHealth", 14d, 1, 1000000);

        GAMMAROACH_ATTACK_DAMAGE = configBuilder
                .defineInRange("gammaroachAttackDamage", 2.0d, 1, 1000000);

        GAMMAROACH_ARMOR = configBuilder
                .defineInRange("gammaroachArmor", 0.0d, 0, 1000000);

        GLOOMOTH_MAX_HEALTH = configBuilder
                .defineInRange("gloomothMaxHealth", 4d, 1, 1000000);

        GLOOMOTH_ARMOR = configBuilder
                .defineInRange("gloomothArmor", 0.0d, 0, 1000000);

        GOSSAMER_WORM_MAX_HEALTH = configBuilder
                .defineInRange("gossamerWormMaxHealth", 10d, 1, 1000000);

        GOSSAMER_WORM_ARMOR = configBuilder
                .defineInRange("gossamerWormArmor", 0.0d, 0, 1000000);

        GROTTOCERATOPS_MAX_HEALTH = configBuilder
                .defineInRange("grottoceratopsMaxHealth", 50d, 1, 1000000);

        GROTTOCERATOPS_ATTACK_DAMAGE = configBuilder
                .defineInRange("grottoceratopsAttackDamage", 10.0d, 1, 1000000);

        GROTTOCERATOPS_ARMOR = configBuilder
                .defineInRange("grottoceratopsArmor", 8.0d, 0, 1000000);

        HULLBREAKER_MAX_HEALTH = configBuilder
                .defineInRange("hullbreakerMaxHealth", 400d, 1, 1000000);

        HULLBREAKER_ATTACK_DAMAGE = configBuilder
                .defineInRange("hullbreakerAttackDamage", 16.0d, 1, 1000000);

        HULLBREAKER_ARMOR = configBuilder
                .defineInRange("hullbreakerArmor", 0.0d, 0, 1000000);

        LANTERNFISH_MAX_HEALTH = configBuilder
                .defineInRange("lanternfishMaxHealth", 2d, 1, 1000000);

        LANTERNFISH_ARMOR = configBuilder
                .defineInRange("lanternfishArmor", 0.0d, 0, 1000000);

        LUXTRUCTOSAURUS_MAX_HEALTH = configBuilder
                .defineInRange("luxtructosaurusMaxHealth", 600d, 1, 1000000);

        LUXTRUCTOSAURUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("luxtructosaurusAttackDamage", 12.0d, 1, 1000000);

        LUXTRUCTOSAURUS_ARMOR = configBuilder
                .defineInRange("luxtructosaurusArmor", 20.0d, 0, 1000000);

        LUXTRUCTOSAURUS_FIRE_BREATH_ATTACK_DAMAGE = configBuilder
                .defineInRange("luxtructosaurusFireBreathAttackDamage", 3.0d, 1, 1000000);

        MAGNETRON_MAX_HEALTH = configBuilder
                .defineInRange("magnetronMaxHealth", 30d, 1, 1000000);

        MAGNETRON_ATTACK_DAMAGE = configBuilder
                .defineInRange("magnetronAttackDamage", 2.0d, 1, 1000000);

        MAGNETRON_ARMOR = configBuilder
                .defineInRange("magnetronArmor", 6.0d, 0, 1000000);

        MINE_GUARDIAN_MAX_HEALTH = configBuilder
                .defineInRange("mineGuardianMaxHealth", 20d, 1, 1000000);

        MINE_GUARDIAN_ATTACK_DAMAGE = configBuilder
                .defineInRange("mineGuardianAttackDamage", 1.0d, 1, 1000000);

        MINE_GUARDIAN_ARMOR = configBuilder
                .defineInRange("mineGuardianArmor", 0.0d, 0, 1000000);

        NOTOR_MAX_HEALTH = configBuilder
                .defineInRange("notorMaxHealth", 6d, 1, 1000000);

        NOTOR_ARMOR = configBuilder
                .defineInRange("notorArmor", 0.0d, 0, 1000000);

        NUCLEEPER_MAX_HEALTH = configBuilder
                .defineInRange("nucleeperMaxHealth", 30.0d, 1, 1000000);

        NUCLEEPER_ARMOR = configBuilder
                .defineInRange("nucleeperArmor", 4.0d, 0, 1000000);

        RADGILL_MAX_HEALTH = configBuilder
                .defineInRange("radgillMaxHealth", 8d, 1, 1000000);

        RADGILL_ARMOR = configBuilder
                .defineInRange("radgillArmor", 0.0d, 0, 1000000);

        RAYCAT_MAX_HEALTH = configBuilder
                .defineInRange("raycatMaxHealth", 24d, 1, 1000000);

        RAYCAT_ATTACK_DAMAGE = configBuilder
                .defineInRange("raycatAttackDamage", 1.0d, 1, 1000000);

        RAYCAT_ARMOR = configBuilder
                .defineInRange("raycatArmor", 0.0d, 0, 1000000);

        RELICHEIRUS_MAX_HEALTH = configBuilder
                .defineInRange("relicheirusMaxHealth", 120d, 1, 1000000);

        RELICHEIRUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("relicheirusAttackDamage", 12.0d, 1, 1000000);

        RELICHEIRUS_ARMOR = configBuilder
                .defineInRange("relicheirusArmor", 0.0d, 0, 1000000);

        SEA_PIG_MAX_HEALTH = configBuilder
                .defineInRange("seaPigMaxHealth", 8d, 1, 1000000);

        SEA_PIG_ARMOR = configBuilder
                .defineInRange("seaPigArmor", 0.0d, 0, 1000000);

        SUBTERRANODON_MAX_HEALTH = configBuilder
                .defineInRange("subterranodonMaxHealth", 20d, 1, 1000000);

        SUBTERRANODON_ATTACK_DAMAGE = configBuilder
                .defineInRange("subterranodonAttackDamage", 2.0d, 1, 1000000);

        SUBTERRANODON_ARMOR = configBuilder
                .defineInRange("subterranodonArmor", 0.0d, 0, 1000000);

        TELETOR_MAX_HEALTH = configBuilder
                .defineInRange("teletorMaxHealth", 18d, 1, 1000000);

        TELETOR_ATTACK_DAMAGE = configBuilder
                .defineInRange("teletorAttackDamage", 2.0d, 1, 1000000);

        TELETOR_ARMOR = configBuilder
                .defineInRange("teletorArmor", 0.0d, 0, 1000000);

        TREMORSAURUS_MAX_HEALTH = configBuilder
                .defineInRange("tremorsaurusMaxHealth", 150d, 1, 1000000);

        TREMORSAURUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorsaurusAttackDamage", 14.0d, 1, 1000000);

        TREMORSAURUS_ARMOR = configBuilder
                .defineInRange("tremorsaurusArmor", 8.0d, 0, 1000000);

        TREMORZILLA_MAX_HEALTH = configBuilder
                .defineInRange("tremorzillaMaxHealth", 500d, 1, 1000000);

        TREMORZILLA_ARMOR = configBuilder
                .defineInRange("tremorzillaArmor", 10d, 0, 1000000);

        TREMORZILLA_WEAK_STOMP_DAMAGE = configBuilder
                .defineInRange("tremorzillaWeakStompDamage", 2.0d, 1, 1000000);

        TREMORZILLA_STRONG_STOMP_DAMAGE = configBuilder
                .defineInRange("tremorzillaStrongStompDamage", 10.0d, 1, 1000000);

        TREMORZILLA_SCRATCH_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorzillaScratchAttackDamage", 10.0d, 1, 1000000);

        TREMORZILLA_TAIL_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorzillaTailAttackDamage", 10.0d, 1, 1000000);

        TREMORZILLA_BITE_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorzillaBiteAttackDamage", 10.0d, 1, 1000000);

        TREMORZILLA_BEAM_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorzillaBeamAttackDamage", 20.0d, 1, 1000000);

        TRILOCARIS_MAX_HEALTH = configBuilder
                .defineInRange("trilocarisMaxHealth", 10d, 1, 1000000);

        TRILOCARIS_ATTACK_DAMAGE = configBuilder
                .defineInRange("trilocarisAttackDamage", 1.0d, 1, 1000000);

        TRILOCARIS_ARMOR = configBuilder
                .defineInRange("trilocarisArmor", 0.0d, 0, 1000000);

        TRIPODFISH_MAX_HEALTH = configBuilder
                .defineInRange("tripodfishMaxHealth", 8d, 1, 1000000);

        TRIPODFISH_ARMOR = configBuilder
                .defineInRange("tripodfishArmor", 0.0d, 0, 1000000);

        UNDERZEALOT_MAX_HEALTH = configBuilder
                .defineInRange("underzealotMaxHealth", 20d, 1, 1000000);

        UNDERZEALOT_ATTACK_DAMAGE = configBuilder
                .defineInRange("underzealotAttackDamage", 4.0d, 1, 1000000);

        UNDERZEALOT_ARMOR = configBuilder
                .defineInRange("underzealotArmor", 0.0d, 0, 1000000);

        VALLUMRAPTOR_MAX_HEALTH = configBuilder
                .defineInRange("vallumraptorMaxHealth", 24d, 1, 1000000);

        VALLUMRAPTOR_ATTACK_DAMAGE = configBuilder
                .defineInRange("vallumraptorAttackDamage", 3.0d, 1, 1000000);

        VALLUMRAPTOR_ARMOR = configBuilder
                .defineInRange("vallumraptorArmor", 0.0d, 0, 1000000);

        VESPER_MAX_HEALTH = configBuilder
                .defineInRange("vesperMaxHealth", 16d, 1, 1000000);

        VESPER_ATTACK_DAMAGE = configBuilder
                .defineInRange("vesperAttackDamage", 3.0d, 1, 1000000);

        VESPER_ARMOR = configBuilder
                .defineInRange("vesperArmor", 0.0d, 0, 1000000);

        WATCHER_MAX_HEALTH = configBuilder
                .defineInRange("watcherMaxHealth", 30d, 1, 1000000);

        WATCHER_ATTACK_DAMAGE = configBuilder
                .defineInRange("watcherAttackDamage", 4.0d, 1, 1000000);

        WATCHER_ARMOR = configBuilder
                .defineInRange("watcherArmor", 0.0d, 0, 1000000);

        configBuilder.pop();


        SPEC = configBuilder.build();
    }
}
