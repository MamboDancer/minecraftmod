package ua.mambodancer.theterrifyingbeats.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

	public class CathalyzatorBlock extends BlockBase {

		public CathalyzatorBlock(String name, Material material) {
			super(name, material);
			
			setSoundType(SoundType.METAL);
			setHardness(5.0f);
			setResistance(15f);//obsidian
			setHarvestLevel("pickaxe",2);
			setLightLevel(0f);
			//setLightOpacity(0);
			//setBlockUnbreakable();
		}

	}

