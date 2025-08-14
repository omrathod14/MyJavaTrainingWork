package com.assigmnet_day3.test;

import java.util.Scanner;

public class Sumarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the Numbers to be added");

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("Max Number in an array is:" + sum);

	}
}
