package net.cactus.samuraimod;

import net.cactus.samuraimod.block.ModBlocks;
import net.cactus.samuraimod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SamuraiMod implements ModInitializer {
	public static final String MOD_ID = "samuraimod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
