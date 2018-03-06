package ua.mambodancer.theterrifyingbeats.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TheTerrifyingBlock extends BlockBase {

	public TheTerrifyingBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(15.0f);
		setResistance(6000f);//obsidian
		setHarvestLevel("pickaxe",3);
		setLightLevel(1f);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
