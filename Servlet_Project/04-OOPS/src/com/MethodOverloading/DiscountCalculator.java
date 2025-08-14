package com.MethodOverloading;

public class DiscountCalculator {

	    
	    public void calculateDiscount(double price) {
	        double discount = price * 0.05;
	        double finalPrice = price - discount;
	        System.out.println("Final Price after 5% discount: Rs " + finalPrice);
	    }

	  
	    public void calculateDiscount(double price, String coupon) {
	        double discount = 0.05;

	        if (coupon.equals("SAVE10")) {
	            discount = 0.10;
	        }

	        double finalPrice = price - (price * discount);
	        System.out.println("Final Price after coupon discount: Rs " + finalPrice);
	    }

	    public void calculateDiscount(double price, String coupon, boolean isMember) {
	        double discount = 0.05;

	        if (coupon.equals("SAVE10")) {
	            discount = 0.10;
	        }

	        if (isMember) {
	            discount += 0.05; 
	        }

	        double finalPrice = price - (price * discount);
	        System.out.println("Final Price with coupon and membership: Rs " + finalPrice);
	    }

	    
	    public static void main(String[] args) {
	        DiscountCalculator dc = new DiscountCalculator();

	        dc.calculateDiscount(1000);  // ₹950


	        dc.calculateDiscount(1000, "SAVE10");  // ₹900

	      
	        dc.calculateDiscount(1000, "SAVE10", true);  // ₹850
	    }
	}


