package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Om", "Amit", "Alok", "Raj", "Aradhya");
		// names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		names.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

		List<Integer> list = Arrays.asList(2, 56, 34, 90, 23, 14);
		list.stream().filter(i -> i % 2 == 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
