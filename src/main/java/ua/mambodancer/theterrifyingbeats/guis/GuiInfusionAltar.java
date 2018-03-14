package ua.mambodancer.theterrifyingbeats.guis;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import ua.mambodancer.theterrifyingbeats.blocks.slots.ContainerInfusionAltar;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.TileEntityInfusionAltar;
import ua.mambodancer.theterrifyingbeats.util.Reference;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.Minecraft;

import java.util.Random;


public class GuiInfusionAltar extends GuiContainer {

	private static final ResourceLocation TEXTURES = new ResourceLocation(
	Reference.MOD_ID, "textures/gui/infusionaltargui.png");
	private final InventoryPlayer player;
	private final TileEntityInfusionAltar tileentity;

	public GuiInfusionAltar(InventoryPlayer player, TileEntityInfusionAltar tileentity) {
		super(new ContainerInfusionAltar(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
//		String tileName = this.tileentity.getDisplayName().getUnformattedText();
//		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8,
//				4210752);
//		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2,
//				4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		if(TileEntityInfusionAltar.isBurning(tileentity))
		{
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 54 + 12 - k, 176, 12 - k, 14, k + 1);
		}
		
		int l = this.getCookProgressScaled(47);
		this.drawTexturedModalRect(this.guiLeft + 25, this.guiTop + 76, 177, 20, l + 1, 16);
	}

	private int getBurnLeftScaled(int pixels) {
		int i = this.tileentity.getField(1);
		if (i == 0)
			i = 200;
		return this.tileentity.getField(0) * pixels / i;
	}

	private int getCookProgressScaled(int pixels) {
		int i = this.tileentity.getField(2);
		int j = this.tileentity.getField(3);
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}