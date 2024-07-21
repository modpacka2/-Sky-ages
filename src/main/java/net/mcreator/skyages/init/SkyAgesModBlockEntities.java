
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.skyages.block.entity.EarthwormboxdirtBlockEntity;
import net.mcreator.skyages.SkyAgesMod;

public class SkyAgesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SkyAgesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> EARTHWORMBOXDIRT = register("earthwormboxdirt", SkyAgesModBlocks.EARTHWORMBOXDIRT, EarthwormboxdirtBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
