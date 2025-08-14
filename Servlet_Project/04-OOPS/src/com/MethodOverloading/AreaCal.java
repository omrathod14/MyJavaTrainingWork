package com.MethodOverloading;

public class AreaCal {
	public int Area(int side) {
		return side * side;
	}

	public int Area(int length, int breadth) {
		return length * breadth;
	}

	public double Area(double radius) {
		return 3.14 * radius * radius;

	}
	
	public static void main(String[] args) {
		
		AreaCal ac=new AreaCal();
		
		System.out.println("Area of Square:"+ac.Area(4));
		System.out.println("Area of Reactangle:"+ac.Area(3, 4));
		System.out.println("Area of Circle:"+ac.Area(5));
	}
}
