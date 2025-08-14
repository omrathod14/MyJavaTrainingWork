package com.OOPs.test;

import java.util.Scanner;

import com.OOPs.model.Product;

public class ProductTest {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter Product Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Product Price: Rs");
	        double price = sc.nextDouble();

	        
	        Product product = new Product(id, name, price);

	        
	        System.out.print("Enter new price to update: Rs");
	        double newPrice = sc.nextDouble();
	        product.setPrice(newPrice);

	        product.displayProductDetails();

	       
	    }
	}


