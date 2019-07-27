package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Calculation cal=new Calculation();
		int result=cal.substract(90,15);
		assertEquals(result,75);
		
	}

}
