package ua.mambodancer.theterrifyingbeats.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;

public class ToolAxe extends ItemTool implements IHasModel {

		private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

	    public ToolAxe(String name, ToolMaterial material)
	    {
	        super(material, EFFECTIVE_ON);
	        setUnlocalizedName(name);
	        setRegistryName(name);
	        setCreativeTab(Main.tabTTB);
	        
	        ModItems.ITEMS.add(this);
	    }

//	    public float getStrVsBlock(ItemStack stack, IBlockState state)
//	    {
//	        Material material = state.getMaterial();
//	        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
//	    }

	    @Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	}


