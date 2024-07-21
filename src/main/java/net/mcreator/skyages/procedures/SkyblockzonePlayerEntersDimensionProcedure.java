package net.mcreator.skyages.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.skyages.network.SkyAgesModVariables;

public class SkyblockzonePlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (SkyAgesModVariables.WorldVariables.get(world).As_generated_skyblock == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("sky_ages", "spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(entity.getX(), entity.getY() - 5, entity.getZ()), BlockPos.containing(entity.getX(), entity.getY() - 5, entity.getZ()),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), _serverPlayer.getYRot(), true, false);
			SkyAgesModVariables.WorldVariables.get(world).Spawnpoint_X = entity.getX();
			SkyAgesModVariables.WorldVariables.get(world).syncData(world);
			SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Y = entity.getY();
			SkyAgesModVariables.MapVariables.get(world).syncData(world);
			SkyAgesModVariables.MapVariables.get(world).Spawnpoint_Z = entity.getZ();
			SkyAgesModVariables.MapVariables.get(world).syncData(world);
			SkyAgesModVariables.WorldVariables.get(world).As_generated_skyblock = true;
			SkyAgesModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
