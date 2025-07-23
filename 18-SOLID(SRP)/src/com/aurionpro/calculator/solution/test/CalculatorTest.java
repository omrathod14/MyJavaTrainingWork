package com.aurionpro.calculator.solution.test;

import com.aurionpro.calculator.solution.model.Addition;
import com.aurionpro.calculator.solution.model.Calculator;
import com.aurionpro.calculator.solution.model.Division;
import com.aurionpro.calculator.solution.model.Multiplication;
import com.aurionpro.calculator.solution.model.Substraction;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator calculator =new Calculator(12,15);
		
		Addition addition= new Addition();
		addition.add(calculator);
		
		Substraction substraction= new Substraction();
		substraction.sub(calculator);
		
		Multiplication multiplication = new Multiplication();
		multiplication.multi(calculator);
		
		Division division = new Division();
		division.div(calculator);
		
	}

}
