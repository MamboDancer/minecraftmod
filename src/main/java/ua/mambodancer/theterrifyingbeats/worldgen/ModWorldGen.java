//package ua.mambodancer.theterrifyingbeats.worldgen;
//
//import java.util.Random;
//
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.gen.feature.WorldGenMinable;
//import net.minecraftforge.fml.common.IWorldGenerator;
//
//public class ModWorldGen implements IWorldGenerator {
//	
//	
//
//	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
//		int deltaY = maxY - minY;
//	
//		for (int i = 0; i < chances; i++) {
//			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
//	
//			WorldGenMinable generator = new WorldGenMinable(ore, size);
//			generator.generate(world, random, pos);
//		}
//	}
//
//}