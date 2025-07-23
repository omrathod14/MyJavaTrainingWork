package com.MethodOverloading;

public class BillGenerator {

	public void generateBill(String item, int qty, int price) {
		double total = price * qty;
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Total Bill: Rs" + total);
	}

	public void generateBill(String item, int qty, double discount, int price) {
		double total = price * qty;
		double discountAmount = total * discount / 100;
		total -= discountAmount;
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Total Bill after discount: Rs" + total);
	}

	public void generateBill(String item, int qty, double discount, double tax, int price) {
		double total = price * qty;
		double discountAmount = total * discount / 100;
		total -= discountAmount;
		double taxAmount = total * tax / 100;
		total += taxAmount;
		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Tax: " + tax + "%");
		System.out.println("Total Bill after discount and tax: Rs" + total);
	}

	public static void main(String[] args) {
		BillGenerator bg = new BillGenerator();

		bg.generateBill("Pen", 10, 15); // Only basic
		System.out.println();

		bg.generateBill("Notebook", 5, 10, 50); // With discount
		System.out.println();

		bg.generateBill("Bag", 2, 5, 18, 1000); // With discount + tax
	}
}

