package net.devtech.dtus.v0.api;

import net.devtech.dtus.v0.api.base.Amount;
import net.devtech.dtus.v0.api.base.Displacement;
import net.devtech.dtus.v0.api.base.ElectricalCurrent;
import net.devtech.dtus.v0.api.base.LuminousIntensity;
import net.devtech.dtus.v0.api.base.Mass;
import net.devtech.dtus.v0.api.base.Time;
import net.devtech.dtus.v0.api.derived.Energy;

public class Units {
	// base
	public static final int STK = Amount.STANDARD_STACK;
	public static final double STK_D = Amount.STANDARD_STACK_D;
	public static final int B = Displacement.BLOCK_LENGTH;
	public static final double B_D = Displacement.BLOCK_LENGTH_D;
	public static final int LS = ElectricalCurrent.STANDARD_LIGHTNING_STRIKE;
	public static final double LS_D = ElectricalCurrent.STANDARD_LIGHTNING_STRIKE_D;
	public static final int LL = LuminousIntensity.LIGHT_LEVEL;
	public static final double LL_D = LuminousIntensity.LIGHT_LEVEL_D;
	public static final int CQ = Mass.CONQ;
	public static final double CQ_D = Mass.CONQ_D;
	// todo temperature
	public static final int T = Time.TICK;
	public static final double T_D = Time.TICK_D;

	// derived
	public static final int BTT = Energy.BURN_TIME_TICKS;
	public static final double BTT_D = Energy.BURN_TIME_TICKS_D;
}
