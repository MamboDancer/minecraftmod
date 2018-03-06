package ua.mambodancer.theterrifyingbeats.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;

public class ToolHoe extends ItemHoe implements IHasModel {
	public ToolHoe(String name ,ToolMaterial material) {
		super(material);
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

