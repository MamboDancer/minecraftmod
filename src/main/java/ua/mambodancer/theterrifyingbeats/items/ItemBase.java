package ua.mambodancer.theterrifyingbeats.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;

public class ItemBase extends Item implements IHasModel  {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTTB);
		
		ModItems.ITEMS.add(this);	
		}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
	}

}
