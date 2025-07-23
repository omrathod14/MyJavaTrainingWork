package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SkipLimit {
	
	public static void main(String[] args) {
		
//		List<Integer> list=Arrays.asList(2,2,33,5,33,70,88,89,46,22,76);
//		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//	     System.out.println("_____________________");
//		list.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		 
//		List<String> list1=Arrays.asList("om","raj","rohit","hello","mello","dello");
//		list1.stream().skip(3).forEach(System.out::println);
		
		List<Integer> sal=Arrays.asList(45000,50000,60000,75000,80000);
		
		sal.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
		
//		List<Integer> price=Arrays.asList(600,400,100,1000,650,350);
//		price.stream().filter(p-> p>500).limit(2).forEach(System.out::println);
		
	}

}
