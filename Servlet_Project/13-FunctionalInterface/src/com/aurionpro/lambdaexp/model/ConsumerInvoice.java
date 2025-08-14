package com.aurionpro.lambdaexp.model;

import java.util.function.Consumer;

class Invoice {
	String item;
	int qty;
	double price;

	Invoice(String item, int qty, double price) {
		this.item = item;
		this.qty = qty;
		this.price = price;
	}
}

public class ConsumerInvoice {
	public static void main(String[] args) {
		Consumer<Invoice> print = i -> System.out
				.println("Item: " + i.item + " | Quantity: " + i.qty + " | Total: Rs" + (int) (i.qty * i.price));

		print.accept(new Invoice("Pen", 2, 10));
		print.accept(new Invoice("Notebook", 1, 50));
		print.accept(new Invoice("Pencil", 5, 4));
	}
}
