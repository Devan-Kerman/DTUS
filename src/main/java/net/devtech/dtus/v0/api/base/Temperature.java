package net.devtech.dtus.v0.api.base;

import net.devtech.dtus.v0.api.derived.Pressure;

/**
 * Temperature is a measure of average kinetic energy.
 *
 * the DTUS unit for temperature is the crob (cb) and it is defined as bles block cubed per stack.
 * This comes from the ideal gas formula, the ideal gas constant of the DTUS unit system is 1
 */
public class Temperature {
	public static final double CROB = Pressure.BLES_D * (Displacement.BLOCK_LENGTH_D * Displacement.BLOCK_LENGTH_D * Displacement.BLOCK_LENGTH_D) / Amount.STANDARD_STACK_D;

}
