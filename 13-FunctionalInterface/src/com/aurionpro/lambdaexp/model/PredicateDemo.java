package com.aurionpro.lambdaexp.model;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

//		Predicate<Integer> iseven = num -> num % 2 == 0;
//		System.out.println(iseven.test(11));
//
//		Predicate<String> string = s -> s.isEmpty();
//		System.out.println(string.test(""));
		
		Predicate<Integer> isodd= num->num%2!=0;
		System.out.println(isodd.test(13));
		
		

	}

}
