package ua.mambodancer.theterrifyingbeats.blocks.tileentities;

import java.util.List;
import ua.mambodancer.theterrifyingbeats.blocks.tileentities.*;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
import ua.mambodancer.theterrifyingbeats.init.ModItems;

public class TESRAltar extends TileEntitySpecialRenderer<TileEntityInfusionAltar> {
	public final EntityItem entityItem = new EntityItem(Minecraft.getMinecraft().world, 0, 0, 0, new ItemStack(Item.getItemFromBlock(ModBlocks.INFUSION_THING)));
	@Override
	public void render(TileEntityInfusionAltar te, double x, double y, double z, float partialTicks, int destroyStage,
			float unused) {
		super.render(te, x, y, z, partialTicks, destroyStage, unused);
		{
			GlStateManager.pushMatrix();	
			long angle = (System.currentTimeMillis() / 40) % 360;
			GlStateManager.translate(x, y, z);
            GlStateManager.translate(0.5, 1.2, 0.5);
            GlStateManager.rotate(0f, 0, 1, 0); //Rotating everything
        	GlStateManager.rotate(-angle, 0, 1, 0); //reverting the rotation with an equal but negative angle
			Minecraft.getMinecraft().getRenderManager().renderEntity(entityItem, 0, 0, 0, partialTicks, 0f, true);
		}
		GlStateManager.popMatrix();
		
	}
	
	
}