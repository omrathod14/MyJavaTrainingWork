package com.aurionpro.model;

public class Product {
	String name;
	double price;
	
	public Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public static void display(Product[] prod) {
		for(int i=0;i<prod.length;i++) {
			if(prod[i].price<1000) {
				System.out.println(prod[i].name);
			}
			
		}
		
	}
	

}
