package net.wais.tutorialmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.wais.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wais.tutorialmod.item.ModItems;
public class ModItemGroup {
	public static ItemGroup CITRINE;

	public static void registerItemGroups() {
		CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
				.name(Text.translatable("itemgroup.citrine"))
				.icon(() -> new ItemStack(ModItems.CITRINE)).build();

}}
