
package net.mcreator.skyages.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EarthwormItem extends Item {
	public EarthwormItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
