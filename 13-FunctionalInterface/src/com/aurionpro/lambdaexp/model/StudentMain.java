package com.aurionpro.lambdaexp.model;

import java.util.function.Predicate;

public class StudentMain {
	public static void main(String[] args) {
		StudentPredicate s1 = new StudentPredicate("Amit", 45);
		StudentPredicate s2 = new StudentPredicate("Neha", 32);

		Predicate<StudentPredicate> isPass = stu -> stu.marks >= 40;

		System.out.println(isPass.test(s1)); // true
		System.out.println(isPass.test(s2)); // false
	}
}
