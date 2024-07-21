package net.mcreator.skyages.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StopPlantingSaplingProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == Blocks.OAK_SAPLING || blockstate.getBlock() == Blocks.SPRUCE_SAPLING || blockstate.getBlock() == Blocks.BIRCH_SAPLING || blockstate.getBlock() == Blocks.JUNGLE_SAPLING
				|| blockstate.getBlock() == Blocks.ACACIA_SAPLING || blockstate.getBlock() == Blocks.DARK_OAK_SAPLING || blockstate.getBlock() == Blocks.CHERRY_SAPLING) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
