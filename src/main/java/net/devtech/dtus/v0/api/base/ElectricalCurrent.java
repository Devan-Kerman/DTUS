package net.devtech.dtus.v0.api.base;

/**
 * Electrical current is a measure of charge per second.
 *
 * The DTUS unit for electrical current is the standard lightning strike (LS), the current of the average lightning strike
 */
public class ElectricalCurrent {
	public static final int STANDARD_LIGHTNING_STRIKE = 1;
	public static final double STANDARD_LIGHTNING_STRIKE_D = 1d;

	// metric
	/**
	 * The average amperage of an IRL lightning strike
	 *
	 * 2.27 mJ/BTT
	 */
	public static final double TO_AMPS = 30_000;
	public static final double FROM_AMPS = 1/TO_AMPS;
}
