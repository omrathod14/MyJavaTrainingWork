package com.OOPs.model;

public class PriceCalculator {
	private String productname;
	private double price;
	private double quantity;
	
	public PriceCalculator(String productname,double price,double quantity){
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
	}
	
	double totalprice=0;
	public double CalTotal() {
		totalprice=price*quantity;
		System.out.println("Total Price of "+productname+" "+ totalprice);
		
		return totalprice;
		
		
	}

}
