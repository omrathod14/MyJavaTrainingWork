package com.aurionpro.lambdaexp.model;

public class StudentLambdaExp {
	public static void main(String[] args) {
		IStudent student = msg -> msg;
		System.out.println("Message:"+ student.greet("Hello World"));
	}

}
