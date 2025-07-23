package com.aurionpro.test;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Row Size:");
		int row_size = sc.nextInt();

		System.out.println("Enter the Column Size:");
		int column_size = sc.nextInt();

		int[][] matrix = new int[row_size][column_size];

		System.out.println("Enter the Elements to be inserted:");

		for (int i = 0; i < row_size; i++) { // Insertion of elements
			for (int j = 0; j < column_size; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Entered elements are:");

		for (int i = 0; i < row_size; i++) { // display of elements
			System.out.println();
			for (int j = 0; j < column_size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

	}

}
