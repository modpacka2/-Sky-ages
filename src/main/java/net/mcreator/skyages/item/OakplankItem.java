
package net.mcreator.skyages.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OakplankItem extends Item {
	public OakplankItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
