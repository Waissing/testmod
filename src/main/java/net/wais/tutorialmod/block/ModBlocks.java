package net.wais.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.wais.tutorialmod.TutorialMod;
import net.wais.tutorialmod.item.ModItemGroup;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
			new Block(QuiltBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);

	public static final Block CITRINE_ORE = registerBlock("citrine_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
					UniformIntProvider.create(3, 7)), ModItemGroup.CITRINE);
	public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
					UniformIntProvider.create(3, 7)), ModItemGroup.CITRINE);

	private static Block registerBlock (String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
				new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));
		return item;
	}
	public static void registerModBlocks(){
		TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
	}
}
