
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.skyages.SkyAgesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkyAgesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyAgesMod.MODID);
	public static final RegistryObject<CreativeModeTab> TRANSITIONSBLOCKS = REGISTRY.register("transitionsblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sky_ages.transitionsblocks")).icon(() -> new ItemStack(SkyAgesModBlocks.CRUSHEDOAKLOGS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SkyAgesModBlocks.HOLEDIRT.get().asItem());
				tabData.accept(SkyAgesModBlocks.HOLEWITHROOTDIRT.get().asItem());
				tabData.accept(SkyAgesModBlocks.EARTHWORM_BOX.get().asItem());
			}).withSearchBar().build());
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
				tabData.accept(SkyAgesModItems.BASICSTONEKNIFE.get());
				tabData.accept(SkyAgesModItems.BASICSTONEBLADE.get());
				tabData.accept(SkyAgesModItems.OAKNAIL.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(SkyAgesModBlocks.EARTHWORMBOXDIRT.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SkyAgesModItems.ROOTS.get());
			tabData.accept(SkyAgesModItems.TINYPEBBLES.get());
			tabData.accept(SkyAgesModItems.OAKPLANK.get());
			tabData.accept(SkyAgesModItems.BASICSTONEBLADE.get());
			tabData.accept(SkyAgesModItems.OAKNAIL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SkyAgesModItems.ROOTFILTER.get());
			tabData.accept(SkyAgesModItems.BADSTONETRANSPLANTER.get());
			tabData.accept(SkyAgesModItems.BASICSTONETRANSPLANTER.get());
			tabData.accept(SkyAgesModItems.BASICSTONESAW.get());
			tabData.accept(SkyAgesModItems.EARTHWORM.get());
			tabData.accept(SkyAgesModItems.BASICSTONEHAMMER.get());
			tabData.accept(SkyAgesModItems.BASICSTONEKNIFE.get());
		}
	}
}
