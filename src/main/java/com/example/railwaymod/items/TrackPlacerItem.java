package com.example.railwaymod.items;

import com.example.railwaymod.core.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class TrackPlacerItem extends Item {
    public TrackPlacerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos().relative(context.getClickedFace());

        if (!level.isClientSide) {
            level.setBlock(pos, ModBlocks.TEST_TRACK.get().defaultBlockState(), 3);
        }

        return InteractionResult.SUCCESS;
    }
}
