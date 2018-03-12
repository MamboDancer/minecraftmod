package ua.mambodancer.theterrifyingbeats.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TESRAltar;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;
import ua.mambodancer.theterrifyingbeats.util.Reference;

public class ClientProxy extends CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInfusionAltar.class, new TESRAltar());
	}
	  
      public void preInit(FMLPreInitializationEvent e) {
          super.preInit(e);

          OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
      }
      public void init() {
    	  ClientRegistry.bindTileEntitySpecialRenderer(TileEntityInfusionAltar.class, new TESRAltar());
      }
}
