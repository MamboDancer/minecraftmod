package ua.mambodancer.theterrifyingbeats.util.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
import ua.mambodancer.theterrifyingbeats.init.ModItems;

public class RecipeHandler {
	public static void registerCrafting() {
		GameRegistry.addShapedRecipe(new ResourceLocation("ttb:pickaxe_terrifyingcraft"), new ResourceLocation("ttb:tools"), new ItemStack(ModItems.THE_TERRIFYING_PICK_AXE), new Object[] {"XXX"," S "," S ",'X',ModBlocks.THE_TERRIFYING_INGOT_BLOCK,'S', Items.STICK});
		GameRegistry.addShapelessRecipe(new ResourceLocation("ttb:theterrifyingingot"), new ResourceLocation("ttb:materials"), new ItemStack(ModItems.THE_TERRIFYING_INGOT,9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.THE_TERRIFYING_INGOT_BLOCK))});
		}
	public static void registerSmelting() {
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ModItems.THE_TERRIFYING_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.THE_TERRIFYING_INGOT_BLOCK, new ItemStack(ModItems.THE_TERRIFYING_SWORD, 1), 100.2f);
	}
}
