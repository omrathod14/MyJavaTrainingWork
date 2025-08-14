package com.aurionpro.calculator.solution.model;

public class Multiplication {
	
	public void multi(Calculator calculator) {
		int result = calculator.getNumber1() * calculator.getNumber2();
		System.out.println("Multiplication of" + calculator.getNumber1() + "and" + calculator.getNumber2() + result);
	}


}
