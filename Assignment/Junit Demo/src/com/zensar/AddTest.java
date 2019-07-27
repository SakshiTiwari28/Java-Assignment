package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Calculation cal = new Calculation();
		int result= cal.add(90, 15);
		assertEquals(result,105);
	}

}
