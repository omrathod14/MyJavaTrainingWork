package com.OOPs.test;

import com.OOPs.model.Book;

public class BookTest {
	    public static void main(String[] args) {
	        
	        Book b1 = new Book("1984", "George Orwell");
	        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

	        
	        System.out.println("Before issuing:");
	        b1.showDetails();
	        b2.showDetails();

	        
	        b1.setIssuedStatus(true);
	        b2.setIssuedStatus(false);

	        System.out.println("After issuing/returning:");
	        b1.showDetails();
	        b2.showDetails();
	    }
	}



