package com.Movie.model;

public class Movie {
	String title;
	int year;

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public String toString() {
		return "Title: " + title + ", Year: " + year;
	}
}
