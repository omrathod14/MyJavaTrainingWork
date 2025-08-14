package com.assigmnet_day3.test;

import java.util.Scanner;

public class Binary1Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of binary array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter binary numbers (0 or 1):");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		int max_count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;

				if (count > max_count) {
					max_count = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println("Max Consecutive 1s: " + max_count);

	}
}
