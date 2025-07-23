package com.aurinpro.model;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Cherry");
		
		System.out.println(list);
		
		list.add("Peru");
		System.out.println("New Fruit added:"+list);
		
		list.add(2,"Litchi");
		System.out.println("New Fruit added:"+list);
		
		list.size();
		System.out.println("Size of Fruits:"+list.size());
		
		System.out.println("Index of Banana is:"+list.lastIndexOf("Banana"));
		
		System.out.println("Is it Contains Cheery:"+list.contains("Cherry"));
		
		System.out.println("Removed Apple:"+list.remove("Apple"));
		
		System.out.println(list);

	}
	
}
