package com.aurionpro.test;

public class PrimeNum {
	public static void main(String arg[]) {
		int n=7;
		int count=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				count ++;
				
				}
		}
		if(count==2) {
				System.out.print(n+ " is a Prime Number");
			}else {
				System.out.print(n+ " not a Prime Number");
			}
	}

}
