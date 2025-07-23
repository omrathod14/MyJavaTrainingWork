package com.aurionpro.test;

import java.util.Scanner;

public class TreasureIslandapp {
	public static void main(String[] args) {
		System.out.println("Welcome To Treasure Island");
		System.out.println("Your Mission is to find the treasure");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Left or Right?: ");
		String first=scanner.nextLine();
		
		
		if(first.equalsIgnoreCase("Left")) {
			System.out.println("Swim or Wait?:");
			String second=scanner.nextLine();
			
			if(second.equalsIgnoreCase("Wait")) {
				System.out.println("Which door? (Red/Blue/Yellow): ");
				String third=scanner.nextLine();
				
				if(third.equalsIgnoreCase("Red")) {
					System.out.println("Burned by fire.Game Over!!");
				}else if(third.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by Beats.Game Over!!");
				}else if(third.equalsIgnoreCase("Yellow")) {
					System.out.println("You Won!!");
				}else {
					System.out.println("Game Over");
				}
			}
			else {
				System.out.println("Attacked by trout.Game Over!!");
			}
		}
		else {
			System.out.println("Fall into a hole.Game Over!!");
		}
	}

}
