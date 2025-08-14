package com.aurionpro.model;

public class Books {
	
	int Book_id;
	String Title;
	
	public Books(int Book_id,String Title) {
		this.Book_id=Book_id;
		this.Title=Title;
	}
	
	public void display_title() {
		System.out.println("Book Title:"+Title);
		System.out.println("______________________________________________");
	}
	
	public void display_Id() {
		System.out.println("Book Id:"+Book_id);
		System.out.println("______________________________________________");
	}
		
	}


