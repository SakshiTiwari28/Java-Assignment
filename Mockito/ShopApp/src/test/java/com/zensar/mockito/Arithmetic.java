package com.zensar.mockito;

public class Arithmetic {
	
	private Calculator calculator;
	
	public Arithmetic(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public int doAddition(int a, int b) {
		return calculator.add(5, 6);
	}

}
