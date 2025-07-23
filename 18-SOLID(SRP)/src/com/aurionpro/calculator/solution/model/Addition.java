package com.aurionpro.calculator.solution.model;

public class Addition {

	public void add(Calculator calculator) {
		int result = calculator.getNumber1() + calculator.getNumber2();
		System.out.println("Addition of " + calculator.getNumber1() + " and " + calculator.getNumber2()  +" "+ result);
	}

}
