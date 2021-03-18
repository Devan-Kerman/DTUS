package net.devtech.dtus.v0.api.derived;

import net.devtech.dtus.v0.api.base.Mass;

/**
 * Force is mass times acceleration
 *
 * the DTUS unit of force is the beter (bt), it is defined as conq blocks per tick squared
 */
public class Force {
	public static final int BETER = Acceleration.BLOCKS_PER_TICK * Mass.CONQ;
	public static final double BETER_D = Acceleration.BLOCKS_PER_TICK_D * Mass.CONQ_D;
}
