package com.OOPs.model;

public class Product {
	    private int id;
	    private String name;
	    private double price;

	  
	    public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price=price; 
	    }

	   
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	            System.out.println("Price updated to Rs " + price);
	        } else {
	            System.out.println("Invalid price! Price must be greater than 0.");
	        }
	    }
	    
	    public void displayProductDetails() {
	        System.out.println("Product ID: " + id);
	        System.out.println("Name     : " + name);
	        System.out.println("Price    : Rs" + price);
	        System.out.println("----------------------------");
	    }
	}



