package ua.mambodancer.theterrifyingbeats.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ua.mambodancer.theterrifyingbeats.blocks.BlockBase;
import ua.mambodancer.theterrifyingbeats.blocks.CathalyzatorBlock;
import ua.mambodancer.theterrifyingbeats.blocks.InfusionAltarBlock;
import ua.mambodancer.theterrifyingbeats.blocks.InfusionThingBlock;
import ua.mambodancer.theterrifyingbeats.blocks.TheTerrifyingBlock;
//import ua.mambodancer.theterrifyingbeats.blocks.crops.BlockCropCathalyzator;
import ua.mambodancer.theterrifyingbeats.util.Reference;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public final static Block THE_TERRIFYING_INGOT_BLOCK = new TheTerrifyingBlock(Reference.MOD_ID + ":" + "theterrifyingblock", Material.IRON);
	public final static Block CATHALYST_BLOCK = new CathalyzatorBlock(Reference.MOD_ID + ":" + "cathalyzatorblock",Material.IRON);
	public final static Block INFUSION_ALTAR = new InfusionAltarBlock(Reference.MOD_ID + ":" + "infusionaltar", Material.IRON);
	public final static Block INFUSION_THING= new InfusionThingBlock(Reference.MOD_ID + ":" + "infusionthing", Material.ANVIL);
//	public final static Block BLOCK_CROP_CATHALYZATOR= new BlockCropCathalyzator();
	
}
