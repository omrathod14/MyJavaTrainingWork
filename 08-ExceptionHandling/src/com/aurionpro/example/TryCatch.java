package com.aurionpro.example;

public class TryCatch {
	public static void main(String[] args) {
		int num=10;
		
		try {
			num=num/0;
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
