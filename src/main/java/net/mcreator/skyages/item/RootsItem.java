
package net.mcreator.skyages.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.skyages.procedures.RightclickrootonholedirtProcedure;

import java.util.List;

public class RootsItem extends Item {
	public RootsItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.1f).build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("The root to the success"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RightclickrootonholedirtProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
