package ua.mambodancer.theterrifyingbeats.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class InfusionThingBlock extends BlockBase {
	public InfusionThingBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15f);//obsidian
		setHarvestLevel("pickaxe",2);
		setLightLevel(0f);
		
		//setLightOpacity(0);
		//setBlockUnbreakable();
}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}