package net.devtech.dtus.v0.api.derived;

import net.devtech.dtus.internal.ValidateInternal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.fabricmc.fabric.api.registry.FuelRegistry;

/**
 * A measurement of energy (eg. joule)
 *
 * the DTUS unit for energy is the Burn Time Tick (BTT), the amount of energy released when any fuel burns for 1 tick
 *
 * Canonically the furnace is 50% efficient at transferring energy, 50% of the energy is lost to the environment via heat/sound/light
 */
public class Energy {
	public static final int BURN_TIME_TICKS = 1;
	public static final double BURN_TIME_TICKS_D = 1d;
	// metric
	/**
	 * the ratio between the amount of energy stored in 1 cubic meter of bituminous coal and 1 block of coal.
	 * Coal was chosen arbitrarily, all of minecraft's fuel values do not add up appropriately.
	 *
	 * 2.27 mJ/BTT
	 */
	public static final double TO_MEGA_JOULES = 36_342d / 16000;
	public static final double TO_JOULES = TO_MEGA_JOULES * 1_000_000;
	public static final double FROM_JOULES = 1 / TO_JOULES;
	// customary
	public static final double TO_BTU = TO_JOULES / 1055.06;
	public static final double FROM_BTU = 1 / TO_BTU;

	/**
	 * @return the amount of energy this item will produce when burned
	 */
	public static int getEnergy(Item item) {
		return ValidateInternal.ifN(FuelRegistry.INSTANCE.get(item), 0);
	}

	public static int getEnergy(ItemStack stack) {
		return ValidateInternal.ifN(FuelRegistry.INSTANCE.get(stack.getItem()), 0);
	}
}
