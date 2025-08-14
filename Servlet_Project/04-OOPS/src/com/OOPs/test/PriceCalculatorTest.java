package com.OOPs.test;

import java.util.Scanner;
import com.OOPs.model.PriceCalculator;

public class PriceCalculatorTest {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of products to be added:");
		int size=sc.nextInt();
		
		sc.nextLine();
		
		PriceCalculator price[]=new PriceCalculator[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter the Product Name:");
			String ProdNam=sc.nextLine();

			
			System.out.println("Enter the Product Price:");
			double ProdPrice=sc.nextDouble();
			
			sc.nextLine();
			
			System.out.println("Enter the Prodcut Quantity:");
			double ProdQuant=sc.nextDouble();
			
			sc.nextLine();
			
			 price[i]=new PriceCalculator(ProdNam,ProdPrice,ProdQuant);
	}
		for(PriceCalculator pc:price) {
			pc.CalTotal();
		}

}
}
