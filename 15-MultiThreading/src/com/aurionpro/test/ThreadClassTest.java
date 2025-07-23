package com.aurionpro.test;

import com.aurionpro.model.MyThreadUsingClass;

public class ThreadClassTest {
	public static void main(String[] args) {
		MyThreadUsingClass thread1 = new MyThreadUsingClass();
		thread1.start();

		MyThreadUsingClass thread2 = new MyThreadUsingClass();
		thread2.start();

		MyThreadUsingClass thread3 = new MyThreadUsingClass();
		thread3.start();

	}

}
