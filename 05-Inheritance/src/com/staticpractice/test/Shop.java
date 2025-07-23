package com.staticpractice.test;

public class Shop {
	static final double Tax_Rate=0.18;
	
	public static double CalcPricewithTax(double price) {
		return price+(price*Tax_Rate);
	}

}
