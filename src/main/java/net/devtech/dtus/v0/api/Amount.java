package net.devtech.dtus.v0.api;

/**
 * an arbitrary count of something (eg. moles)
 *
 * The DTUS unit for amount is the standard stack (stk), the most common item max stack size in minecraft (64)
 */
public class Amount {
	public static final int STANDARD_STACK = 64;
	public static final double STANDARD_STACK_D = 64;

	// metric
	/**
	 * 1.06277E-22 stk/mol
	 */
	public static final double TO_MOLES = 64 / 6.022E23;
	public static final double FROM_MOLES = 6.022E23 / 64;
}
