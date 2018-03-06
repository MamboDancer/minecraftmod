package ua.mambodancer.theterrifyingbeats.blocks.slots;

import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;

public class SlotInfusionAltarFuel extends Slot {


	public SlotInfusionAltarFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityInfusionAltar.isItemFuel(stack);
	}

	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}