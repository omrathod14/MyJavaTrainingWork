package com.staticpractice.test;

public class MathUtilMain {
	public static void main(String[] args) {
        
        int sum = MathUtil.add(10, 5);
        int diff = MathUtil.subtract(10, 5);
        int product = MathUtil.multiply(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
    }

}
