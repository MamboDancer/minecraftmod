package ua.mambodancer.theterrifyingbeats.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import ua.mambodancer.theterrifyingbeats.Main;
import ua.mambodancer.theterrifyingbeats.entities.EntityKnuckles;
import ua.mambodancer.theterrifyingbeats.util.Reference;

public class EntityInit {
	public static void registerEntities() {
		registerEntity("knuckles",EntityKnuckles.class,Reference.ENTITY_KNUCKLES,50,16711680,16777215);
	}
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range,int color1,int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id,Main.instance, range, 1, true,color1,color2);
	}
}
