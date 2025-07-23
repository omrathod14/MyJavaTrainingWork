package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Books;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of books:");
		int no_of_books = sc.nextInt();

		sc.nextLine();

		Books books[] = new Books[no_of_books];

		for (int i = 0; i < no_of_books; i++) {

			System.out.println("Enter the Book Id:");
			int Book_id = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter the Book Title:");
			String Title = sc.nextLine();

			books[i] = new Books(Book_id, Title);
		}

			System.out.println("Enter your choice to print(1:Book_id and 2:Book_Title):");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				for(Books result:books) {
					
				result.display_Id();
				}
				break;

			case 2:
				for(Books result:books) {
				result.display_title();
				}
				break;

			default:
				System.out.println("Enter Valid Choice!!!");

			}
		}

	}
