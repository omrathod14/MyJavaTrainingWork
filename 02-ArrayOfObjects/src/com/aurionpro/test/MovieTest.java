package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Movies to be added:");
		int no_of_movies=sc.nextInt();
		
		sc.nextLine();
		
		Movie movies[]=new Movie[no_of_movies];
		
		for(int i=0;i<no_of_movies;i++) {
			
			System.out.println("Enter the Title of movie:");
			String Title=sc.nextLine();
			
			System.out.println("Enter the Genre of movie:");
			String Genre=sc.nextLine();
			
			movies[i]=new Movie(Title,Genre);
		}
		
		for(Movie result:movies) {
			result.actionDisplay();
		}
	}

}
