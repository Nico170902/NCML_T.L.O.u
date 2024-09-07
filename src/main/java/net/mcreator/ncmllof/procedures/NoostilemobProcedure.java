package net.mcreator.ncmllof.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ncmllof.NcmllofMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoostilemobProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.getMobType() == MobType.UNDEAD || entity instanceof LivingEntity _livEnt1 && _livEnt1.getMobType() == MobType.ARTHROPOD || entity instanceof Creeper || entity instanceof EnderMan) {
			NcmllofMod.queueServerWork(2, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
	}
}
