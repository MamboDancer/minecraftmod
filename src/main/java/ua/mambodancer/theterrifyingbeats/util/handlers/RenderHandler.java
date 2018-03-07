//package ua.mambodancer.theterrifyingbeats.util.handlers;
//
//
//import net.minecraft.client.renderer.entity.Render;
//import net.minecraft.client.renderer.entity.RenderManager;
//import net.minecraftforge.fml.client.registry.IRenderFactory;
//import net.minecraftforge.fml.client.registry.RenderingRegistry;
//import ua.mambodancer.theterrifyingbeats.entities.EntityKnuckles;
//import ua.mambodancer.theterrifyingbeats.entity.render.RenderKnuckles;
//
//public class RenderHandler 
//{
//	public static void registerEntityRenders()
//	{
//		RenderingRegistry.registerEntityRenderingHandler(EntityKnuckles.class, new IRenderFactory<EntityKnuckles>()
//		{
//			@Override
//			public Render<? super EntityKnuckles> createRenderFor(RenderManager manager) 
//			{
//				return new RenderKnuckles(manager);
//			}
//		});
//	}
//}
