package com.OOPs.model;

public class Book {

	    private String title;
	    private String author;
	    private boolean issued;

	  
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;

	    }

	    
	    public String getTitle() {
	        return this.title;
	    }

	    public String getAuthor() {
	        return this.author;
	    }

	    
	    public void setIssuedStatus(boolean status) {
	        this.issued = status;
	    }

	    
	    public String getStatus() {
	        if (issued) {
	            return "Issued";
	        } else {
	            return "Available";
	        }
	    }

	  
	    public void showDetails() {
	        System.out.println("Book Title : " + title);
	        System.out.println("Author     : " + author);
	        System.out.println("Status     : " + getStatus());
	        System.out.println("--------------------------------");
	    }
	}



