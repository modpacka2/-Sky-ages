
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skyages.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.skyages.world.inventory.EarthwormGUIMenu;
import net.mcreator.skyages.SkyAgesMod;

public class SkyAgesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SkyAgesMod.MODID);
	public static final RegistryObject<MenuType<EarthwormGUIMenu>> EARTHWORM_GUI = REGISTRY.register("earthworm_gui", () -> IForgeMenuType.create(EarthwormGUIMenu::new));
}
