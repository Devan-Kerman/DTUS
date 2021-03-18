package net.devtech.dtus.v0.api.derived;

import net.devtech.dtus.v0.api.base.Displacement;

/**
 * pressure is force over area.
 *
 * The DTUS unit for pressure is the bles (bs) and it is defined as beter per block squared
 */
@SuppressWarnings ("ALL")
public class Pressure {
	public static final int BLES = 1;
	public static final double BLES_D = Force.BETER_D / (Displacement.BLOCK_LENGTH_D * Displacement.BLOCK_LENGTH_D);
}
