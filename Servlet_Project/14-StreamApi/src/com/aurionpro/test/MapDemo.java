package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {

		// List<String> names=Arrays.asList("Amit","Om","Raj","Shreyas","Vivek");
//		names.stream().filter(str -> str.length()>4).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

//		List<Integer> list=Arrays.asList(12,11,10,9,8);
//		List<Integer> newlist=list.stream().map(num->num*num).collect(Collectors.toList());
//		System.out.println(newlist);

		// names.stream().map(name ->("Mr/Ms
		// "+name)).collect(Collectors.toList()).forEach(System.out::println);

		// Given a list of product prices, apply 10% discount to each and collect the
		// new prices.
		List<Double> price = Arrays.asList(50.0, 45.0, 60.0, 80.0);
		List<Double> discountprice = price.stream().map(pr -> pr - (pr * 0.1)).collect(Collectors.toList());
		System.out.println(discountprice);
			

	}

}