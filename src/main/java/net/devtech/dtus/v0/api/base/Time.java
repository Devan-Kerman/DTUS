package net.devtech.dtus.v0.api.base;

/**
 * A measurement of time (eg. second)
 *
 * the DTUS unit for mass is the tick (T), which is 1/20th of a second
 */
public class Time {
	/**
	 * the symbol for Tick is 'T'
	 */
	public static final int TICK = 1;
	public static final double TICK_D = 1;
	public static final double TO_SECONDS = 1/20d;
	public static final double FROM_SECONDS = 1/TO_SECONDS;
}
