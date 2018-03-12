//package ua.mambodancer.theterrifyingbeats.items;
//
//import java.util.function.Function;
//
//import net.minecraft.client.renderer.block.model.IBakedModel;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.client.renderer.entity.RenderEntityItem;
//import net.minecraft.client.renderer.texture.TextureAtlasSprite;
//import net.minecraft.client.renderer.vertex.VertexFormat;
//import net.minecraft.client.resources.IResourceManager;
//import net.minecraft.item.Item;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.client.model.ICustomModelLoader;
//import net.minecraftforge.client.model.IModel;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.common.model.IModelState;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//import ua.mambodancer.theterrifyingbeats.util.IHasModel;
//import ua.mambodancer.theterrifyingbeats.util.Reference;
//
//public class InfusionThing extends Item {
//
//	public InfusionThing() {
//        setRegistryName("infusionthing");
//        setUnlocalizedName(Reference.MOD_ID + ".simpletextureditem");
//    }
//
//    @SideOnly(Side.CLIENT)
//    public void initModel() {
//        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
//    }
//	
//
//}
