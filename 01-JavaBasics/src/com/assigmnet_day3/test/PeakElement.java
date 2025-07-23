package com.assigmnet_day3.test;

import java.util.Scanner;

public class PeakElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the numbers to be added:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int peakCount = 0;

		if (arr.length == 1) {
			System.out.println("Peak value is: " + arr[0]); // 1 element in an array
		} else {
			System.out.println("Peak values are:");
			for (int i = 0; i < arr.length; i++) {
				if (i == 0 && arr[i] > arr[i + 1]) {        // 0th index element in an array
					System.out.println(arr[i]);
					peakCount++;
				} else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
					System.out.println(arr[i]);            // last index element in an array
					peakCount++;
				} else if (i > 0 && i < arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
					System.out.println(arr[i]);
					peakCount++;
				}
			}

			if (peakCount == 0) {
				System.out.println("No peak elements found.");
			}
		}
	}
}
