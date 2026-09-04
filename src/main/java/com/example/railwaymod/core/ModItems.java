package com.example.railwaymod.core;

import com.example.railwaymod.items.TrackPlacerItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.railwaymod.RailwayMod.MOD_ID;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> TEST_TRACK_ITEM = ITEMS.register("test_track",
            () -> new BlockItem(ModBlocks.TEST_TRACK.get(), new Item.Properties()));

    public static final RegistryObject<Item> SIGNAL_BLOCK_ITEM = ITEMS.register("signal_block",
            () -> new BlockItem(ModBlocks.SIGNAL_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> TRACK_PLACER = ITEMS.register("track_placer",
            () -> new TrackPlacerItem(new Item.Properties()));

    private ModItems() {
    }
}
