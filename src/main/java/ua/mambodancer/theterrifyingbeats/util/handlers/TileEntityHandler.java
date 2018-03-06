package ua.mambodancer.theterrifyingbeats.util.handlers;


import net.minecraftforge.fml.common.registry.GameRegistry;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityInfusionAltar.class, "infusionaltar");
	}
}