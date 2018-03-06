package ua.mambodancer.theterrifyingbeats.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;
import net.minecraft.item.ItemSpade;;

public class ToolShovel extends ItemSpade implements IHasModel{

	public ToolShovel(String name ,ToolMaterial material) {
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