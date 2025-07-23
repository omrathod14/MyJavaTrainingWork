package com.OOPs.test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.OOPs.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of a circle:");
		double radius=sc.nextDouble();
		
		sc.nextLine();
		
		Circle cl=new Circle(radius);
		
		System.out.println("Area of a circle is:");
		System.out.println(cl.CalArea(radius));
		
	}

}
