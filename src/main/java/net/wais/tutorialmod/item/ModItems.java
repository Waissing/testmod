package net.wais.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wais.tutorialmod.TutorialMod;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item CITRINE = registerItem("citrine",
			new Item(new QuiltItemSettings()));
	public static final Item RAW_CITRINE = registerItem("raw_citrine",
			new Item(new QuiltItemSettings()));



	public static Item registerItem(String name, Item item){
		return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
	}

	private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));
	}



	public static void	registerModItems(){
		TutorialMod.LOGGER.info("Register Mod Items for" + TutorialMod.MOD_ID);

	}
}

