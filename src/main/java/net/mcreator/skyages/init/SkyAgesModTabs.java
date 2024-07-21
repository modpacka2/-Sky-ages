
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.skyages.SkyAgesMod;

public class SkyAgesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyAgesMod.MODID);
	public static final RegistryObject<CreativeModeTab> SKYAGES = REGISTRY.register("skyages",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sky_ages.skyages")).icon(() -> new ItemStack(SkyAgesModItems.ROOTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SkyAgesModItems.ROOTS.get());
				tabData.accept(SkyAgesModItems.ROOTFILTER.get());
				tabData.accept(SkyAgesModItems.TINYPEBBLES.get());
				tabData.accept(SkyAgesModItems.BADSTONETRANSPLANTER.get());
				tabData.accept(SkyAgesModBlocks.HOLEDIRT.get().asItem());
				tabData.accept(SkyAgesModBlocks.HOLEWITHROOTDIRT.get().asItem());
				tabData.accept(SkyAgesModItems.BASICSTONETRANSPLANTER.get());
				tabData.accept(SkyAgesModItems.BASICSTONESAW.get());
				tabData.accept(SkyAgesModItems.OAKPLANK.get());
				tabData.accept(SkyAgesModBlocks.EARTHWORM_BOX.get().asItem());
				tabData.accept(SkyAgesModBlocks.EARTHWORMBOXDIRT.get().asItem());
				tabData.accept(SkyAgesModItems.EARTHWORM.get());
				tabData.accept(SkyAgesModItems.BASICSTONEHAMMER.get());
				tabData.accept(SkyAgesModBlocks.CRUSHEDOAKLOGS.get().asItem());
			}).withSearchBar().build());
}
