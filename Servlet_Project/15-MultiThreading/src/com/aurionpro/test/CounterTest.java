package com.aurionpro.test;

import com.aurionpro.model.SynchronisedDemo;

public class CounterTest {
	public static void main(String[] args) throws InterruptedException {

		SynchronisedDemo counter = new SynchronisedDemo();
		
		Thread t1=new Thread(new SynchronisedDemo());
		Thread t2=new Thread(new SynchronisedDemo());
		

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Final Count is:" + counter.count);
	}

}
