package com.telepathicgrunt.tact;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class Config {

    static final ForgeConfigSpec SPEC;

    private static final ForgeConfigSpec.BooleanValue APPLY_TAG_ADJUSTMENTS;
    private static final ForgeConfigSpec.BooleanValue REPLACEABLE_SMALL_PLANTS;
    private static final ForgeConfigSpec.IntValue PRIMITIVE_CLUB_BASE_STUN_TIME;
    private static final ForgeConfigSpec.IntValue PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME;
    private static final ForgeConfigSpec.BooleanValue RESTORE_END_STORY;
    private static final ForgeConfigSpec.BooleanValue UNLOCK_ALL_COMPENDIUM_INFO;
    private static final ForgeConfigSpec.ConfigValue<String> DREADBOW_ARROW_RAIN_OVERRIDES;
    private static final ForgeConfigSpec.DoubleValue SUBTERRANODON_FLIGHT_METER_RECHARGE_SPEED;
    private static final ForgeConfigSpec.DoubleValue SUBTERRANODON_FLIGHT_METER_USAGE_SPEED;

    private static final ForgeConfigSpec.DoubleValue BOUNDROID_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue BOUNDROID_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue BOUNDROID_WINCH_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue BRAINIAC_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue BRAINIAC_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue CORRODENT_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue CORRODENT_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_KNIGHT_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_KNIGHT_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAGE_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue DEEP_ONE_MAGE_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue FERROUSLIME_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue FERROUSLIME_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue FORSAKEN_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue FORSAKEN_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue GAMMAROACH_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue GAMMAROACH_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue GLOOMOTH_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue GOSSAMER_WORM_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue GROTTOCERATOPS_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue GROTTOCERATOPS_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue HULLBREAKER_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue HULLBREAKER_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue LANTERNFISH_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue MAGNETRON_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue MAGNETRON_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue MINE_GUARDIAN_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue MINE_GUARDIAN_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue NOTOR_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue NUCLEEPER_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue RADGILL_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue RAYCAT_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue RAYCAT_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue RELICHEIRUS_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue RELICHEIRUS_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue SEA_PIG_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue SUBTERRANODON_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue SUBTERRANODON_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue TELETOR_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue TELETOR_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue TREMORSAURUS_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue TREMORSAURUS_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue TRILOCARIS_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue TRILOCARIS_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue TRIPODFISH_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue UNDERZEALOT_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue UNDERZEALOT_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue VALLUMRAPTOR_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue VALLUMRAPTOR_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue VESPER_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue VESPER_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue WATCHER_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue WATCHER_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue LUXTRUCTOSAURUS_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue ATLATITAN_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue ATLATITAN_ATTACK_DAMAGE;
    private static final ForgeConfigSpec.DoubleValue TREMORZILLA_MAX_HEALTH;
    private static final ForgeConfigSpec.DoubleValue TREMORZILLA_ATTACK_DAMAGE;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();

        APPLY_TAG_ADJUSTMENTS = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to activate an internal datapack to add Alex's Caves biomes and blocks to certain tags for better mod compat.
                    """)
                .define("applyTagAdjustments", true);

        REPLACEABLE_SMALL_PLANTS = configBuilder
                .comment("""
                    ----------------------------------
                    
                     Whether to make Underweed, Tree Star, Fiddlehead, and Curly Fern be replaceable by
                     another block when right clicking them while holding a block in your hands.
                    """)
                .define("replaceableSmallPlants", true);

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

        configBuilder.push("Mob Attack/Health Options");

        BOUNDROID_MAX_HEALTH = configBuilder
                .defineInRange("boundroidMaxHealth", 20d, 1, 1000000);

        BOUNDROID_ATTACK_DAMAGE = configBuilder
                .defineInRange("boundroidAttackDamage", 5.0d, 1, 1000000);

        BOUNDROID_WINCH_MAX_HEALTH = configBuilder
                .defineInRange("boundroidWrinchMaxHealth", 20d, 1, 1000000);

        BRAINIAC_MAX_HEALTH = configBuilder
                .defineInRange("brainiacWrinchMaxHealth", 40d, 1, 1000000);

        BRAINIAC_ATTACK_DAMAGE = configBuilder
                .defineInRange("brainiacAttackDamage", 5.0d, 1, 1000000);

        CORRODENT_MAX_HEALTH = configBuilder
                .defineInRange("corrodentMaxHealth", 16d, 1, 1000000);

        CORRODENT_ATTACK_DAMAGE = configBuilder
                .defineInRange("corrodentAttackDamage", 3.0d, 1, 1000000);

        DEEP_ONE_MAX_HEALTH = configBuilder
                .defineInRange("deepOneMaxHealth", 30d, 1, 1000000);

        DEEP_ONE_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneAttackDamage", 3.0d, 1, 1000000);

        DEEP_ONE_KNIGHT_MAX_HEALTH = configBuilder
                .defineInRange("deepOneKnightMaxHealth", 60d, 1, 1000000);

        DEEP_ONE_KNIGHT_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneKnightAttackDamage", 5.0d, 1, 1000000);

        DEEP_ONE_MAGE_MAX_HEALTH = configBuilder
                .defineInRange("deepOneMageMaxHealth", 80d, 1, 1000000);

        DEEP_ONE_MAGE_ATTACK_DAMAGE = configBuilder
                .defineInRange("deepOneMageAttackDamage", 4.0d, 1, 1000000);

        FERROUSLIME_MAX_HEALTH = configBuilder
                .defineInRange("ferrouslimeMaxHealth", 10d, 1, 1000000);

        FERROUSLIME_ATTACK_DAMAGE = configBuilder
                .defineInRange("ferrouslimeAttackDamage", 2.0d, 1, 1000000);

        FORSAKEN_MAX_HEALTH = configBuilder
                .defineInRange("forsakenMaxHealth", 250d, 1, 1000000);

        FORSAKEN_ATTACK_DAMAGE = configBuilder
                .defineInRange("forsakenAttackDamage", 10.0d, 1, 1000000);

        GAMMAROACH_MAX_HEALTH = configBuilder
                .defineInRange("gammaroachMaxHealth", 14d, 1, 1000000);

        GAMMAROACH_ATTACK_DAMAGE = configBuilder
                .defineInRange("gammaroachAttackDamage", 2.0d, 1, 1000000);

        GLOOMOTH_MAX_HEALTH = configBuilder
                .defineInRange("gloomothMaxHealth", 4d, 1, 1000000);

        GOSSAMER_WORM_MAX_HEALTH = configBuilder
                .defineInRange("gossamerWormMaxHealth", 10d, 1, 1000000);

        GROTTOCERATOPS_MAX_HEALTH = configBuilder
                .defineInRange("grottoceratopsMaxHealth", 50d, 1, 1000000);

        GROTTOCERATOPS_ATTACK_DAMAGE = configBuilder
                .defineInRange("grottoceratopsAttackDamage", 10.0d, 1, 1000000);

        HULLBREAKER_MAX_HEALTH = configBuilder
                .defineInRange("hullbreakerMaxHealth", 400d, 1, 1000000);

        HULLBREAKER_ATTACK_DAMAGE = configBuilder
                .defineInRange("hullbreakerAttackDamage", 16.0d, 1, 1000000);

        LANTERNFISH_MAX_HEALTH = configBuilder
                .defineInRange("lanternfishMaxHealth", 2d, 1, 1000000);

        MAGNETRON_MAX_HEALTH = configBuilder
                .defineInRange("magnetronMaxHealth", 30d, 1, 1000000);

        MAGNETRON_ATTACK_DAMAGE = configBuilder
                .defineInRange("magnetronAttackDamage", 2.0d, 1, 1000000);

        MINE_GUARDIAN_MAX_HEALTH = configBuilder
                .defineInRange("mineGuardianMaxHealth", 20d, 1, 1000000);

        MINE_GUARDIAN_ATTACK_DAMAGE = configBuilder
                .defineInRange("mineGuardianAttackDamage", 1.0d, 1, 1000000);

        NOTOR_MAX_HEALTH = configBuilder
                .defineInRange("notorMaxHealth", 6d, 1, 1000000);

        NUCLEEPER_MAX_HEALTH = configBuilder
                .defineInRange("nucleeperMaxHealth", 30.0d, 1, 1000000);

        RADGILL_MAX_HEALTH = configBuilder
                .defineInRange("radgillMaxHealth", 8d, 1, 1000000);

        RAYCAT_MAX_HEALTH = configBuilder
                .defineInRange("raycatMaxHealth", 24d, 1, 1000000);

        RAYCAT_ATTACK_DAMAGE = configBuilder
                .defineInRange("raycatAttackDamage", 1.0d, 1, 1000000);

        RELICHEIRUS_MAX_HEALTH = configBuilder
                .defineInRange("relicheirusMaxHealth", 120d, 1, 1000000);

        RELICHEIRUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("relicheirusAttackDamage", 12.0d, 1, 1000000);

        SEA_PIG_MAX_HEALTH = configBuilder
                .defineInRange("seaPigMaxHealth", 8d, 1, 1000000);

        SUBTERRANODON_MAX_HEALTH = configBuilder
                .defineInRange("subterranodonMaxHealth", 20d, 1, 1000000);

        SUBTERRANODON_ATTACK_DAMAGE = configBuilder
                .defineInRange("subterranodonAttackDamage", 2.0d, 1, 1000000);

        TELETOR_MAX_HEALTH = configBuilder
                .defineInRange("teletorMaxHealth", 18d, 1, 1000000);

        TELETOR_ATTACK_DAMAGE = configBuilder
                .defineInRange("teletorttackDamage", 2.0d, 1, 1000000);

        TREMORSAURUS_MAX_HEALTH = configBuilder
                .defineInRange("tremorsaurusMaxHealth", 150d, 1, 1000000);

        TREMORSAURUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorsaurusAttackDamage", 14.0d, 1, 1000000);

        TRILOCARIS_MAX_HEALTH = configBuilder
                .defineInRange("trilocarisMaxHealth", 10d, 1, 1000000);

        TRILOCARIS_ATTACK_DAMAGE = configBuilder
                .defineInRange("trilocarisAttackDamage", 1.0d, 1, 1000000);

        TRIPODFISH_MAX_HEALTH = configBuilder
                .defineInRange("tripodfishMaxHealth", 8d, 1, 1000000);

        UNDERZEALOT_MAX_HEALTH = configBuilder
                .defineInRange("underzealotMaxHealth", 20d, 1, 1000000);

        UNDERZEALOT_ATTACK_DAMAGE = configBuilder
                .defineInRange("underzealotAttackDamage", 4.0d, 1, 1000000);

        VALLUMRAPTOR_MAX_HEALTH = configBuilder
                .defineInRange("vallumraptorMaxHealth", 24d, 1, 1000000);

        VALLUMRAPTOR_ATTACK_DAMAGE = configBuilder
                .defineInRange("vallumraptorAttackDamage", 3.0d, 1, 1000000);

        VESPER_MAX_HEALTH = configBuilder
                .defineInRange("vesperMaxHealth", 16d, 1, 1000000);

        VESPER_ATTACK_DAMAGE = configBuilder
                .defineInRange("vesperAttackDamage", 3.0d, 1, 1000000);

        WATCHER_MAX_HEALTH = configBuilder
                .defineInRange("watcherMaxHealth", 30d, 1, 1000000);

        WATCHER_ATTACK_DAMAGE = configBuilder
                .defineInRange("watcherAttackDamage", 4.0d, 1, 1000000);

        LUXTRUCTOSAURUS_MAX_HEALTH = configBuilder
                .defineInRange("luxtructosaurusMaxHealth", 600d, 1, 1000000);

        LUXTRUCTOSAURUS_ATTACK_DAMAGE = configBuilder
                .defineInRange("luxtructosaurusAttackDamage", 12.0d, 1, 1000000);

        ATLATITAN_MAX_HEALTH = configBuilder
                .defineInRange("atlatitanMaxHealth", 400d, 1, 1000000);

        ATLATITAN_ATTACK_DAMAGE = configBuilder
                .defineInRange("atlatitanAttackDamage", 8.0d, 1, 1000000);

        TREMORZILLA_MAX_HEALTH = configBuilder
                .defineInRange("tremorzillaMaxHealth", 500d, 1, 1000000);

        TREMORZILLA_ATTACK_DAMAGE = configBuilder
                .defineInRange("tremorzillaAttackDamage", 30.0d, 1, 1000000);


        configBuilder.pop();


        SPEC = configBuilder.build();
    }

    public static boolean applyTagAdjustments;
    public static boolean replaceableSmallPlants;
    public static int primitiveClubBaseStunTime;
    public static int primitiveClubRandomExtraStunTime;
    public static boolean restoreEndStory;
    public static boolean unlockAllCompendiumInfo;
    public static double subterranodonFlightMeterRechargeSpeed;
    public static double subterranodonFlightMeterUsageSpeed;

    public static double boundroidMaxHealth;
    public static double boundroidAttackDamage;
    public static double boundroidWrinchMaxHealth;
    public static double brainiacAttackDamage;
    public static double brainiacWrinchMaxHealth;
    public static double corrodentMaxHealth;
    public static double corrodentAttackDamage;
    public static double deepOneMaxHealth;
    public static double deepOneAttackDamage;
    public static double deepOneKnightMaxHealth;
    public static double deepOneKnightAttackDamage;
    public static double deepOneMageMaxHealth;
    public static double deepOneMageAttackDamage;
    public static double ferrouslimeMaxHealth;
    public static double ferrouslimeAttackDamage;
    public static double forsakenMaxHealth;
    public static double forsakenAttackDamage;
    public static double gammaroachMaxHealth;
    public static double gammaroachAttackDamage;
    public static double gloomothMaxHealth;
    public static double gossamerWormMaxHealth;
    public static double grottoceratopsMaxHealth;
    public static double grottoceratopsAttackDamage;
    public static double hullbreakerMaxHealth;
    public static double hullbreakerAttackDamage;
    public static double lanternfishMaxHealth;
    public static double magnetronMaxHealth;
    public static double magnetronAttackDamage;
    public static double mineGuardianMaxHealth;
    public static double mineGuardianAttackDamage;
    public static double notorMaxHealth;
    public static double nucleeperMaxHealth;
    public static double radgillMaxHealth;
    public static double raycatMaxHealth;
    public static double raycatAttackDamage;
    public static double relicheirusMaxHealth;
    public static double relicheirusAttackDamage;
    public static double seaPigMaxHealth;
    public static double subterranodonMaxHealth;
    public static double subterranodonAttackDamage;
    public static double teletorMaxHealth;
    public static double teletorAttackDamage;
    public static double tremorsaurusMaxHealth;
    public static double tremorsaurusAttackDamage;
    public static double trilocarisMaxHealth;
    public static double trilocarisAttackDamage;
    public static double tripodfishMaxHealth;
    public static double underzealotMaxHealth;
    public static double underzealotAttackDamage;
    public static double vallumraptorMaxHealth;
    public static double vallumraptorAttackDamage;
    public static double vesperMaxHealth;
    public static double vesperAttackDamage;
    public static double watcherMaxHealth;
    public static double watcherAttackDamage;
    public static double luxtructosaurusMaxHealth;
    public static double luxtructosaurusAttackDamage;
    public static double atlatitanMaxHealth;
    public static double atlatitanAttackDamage;
    public static double tremorzillaMaxHealth;
    public static double tremorzillaAttackDamage;

    static void onLoad(final ModConfigEvent event) {
        applyTagAdjustments = APPLY_TAG_ADJUSTMENTS.get();
        replaceableSmallPlants = REPLACEABLE_SMALL_PLANTS.get();
        primitiveClubBaseStunTime = PRIMITIVE_CLUB_BASE_STUN_TIME.get();
        primitiveClubRandomExtraStunTime = PRIMITIVE_CLUB_RANDOM_EXTRA_STUN_TIME.get();
        restoreEndStory = RESTORE_END_STORY.get();
        unlockAllCompendiumInfo = UNLOCK_ALL_COMPENDIUM_INFO.get();
        subterranodonFlightMeterRechargeSpeed = SUBTERRANODON_FLIGHT_METER_RECHARGE_SPEED.get();
        subterranodonFlightMeterUsageSpeed = SUBTERRANODON_FLIGHT_METER_USAGE_SPEED.get();
        DreadbowRainAttackModification.setDreadbowOverrides(DREADBOW_ARROW_RAIN_OVERRIDES.get());

        boundroidMaxHealth = BOUNDROID_MAX_HEALTH.get();
        boundroidAttackDamage = BOUNDROID_ATTACK_DAMAGE.get();
        boundroidWrinchMaxHealth = BOUNDROID_WINCH_MAX_HEALTH.get();
        brainiacAttackDamage = BRAINIAC_MAX_HEALTH.get();
        brainiacWrinchMaxHealth = BRAINIAC_ATTACK_DAMAGE.get();
        corrodentMaxHealth = CORRODENT_MAX_HEALTH.get();
        corrodentAttackDamage = CORRODENT_ATTACK_DAMAGE.get();
        deepOneMaxHealth = DEEP_ONE_MAX_HEALTH.get();
        deepOneAttackDamage = DEEP_ONE_ATTACK_DAMAGE.get();
        deepOneKnightMaxHealth = DEEP_ONE_KNIGHT_MAX_HEALTH.get();
        deepOneKnightAttackDamage = DEEP_ONE_KNIGHT_ATTACK_DAMAGE.get();
        deepOneMageMaxHealth = DEEP_ONE_MAGE_MAX_HEALTH.get();
        deepOneMageAttackDamage = DEEP_ONE_MAGE_ATTACK_DAMAGE.get();
        ferrouslimeMaxHealth = FERROUSLIME_MAX_HEALTH.get();
        ferrouslimeAttackDamage = FERROUSLIME_ATTACK_DAMAGE.get();
        forsakenMaxHealth = FORSAKEN_MAX_HEALTH.get();
        forsakenAttackDamage = FORSAKEN_ATTACK_DAMAGE.get();
        gammaroachMaxHealth = GAMMAROACH_MAX_HEALTH.get();
        gammaroachAttackDamage = GAMMAROACH_ATTACK_DAMAGE.get();
        gloomothMaxHealth = GLOOMOTH_MAX_HEALTH.get();
        gossamerWormMaxHealth = GOSSAMER_WORM_MAX_HEALTH.get();
        grottoceratopsMaxHealth = GROTTOCERATOPS_MAX_HEALTH.get();
        grottoceratopsAttackDamage = GROTTOCERATOPS_ATTACK_DAMAGE.get();
        hullbreakerMaxHealth = HULLBREAKER_MAX_HEALTH.get();
        hullbreakerAttackDamage = HULLBREAKER_ATTACK_DAMAGE.get();
        lanternfishMaxHealth = LANTERNFISH_MAX_HEALTH.get();
        magnetronMaxHealth = MAGNETRON_MAX_HEALTH.get();
        magnetronAttackDamage = MAGNETRON_ATTACK_DAMAGE.get();
        mineGuardianMaxHealth = MINE_GUARDIAN_MAX_HEALTH.get();
        mineGuardianAttackDamage = MINE_GUARDIAN_ATTACK_DAMAGE.get();
        notorMaxHealth = NOTOR_MAX_HEALTH.get();
        nucleeperMaxHealth = NUCLEEPER_MAX_HEALTH.get();
        radgillMaxHealth = RADGILL_MAX_HEALTH.get();
        raycatMaxHealth = RAYCAT_MAX_HEALTH.get();
        raycatAttackDamage = RAYCAT_ATTACK_DAMAGE.get();
        relicheirusMaxHealth = RELICHEIRUS_MAX_HEALTH.get();
        relicheirusAttackDamage = RELICHEIRUS_ATTACK_DAMAGE.get();
        seaPigMaxHealth = SEA_PIG_MAX_HEALTH.get();
        subterranodonMaxHealth = SUBTERRANODON_MAX_HEALTH.get();
        subterranodonAttackDamage = SUBTERRANODON_ATTACK_DAMAGE.get();
        teletorMaxHealth = TELETOR_MAX_HEALTH.get();
        teletorAttackDamage = TELETOR_ATTACK_DAMAGE.get();
        tremorsaurusMaxHealth = TREMORSAURUS_MAX_HEALTH.get();
        tremorsaurusAttackDamage = TREMORSAURUS_ATTACK_DAMAGE.get();
        trilocarisMaxHealth = TRILOCARIS_MAX_HEALTH.get();
        trilocarisAttackDamage = TRILOCARIS_ATTACK_DAMAGE.get();
        tripodfishMaxHealth = TRIPODFISH_MAX_HEALTH.get();
        underzealotMaxHealth = UNDERZEALOT_MAX_HEALTH.get();
        underzealotAttackDamage = UNDERZEALOT_ATTACK_DAMAGE.get();
        vallumraptorMaxHealth = VALLUMRAPTOR_MAX_HEALTH.get();
        vallumraptorAttackDamage = VALLUMRAPTOR_ATTACK_DAMAGE.get();
        vesperMaxHealth = VESPER_MAX_HEALTH.get();
        vesperAttackDamage = VESPER_ATTACK_DAMAGE.get();
        watcherMaxHealth = WATCHER_MAX_HEALTH.get();
        watcherAttackDamage = WATCHER_ATTACK_DAMAGE.get();
        luxtructosaurusMaxHealth = LUXTRUCTOSAURUS_MAX_HEALTH.get();
        luxtructosaurusAttackDamage = LUXTRUCTOSAURUS_ATTACK_DAMAGE.get();
        atlatitanMaxHealth = ATLATITAN_MAX_HEALTH.get();
        atlatitanAttackDamage = ATLATITAN_ATTACK_DAMAGE.get();
        tremorzillaMaxHealth = TREMORZILLA_MAX_HEALTH.get();
        tremorzillaAttackDamage = TREMORZILLA_ATTACK_DAMAGE.get();
    }
}
