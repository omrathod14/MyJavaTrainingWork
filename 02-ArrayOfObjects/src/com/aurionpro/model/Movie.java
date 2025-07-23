package com.aurionpro.model;

public class Movie {
	String title;
	String genre;
	
	public Movie(String title,String genre){
		this.title=title;
		this.genre=genre;
		
	}
	
	public void actionDisplay() {
		if(genre.equalsIgnoreCase("action")) {
			System.out.println("Movies of Action are:"+title);
			System.out.println("----------------------------------");
		}
	}

}
