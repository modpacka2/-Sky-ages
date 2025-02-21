package net.mcreator.skyages.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.skyages.init.SkyAgesModBlocks;

import java.util.Map;

public class CrushedlogsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = SkyAgesModBlocks.CRUSHEDOAKLOGS.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(2, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
