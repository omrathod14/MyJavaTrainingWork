package com.aurionpro.example;

public class Trycatchmultiple {
	public static void main(String[] args) {
		
		String array[]=new String[2];
		try {
			System.out.println(array[0].length());
			System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array out of bond");
		}
		catch(NullPointerException n) {
			System.out.println("Null Point Excpetion");
		}
	}

}
