package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {

		// List<Integer> list = Arrays.asList(2, 3, 77, 53, 27, 38, 50);
//		System.out.println(list);

//		 //odd even
//		List<Integer> item=list.stream().filter(i ->i%2==1).collect(Collectors.toList());
//		System.out.println(item);

		// number greater than 30
		// list.stream().filter(num -> num >
		// 30).collect(Collectors.toList()).forEach(System.out::println);

		// Even number
		// list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(i
		// -> System.out.print(i + ","));

		// Given a list of names, print only those that start with the letter 'A'.

		List<String> name = Arrays.asList("Om", "Aardhya", "Raj", "Andy");
		name.stream().filter(i -> i.charAt(0) == 'A').collect(Collectors.toList()).forEach(System.out::println);

	}

}
