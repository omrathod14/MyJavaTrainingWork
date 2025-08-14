package com.staticpractice.test;

public class ShopMain {
	public static void main(String[] args) {
		double price=1000;
		double totalprice=Shop.CalcPricewithTax(price);
		
		System.out.println("Original Price: Rs "+price);
		System.out.println("Total Price with Tax: Rs "+totalprice);
	}

}
