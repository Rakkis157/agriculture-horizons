package net.rakkis157.agriculture_horizons;

import net.fabricmc.api.ModInitializer;
import net.rakkis157.agriculture_horizons.block.AgricultureHorizonsBlocks;
import net.rakkis157.agriculture_horizons.item.AgricultureHorizonsItems;

public class AgricultureHorizons implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "agriculture_horizons";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AgricultureHorizonsItems.registerModItems();
		AgricultureHorizonsBlocks.registerModBlocks();
	}
}
