package ua.mambodancer.theterrifyingbeats;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ua.mambodancer.theterrifyingbeats.init.ModItems;
import ua.mambodancer.theterrifyingbeats.proxy.CommonProxy;
import ua.mambodancer.theterrifyingbeats.util.Reference;
import ua.mambodancer.theterrifyingbeats.util.handlers.GuiHandler;
import ua.mambodancer.theterrifyingbeats.util.handlers.RecipeHandler;
import ua.mambodancer.theterrifyingbeats.util.handlers.RegistryHandler;
import ua.mambodancer.theterrifyingbeats.worldgen.ModWorldGeneration;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME,version = Reference.VERSION)
public class Main {
	@Instance 
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
	
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
		RegistryHandler.initRegistries();
	}
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
		
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event){
		
	}
	public static CreativeTabs tabTTB = new CreativeTabs("tab_ttb") {
		@Override
		public ItemStack getTabIconItem() {
			//setBackgroundImageName("tb:tab_ttb.png");
			return new ItemStack(ModItems.THE_TERRIFYING_INGOT);
		}
	};
}



