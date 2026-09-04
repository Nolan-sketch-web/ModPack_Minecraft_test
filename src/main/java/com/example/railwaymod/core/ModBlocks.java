package com.example.railwaymod.core;

import com.example.railwaymod.blocks.BaseTrackBlock;
import com.example.railwaymod.blocks.SignalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.railwaymod.RailwayMod.MOD_ID;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> TEST_TRACK = BLOCKS.register("test_track",
            () -> new BaseTrackBlock(Block.Properties.of().strength(1.5F).noOcclusion()));

    public static final RegistryObject<Block> SIGNAL_BLOCK = BLOCKS.register("signal_block",
            () -> new SignalBlock(Block.Properties.of().strength(2.0F).noOcclusion()));

    private ModBlocks() {
    }
}
