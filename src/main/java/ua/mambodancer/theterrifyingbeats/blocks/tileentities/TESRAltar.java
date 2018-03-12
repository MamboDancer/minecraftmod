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
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import ua.mambodancer.theterrifyingbeats.init.ModBlocks;
import ua.mambodancer.theterrifyingbeats.init.ModItems;

public class TESRAltar extends TileEntitySpecialRenderer<TileEntityInfusionAltar> {

	//	EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().world,0,1,0, new ItemStack(Item.getItemFromBlock(ModBlocks.INFUSION_THING)));
	@Override
	public void render(TileEntityInfusionAltar te, double x, double y, double z, float partialTicks, int destroyStage,
			float alpha) {
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);

		EntityItem entityItem = new EntityItem(Minecraft.getMinecraft().world, 0, 0, 0, new ItemStack(Item.getItemFromBlock(ModBlocks.INFUSION_THING)));
		{

//			entityItem.hoverStart=0f;
//			GlStateManager.translate((float)x +0.5F, (float)y, (float)z +0.5F);
//			float speed = 2;
//			GlStateManager.rotate(angle, 0, 1, 0);
//			GlStateManager.translate(0, -0.7, 0);
			long angle = (System.currentTimeMillis() * 100) % 360;
			GlStateManager.translate(x, y, z);
            GlStateManager.translate(0.5, 1.2, 0.5);
            GlStateManager.rotate(angle, 0f, 0.1f, 0f);
			Minecraft.getMinecraft().getRenderManager().renderEntity(entityItem, 0, 0, 0, angle, 0f, true);
		}
		GlStateManager.popMatrix();
	}
}