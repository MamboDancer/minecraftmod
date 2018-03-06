package ua.mambodancer.theterrifyingbeats.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ua.mambodancer.theterrifyingbeats.blocks.BlockBase;
import ua.mambodancer.theterrifyingbeats.blocks.InfusionAltarBlock;
import ua.mambodancer.theterrifyingbeats.blocks.TheTerrifyingBlock;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block THE_TERRIFYING_INGOT_BLOCK = new TheTerrifyingBlock("theterrifyingblock", Material.IRON);
	
	public static final Block INFUSION_ALTAR = new InfusionAltarBlock("infusionaltar");
}
