
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.skyages.item.TinypebblesItem;
import net.mcreator.skyages.item.RootsItem;
import net.mcreator.skyages.item.RootfilterItem;
import net.mcreator.skyages.item.OakplankItem;
import net.mcreator.skyages.item.OaknailskitItem;
import net.mcreator.skyages.item.OaknailItem;
import net.mcreator.skyages.item.EarthwormItem;
import net.mcreator.skyages.item.BasicstonetransplanterItem;
import net.mcreator.skyages.item.BasicstonesawItem;
import net.mcreator.skyages.item.BasicstoneknifeItem;
import net.mcreator.skyages.item.BasicstonehammerItem;
import net.mcreator.skyages.item.BasicstonebladeItem;
import net.mcreator.skyages.item.BadstonetransplanterItem;
import net.mcreator.skyages.SkyAgesMod;

public class SkyAgesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SkyAgesMod.MODID);
	public static final RegistryObject<Item> ROOTS = REGISTRY.register("roots", () -> new RootsItem());
	public static final RegistryObject<Item> ROOTFILTER = REGISTRY.register("rootfilter", () -> new RootfilterItem());
	public static final RegistryObject<Item> TINYPEBBLES = REGISTRY.register("tinypebbles", () -> new TinypebblesItem());
	public static final RegistryObject<Item> BADSTONETRANSPLANTER = REGISTRY.register("badstonetransplanter", () -> new BadstonetransplanterItem());
	public static final RegistryObject<Item> BASICSTONETRANSPLANTER = REGISTRY.register("basicstonetransplanter", () -> new BasicstonetransplanterItem());
	public static final RegistryObject<Item> BASICSTONESAW = REGISTRY.register("basicstonesaw", () -> new BasicstonesawItem());
	public static final RegistryObject<Item> OAKPLANK = REGISTRY.register("oakplank", () -> new OakplankItem());
	public static final RegistryObject<Item> EARTHWORM = REGISTRY.register("earthworm", () -> new EarthwormItem());
	public static final RegistryObject<Item> BASICSTONEHAMMER = REGISTRY.register("basicstonehammer", () -> new BasicstonehammerItem());
	public static final RegistryObject<Item> CRUSHEDOAKLOGS = block(SkyAgesModBlocks.CRUSHEDOAKLOGS);
	public static final RegistryObject<Item> BASICSTONEKNIFE = REGISTRY.register("basicstoneknife", () -> new BasicstoneknifeItem());
	public static final RegistryObject<Item> BASICSTONEBLADE = REGISTRY.register("basicstoneblade", () -> new BasicstonebladeItem());
	public static final RegistryObject<Item> OAKNAIL = REGISTRY.register("oaknail", () -> new OaknailItem());
	public static final RegistryObject<Item> OAKNAILSKIT = REGISTRY.register("oaknailskit", () -> new OaknailskitItem());
	public static final RegistryObject<Item> HOLEDIRT = block(SkyAgesModBlocks.HOLEDIRT);
	public static final RegistryObject<Item> HOLEWITHROOTSDIRT = block(SkyAgesModBlocks.HOLEWITHROOTSDIRT);
	public static final RegistryObject<Item> EARTHWORMBOX = block(SkyAgesModBlocks.EARTHWORMBOX);
	public static final RegistryObject<Item> EARTHWORMBOXDIRT = block(SkyAgesModBlocks.EARTHWORMBOXDIRT);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
