package net.devtech.dtus.internal;

public class ValidateInternal {
	public static <T> T ifN(T a, T e) {
		return a == null ? e : a;
	}
}
