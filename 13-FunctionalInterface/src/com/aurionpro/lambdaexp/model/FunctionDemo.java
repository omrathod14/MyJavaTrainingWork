package com.aurionpro.lambdaexp.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {

//		Function<String, Integer> length = msg -> msg.length();
//		System.out.println(length.apply("Hello"));
//
//		Function<Integer, String> len = num -> num.toString();
//		System.out.println(len.apply(31));

//		Function<Double, Double> CToF = c -> (c * 9 / 5) + 32;
//
//		System.out.println("0°C = " + CToF.apply(0.0) + "°F");
//		System.out.println("20°C = " + CToF.apply(20.0) + "°F");
//		System.out.println("37°C = " + CToF.apply(37.0) + "°F");

		Function<Integer, String> gradeFunction = marks -> {
			if (marks >= 75)
				return "A";
			else if (marks >= 50)
				return "B";
			else
				return "Fail";
		};

		List<Integer> marksList = Arrays.asList(82, 67, 45, 90, 51);

		for (int marks : marksList) {
			System.out.println("Marks: " + marks + " → Grade: " + gradeFunction.apply(marks));
		}

	}
}
