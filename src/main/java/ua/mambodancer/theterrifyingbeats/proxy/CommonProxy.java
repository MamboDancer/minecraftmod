package ua.mambodancer.theterrifyingbeats.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TESRAltar;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;
import ua.mambodancer.theterrifyingbeats.items.ItemBase;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInfusionAltar.class, new TESRAltar());
	}
	public void preInit(FMLPreInitializationEvent e) {
		
		
	}
	
        
}
