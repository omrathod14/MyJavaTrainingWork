package com.aurionpro.Ecommerce.solution.model;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 50000);

        ProductPrinter printer = new ProductPrinter();
        printer.print(product);

        PriceCalculator calculator = new PriceCalculator();
        double finalPrice = calculator.getFinalPrice(product, 2000);
        System.out.println("Price after ₹2000 discount: ₹" + finalPrice);

        StockManager stock = new StockManager(5);
        System.out.println("In stock? " + stock.isInStock());
        stock.reduceStock();
        System.out.println("Stock reduced. In stock? " + stock.isInStock());
    }
}
