package net.devtech.dtus.v0.api.base;

import net.devtech.dtus.v0.api.derived.Energy;

/**
 * A measurement of mass (eg. kilogram)
 *
 * the DTUS unit for mass is the conq (cq), the amount of mass for which traveling at 1 B/T makes it's kinetic energy equal to 1 BTT
 */
@SuppressWarnings ("PointlessArithmeticExpression")
public class Mass {
	public static final int CONQ = 1;
	public static final double CONQ_D = Energy.BURN_TIME_TICKS_D * (Time.TICK_D * Time.TICK_D) / (Displacement.BLOCK_LENGTH_D * Displacement.BLOCK_LENGTH_D);
	public static final double MILLI_CONQ = CONQ_D / 1000;

	// metric
	/**
	 * 5678.4375 kg/cq
	 */
	public static final double TO_KILOGRAMS = Energy.TO_JOULES * (Time.TO_SECONDS * Time.TO_SECONDS) / (Displacement.TO_METERS * Displacement.TO_METERS);
	public static final double FROM_KILOGRAMS = 1 / TO_KILOGRAMS;

	// customary
	public static final double TO_POUNDS = 2.20462442 * TO_KILOGRAMS;
	public static final double FROM_POUNDS = 1 / TO_POUNDS;
}
