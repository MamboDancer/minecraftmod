package ua.mambodancer.theterrifyingbeats.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ua.mambodancer.theterrifyingbeats.items.ArmourBase;
import ua.mambodancer.theterrifyingbeats.items.ItemBase;
import ua.mambodancer.theterrifyingbeats.items.ToolAxe;
import ua.mambodancer.theterrifyingbeats.items.ToolHoe;
import ua.mambodancer.theterrifyingbeats.items.ToolPickaxe;
import ua.mambodancer.theterrifyingbeats.items.ToolShovel;
import ua.mambodancer.theterrifyingbeats.items.ToolSword;
import ua.mambodancer.theterrifyingbeats.util.Reference;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item> ();
	
	// MATERIAL
	public static final ToolMaterial TOOL_TERRIFYING = EnumHelper.addToolMaterial("tool_terrifying", 3, 1488, 10.0f, 10, 30);
	public static final ArmorMaterial ARMOR_TERRIFYING = EnumHelper.addArmorMaterial("armor_terrifyng", Reference.MOD_ID + ":terrifying", 1500,new int[] {10,50,50,10}, 5,  SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);
	
	
	
	//ITEMS
	public static final Item THE_TERRIFYING_INGOT = new ItemBase("theterrifyingingot");
	//TOOLS
	public static final Item THE_TERRIFYING_PICK_AXE = new ToolPickaxe("pickaxe_terrifying",TOOL_TERRIFYING);
//	public static final Item THE_TERRIFYING_AXE = new ToolAxe("theterrifyingaxe_terrifying",TOOL_TERRIFYING);
//	public static final Item THE_TERRIFYING_HOE = new ToolHoe("theterrifyinghoe_terrifying",TOOL_TERRIFYING);
//	public static final Item THE_TERRIFYING_SHOVEL = new ToolShovel("theterrifyingshovel_terrifying",TOOL_TERRIFYING);
	public static final Item THE_TERRIFYING_SWORD = new ToolSword("sword_terrifying",TOOL_TERRIFYING);
	//ARMOR
//	public static final Item THE_TERRIFYING_HELMET = new ArmourBase("terrifyinghelmet", ARMOR_TERRIFYING,1,EntityEquipmentSlot.HEAD);
//	public static final Item THE_TERRIFYING_CHEST = new ArmourBase("terrifyinghelmet", ARMOR_TERRIFYING,1,EntityEquipmentSlot.CHEST);
//	public static final Item THE_TERRIFYING_LEGS = new ArmourBase("terrifyinghelmet", ARMOR_TERRIFYING,2,EntityEquipmentSlot.LEGS);
//	public static final Item THE_TERRIFYING_BOOTS = new ArmourBase("terrifyinghelmet", ARMOR_TERRIFYING,1,EntityEquipmentSlot.FEET);
	
}

	