package ua.mambodancer.theterrifyingbeats.blocks.tileentities;

import java.util.List;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
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
		
	private static final EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().world,0,0,0, new ItemStack(Item.getItemFromBlock(ModBlocks.INFUSION_THING)));
	@Override
	public void render(TileEntityInfusionAltar te, double x, double y, double z, float partialTicks, int destroyStage,
			float alpha) {
		ITEM.hoverStart = 1f;
		Minecraft.getMinecraft().getRenderManager().renderEntity(ITEM, 0, 0, 0, 0f, partialTicks, false);
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);
		
		GlStateManager.pushMatrix();
        {
        	
        	GlStateManager.translate(x, y, z);
            GlStateManager.translate(0.5, 1.25, 0.5);
            GlStateManager.rotate((te.getWorld().getTotalWorldTime()+ partialTicks) * 3f, 0f, 1f, 0f);
        }
        GlStateManager.popMatrix();
	}
}