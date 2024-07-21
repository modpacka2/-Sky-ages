package net.mcreator.skyages.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.skyages.network.SkyAgesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RespawnfallingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() < -64) {
			{
				Entity _ent = entity;
				_ent.teleportTo(SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z, _ent.getYRot(),
							_ent.getXRot());
			}
		}
	}
}
