package ua.mambodancer.theterrifyingbeats.items;

import java.awt.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.util.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	public ToolPickaxe(String name ,ToolMaterial material) {
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
