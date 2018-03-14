//package ua.mambodancer.theterrifyingbeats.blocks.crops;
//
//import net.minecraft.block.BlockCrops;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemBlock;
//import ua.mambodancer.theterrifyingbeats.Main;
//import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
//import ua.mambodancer.theterrifyingbeats.init.ModItems;
//import ua.mambodancer.theterrifyingbeats.util.IHasModel;
//
//public class BlockCropCathalyzator extends BlockCrops implements IHasModel{
//
//	public BlockCropCathalyzator() {
//		setUnlocalizedName("cathalyzatorcrop");
//		setRegistryName("cathalyzatorcrop");
//		ModBlocks.BLOCKS.add(this);
//		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
//		setCreativeTab(Main.tabTTB);
//	}
//	
//	@Override
//	protected Item getSeed() {
//		return ModItems.CATHALYZATOR_SEEDS;
//	}
//	
//	@Override
//	protected Item getCrop() {
//		return ModItems.CATHALYZATOR_ESSENCE;
//	}
//	@Override
//	public void registerModels() {
//		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
//		
//	}
//
//}
