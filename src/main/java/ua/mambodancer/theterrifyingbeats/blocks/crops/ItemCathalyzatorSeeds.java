//package ua.mambodancer.theterrifyingbeats.blocks.crops;
//
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.init.Blocks;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemSeeds;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//import ua.mambodancer.theterrifyingbeats.Main;
//import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
//import ua.mambodancer.theterrifyingbeats.util.IHasModel;
//
//public class ItemCathalyzatorSeeds extends ItemSeeds implements IHasModel{
//	public ItemCathalyzatorSeeds() {
//		super(ModBlocks.BLOCK_CROP_CATHALYZATOR, Blocks.FARMLAND);
//		setUnlocalizedName("cathalyzatorseeds");
//		setRegistryName("cathalyzatorseeds");
//		setCreativeTab(Main.tabTTB);
//	}
//	
//	
//	@Override
//	public void registerModels() {
//		Main.proxy.registerItemRenderer(this , 0 , "inventory");
//	}
//	@SideOnly(Side.CLIENT)
//	public void initModel() {
//		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
//	}
//}
