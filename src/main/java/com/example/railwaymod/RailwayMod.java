package com.example.railwaymod;

import com.example.railwaymod.core.ModBlocks;
import com.example.railwaymod.core.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RailwayMod.MOD_ID)
public class RailwayMod {
    public static final String MOD_ID = "railwaymod";

    public RailwayMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
