package net.mcreator.skyages.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.skyages.network.SkyAgesModVariables;
import net.mcreator.skyages.SkyAgesMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnWorldStartProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SkyAgesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SkyAgesModVariables.PlayerVariables())).As_enter_skyblock == false) {
			if (SkyAgesModVariables.WorldVariables.get(world).As_generated_skyblock == false) {
				{
					boolean _setval = true;
					entity.getCapability(SkyAgesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.As_enter_skyblock = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("sky_ages:skyblockzone"));
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			} else {
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("sky_ages:skyblockzone"));
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				SkyAgesMod.queueServerWork(3, () -> {
					{
						Entity _ent = entity;
						_ent.teleportTo(SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z,
									_ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(),
								BlockPos.containing(SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y, SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z),
								_serverPlayer.getYRot(), true, false);
				});
			}
		}
	}
}
