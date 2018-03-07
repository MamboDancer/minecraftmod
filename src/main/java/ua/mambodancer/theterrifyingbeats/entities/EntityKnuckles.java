package ua.mambodancer.theterrifyingbeats.entities;

import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityKnuckles extends EntityWolf {

	public EntityKnuckles(World worldIn) {
		super(worldIn);
		
	}
	@Override
	public EntityWolf createChild(EntityAgeable ageable) {
		
		return new EntityKnuckles(world);
	}
	@Override
	protected SoundEvent getAmbientSound() {
		
		return super.getAmbientSound();
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		
		return super.getHurtSound(source);
	}
	@Override
	protected SoundEvent getDeathSound() {
	
		return super.getDeathSound();
	}
}