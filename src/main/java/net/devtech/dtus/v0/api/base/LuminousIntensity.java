package net.devtech.dtus.v0.api.base;

/**
 * a measurement of luminous intensity (eg. candela)
 *
 * The DTUS unit for displacement is light level (LL), the light level value of a block
 */
public class LuminousIntensity {
	public static final int LIGHT_LEVEL = 1;
	public static final double LIGHT_LEVEL_D = 1;

	// metric
	/**
	 * The ratio between the luminous intensity of an IRL candle and the minecraft candle
	 * .33333 cd/LL
	 */
	public static final double TO_CANDELAS = 1 / 3f;
	public static final double FROM_CANDELAS = 3;
}
