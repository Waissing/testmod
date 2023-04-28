package net.wais.tutorialmod;


import net.wais.tutorialmod.block.ModBlocks;
import net.wais.tutorialmod.item.ModItemGroup;
import net.wais.tutorialmod.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
