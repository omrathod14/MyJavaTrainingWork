package com.aurionpro.calculator.solution.model;

public class Substraction {
	
	public void sub(Calculator calculator) {
		int result = calculator.getNumber1() - calculator.getNumber2();
		System.out.println("Substraction of" + calculator.getNumber1() + "and" + calculator.getNumber2() + result);
	}


}
