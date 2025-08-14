package com.aurionpro.calculator.solution.model;

public class Division {

	public void div(Calculator calculator) {
		int result = calculator.getNumber1() / calculator.getNumber2();
		System.out.println("Division of " + calculator.getNumber1() + " and " + calculator.getNumber2() +" " + result);
	}

}
