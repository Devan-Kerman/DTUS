package net.devtech.dtus.v0.api;

/**
 * a measurement of length (eg. meter)
 *
 * The DTUS unit for displacement is the block length (B), the length of a block in minecraft.
 *
 * Standard Block Pixel Length (Bp), Chunk Length (Cb), Region Length (Rb) are analogs to kilometers or milimeters, they are defined as ratios of the base unit
 */
public class Displacement {
	public static final int BLOCK_LENGTH = 1;
	public static final double BLOCK_LENGTH_D = 1;
	public static final int CHUNK_LENGTH = BLOCK_LENGTH * 16;
	public static final double CHUNK_LENGTH_D = BLOCK_LENGTH_D * 16;
	public static final int REGION_LENGTH = 512;
	public static final double REGION_LENGTH_D = 512;

	// metric
	/**
	 * 1 m/b
	 */
	public static final double TO_METER = 1;
	public static final double FROM_METER = 1 / TO_METER;
	// customary
	public static final double TO_FEET = 3.28084d;
	public static final double FROM_FEET = 1/TO_FEET;
}
