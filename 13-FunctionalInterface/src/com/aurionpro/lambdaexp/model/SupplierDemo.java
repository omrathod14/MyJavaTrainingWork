package com.aurionpro.lambdaexp.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {

//		Supplier<Double> random = () -> Math.random();
//		System.out.println(random.get());
//
//		Supplier<LocalDate> currentdate = () -> LocalDate.now();
//		System.out.println(currentdate.get());
//
//		Supplier<LocalTime> currenttime = () -> LocalTime.now();
//		System.out.println(currenttime.get());

//		String userInput = ""; 
//
//        Supplier<String> defaultCity = () -> "Pune";
//
//        String city = userInput.isEmpty() ? defaultCity.get() : userInput;
//
//        System.out.println("City: " + city);

		Supplier<List<String>> productSupplier = () -> Arrays.asList("Laptop", "Phone", "Tablet", "Monitor",
				"Keyboard");
		
        List<String> products = productSupplier.get();

        for (String product : products) {
            System.out.println(product);
        }
    }


}

