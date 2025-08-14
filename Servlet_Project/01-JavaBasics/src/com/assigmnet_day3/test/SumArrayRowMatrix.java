package com.assigmnet_day3.test;

import java.util.Scanner;

public class SumArrayRowMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
			
		for (int i = 0; i < row_size; i++) {  //row addition
			int row_sum=0;
			System.out.println();
			for (int j = 0; j < column_size; j++) {
				row_sum+=matrix[i][j];
			}
		System.out.print("Sum of matrix "+ i + ":"+ row_sum);
		}
		
		System.out.println("Addition of Columns");
		for (int i = 0; i < row_size; i++) {  //column addition
			int col_sum=0;
			System.out.println();
			for (int j = 0; j < column_size; j++) {
				col_sum+=matrix[j][i];
			}
		System.out.print("Sum of matrix "+ i + ":"+ col_sum);
		}
			
		

}
}
