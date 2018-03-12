package ua.mambodancer.theterrifyingbeats.recipes;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
public class InfusionAltarRecipes {


	private static final InfusionAltarRecipes INSTANCE = new InfusionAltarRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static InfusionAltarRecipes getInstance()
	{
		return INSTANCE;
	}

	private InfusionAltarRecipes() 
	{// создавать по рецепту в каждий слот
		addAltarRecipe(new ItemStack(ModItems.UNINFUSED_STAR), new ItemStack(ModItems.CATHALYZATOR_INGOT), new ItemStack(ModItems.INFUSED_STAR), 555.0F);
		addAltarRecipe(new ItemStack(Items.DIAMOND), new ItemStack(Items.EGG), new ItemStack(Items.ELYTRA),  555.0F);
		addAltarRecipe(new ItemStack(ModItems.INFUSED_STAR), new ItemStack(ModItems.UNINFUSED_PICK_AXE), new ItemStack(ModItems.ONE_TIME_INFUSED_PICKAXE), 555.0F);
		addAltarRecipe(new ItemStack(ModItems.INFUSED_STAR), new ItemStack(ModItems.ONE_TIME_INFUSED_PICKAXE), new ItemStack(ModItems.TWO_TIME_INFUSED_PICKAXE), 555.0F);
		addAltarRecipe(new ItemStack(ModItems.INFUSED_STAR), new ItemStack(ModItems.TWO_TIME_INFUSED_PICKAXE), new ItemStack(ModItems.THREE_TIME_INFUSED_PICKAXE), 555.0F);
	}


	public void addAltarRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getAltarRecipe(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getAltarRecipe(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getAltarExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}