package net.mcreator.skyages.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

import net.mcreator.skyages.SkyAgesMod;

import java.util.Map;

public class OnDirtrootTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = Blocks.ROOTED_DIRT.defaultBlockState();
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
				BlockPos _bp = BlockPos.containing(x, y + 1, z);
				BlockState _bs = Blocks.OAK_SAPLING.defaultBlockState();
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
			SkyAgesMod.queueServerWork(3, () -> {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			});
		}
	}
}
