package com.amc.junitapplication;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FirstTestClass {
	@Disabled // we can use this over method or class
	@Test
	public void squareTest() {
		int sq = ArithmeticOperation.getSquare(-2);
		assertEquals(4, sq);
	}
	
	@Test
	public void findMaximumArrayTest() {
		int[] arr = {-12,-45,-63,-78};
		int max = ArithmeticOperation.findMax(arr);
		assertEquals(-12, max);
	}
}
