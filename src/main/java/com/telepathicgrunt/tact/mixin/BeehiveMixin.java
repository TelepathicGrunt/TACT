package com.telepathicgrunt.tact.mixin;

import net.minecraft.world.level.block.BeehiveBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BeehiveBlock.class)
public class BeehiveMixin {
//
//    // makes Comb Cutter increase drops from BeehiveBlocks.
//    @Inject(method = "use(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;",
//            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/BeehiveBlock;dropHoneycomb(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V"))
//    private void thebumblezone_combDropIncrease(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, CallbackInfoReturnable<InteractionResult> cir) {
//        CombCutterEnchantment.increasedCombDrops(player, world, pos);
//    }
//
//    @Inject(method = "angerNearbyBees(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V",
//            at = @At(value = "INVOKE", target = "Ljava/util/List;isEmpty()Z", ordinal = 1, remap = false),
//            locals = LocalCapture.CAPTURE_FAILHARD)
//    private void thebumblezone_essenceBeehivePreventAnger2(Level level, BlockPos blockPos, CallbackInfo ci, List<Bee> beeList, List<Player> playerList) {
//        BeeAggression.preventAngerOnEssencedPlayers(beeList, playerList);
//    }
}