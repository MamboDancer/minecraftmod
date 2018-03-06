package ua.mambodancer.theterrifyingbeats.util.handlers;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import ua.mambodancer.theterrifyingbeats.blocks.slots.ContainerInfusionAltar;
//import ua.mambodancer.theterrifyingbeats.blocks.slots.ContainerInfusionAltar;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;
import ua.mambodancer.theterrifyingbeats.guis.GuiInfusionAltar;
//import ua.mambodancer.theterrifyingbeats.guis.GuiInfusionAltar;
import ua.mambodancer.theterrifyingbeats.util.Reference;

public class GuiHandler implements IGuiHandler
{	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_INFUSION_ALTAR) return new ContainerInfusionAltar(player.inventory, (TileEntityInfusionAltar)world.getTileEntity(new BlockPos(x,y,z))) ;
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_INFUSION_ALTAR) return new GuiInfusionAltar(player.inventory, (TileEntityInfusionAltar)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}

