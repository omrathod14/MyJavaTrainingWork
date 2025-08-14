package com.inheritance.test;

import com.inheritance.model.Bikes;
import com.inheritance.model.Car;

public class CarBikesTest {
	public static void main(String[] args) {
		
		Car car=new Car();
		Bikes bike=new Bikes();
		
		car.start();
		car.features();
		bike.start();
		bike.features();
	}

}
