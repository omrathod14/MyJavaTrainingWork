package com.aurionpro.model;

public class Calculator {

	public int Add(int num1, int num2) {
		return num1 + num2;

	}

	public double Sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public double Div(double num1,double num2) {
		
		if(num2==0) throw new ArithmeticException("Cannot Divide by Zero");
		return num1/num2; 
		
	}

}
