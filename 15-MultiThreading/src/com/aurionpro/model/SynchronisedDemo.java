package com.aurionpro.model;

public class SynchronisedDemo implements Runnable {
	
	public static int count=0;
	
	public synchronized void Countprotection() {
		
		count++;
	}
	
	public void run() {
		for(int i=1;i<1000;i++) {
			Countprotection();
		}
	}

}
