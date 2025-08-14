package com.aurionpro.test;

public class Perfectnum {
	public static void main(String arg[]) {
		int n=28,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.print(n + " is a perfect number");
		}else {
			System.out.print(n + " is not a perfect number");
		}
		
	}

}
