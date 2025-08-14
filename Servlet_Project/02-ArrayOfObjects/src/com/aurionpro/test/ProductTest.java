package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of products:");
		int size=sc.nextInt();
		
		sc.nextLine();
		
		Product prod[]=new Product[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the name of product:");
			String name=sc.nextLine();
			
			System.out.println("Enter the price of product:");
			double price=sc.nextDouble();
			
			sc.nextLine();
			
			prod[i]=new Product(name,price);
		}
		System.out.println("Products with price less than Rs1000 are:");
		Product.display(prod);
	}

}
