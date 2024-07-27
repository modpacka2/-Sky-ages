
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.skyages.block.HolewithrootsdirtBlock;
import net.mcreator.skyages.block.HoledirtBlock;
import net.mcreator.skyages.block.EarthwormboxdirtBlock;
import net.mcreator.skyages.block.EarthwormboxBlock;
import net.mcreator.skyages.block.CrushedoaklogsBlock;
import net.mcreator.skyages.SkyAgesMod;

public class SkyAgesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SkyAgesMod.MODID);
	public static final RegistryObject<Block> CRUSHEDOAKLOGS = REGISTRY.register("crushedoaklogs", () -> new CrushedoaklogsBlock());
	public static final RegistryObject<Block> HOLEDIRT = REGISTRY.register("holedirt", () -> new HoledirtBlock());
	public static final RegistryObject<Block> HOLEWITHROOTSDIRT = REGISTRY.register("holewithrootsdirt", () -> new HolewithrootsdirtBlock());
	public static final RegistryObject<Block> EARTHWORMBOX = REGISTRY.register("earthwormbox", () -> new EarthwormboxBlock());
	public static final RegistryObject<Block> EARTHWORMBOXDIRT = REGISTRY.register("earthwormboxdirt", () -> new EarthwormboxdirtBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
