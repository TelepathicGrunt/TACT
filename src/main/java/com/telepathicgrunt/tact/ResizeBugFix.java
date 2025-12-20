package com.telepathicgrunt.tact;

import com.github.alexmodguy.alexscaves.server.entity.util.MagneticEntityAccessor;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.EntityEvent;

public class ResizeBugFix {
    public static void resizeEntity(EntityEvent.Size event) {
        if (event.getEntity().isAddedToWorld() && event.getEntity() instanceof MagneticEntityAccessor magnet && event.getEntity().getEntityData().isDirty()) {
            Direction dir = magnet.getMagneticAttachmentFace();
            float defaultHeight = event.getOldSize().height;
            float defaultEyeHeight = event.getEntity().getEyeHeightAccess(event.getPose(), event.getOldSize());
            if (dir == Direction.DOWN && event.getEntity() instanceof Player && event.getEntity().getPose() == Pose.STANDING) {
                event.setNewSize(event.getNewSize(), true); // resets eye height
            } else if (dir == Direction.UP) {
                event.setNewEyeHeight(defaultHeight - defaultEyeHeight);
            } else if (dir.getAxis() != Direction.Axis.Y) {
                event.setNewEyeHeight(0.0F);
            }
        }
    }
}
