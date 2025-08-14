package com.aurionpro.model;

public class MyThreadUsingClass extends Thread {

	public void run() {
		System.out.println("Thread is running:" + Thread.currentThread().getName());
	}

}
