package ua.mambodancer.theterrifyingbeats.items;

import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;

public class ItemBase extends Item implements IHasModel  {
int maxStackSize = 64;
	public ItemBase(String name, int maxStackSize) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTTB);
		ModItems.ITEMS.add(this);
		setMaxStackSize(maxStackSize);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
	}
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	


}