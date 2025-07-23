package com.aurionpro.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorServiceEg {
	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();
//		ExecutorService service = Executors.newFixedThreadPool(5);

		Runnable task1 = () -> System.out.println("Task 1 by:" + Thread.currentThread().getName());
		Runnable task2 = () -> System.out.println("Task 2 by:" + Thread.currentThread().getName());
		Runnable task3 = () -> System.out.println("Task 3 by:" + Thread.currentThread().getName());
		Runnable task4 = () -> System.out.println("Task 4 by:" + Thread.currentThread().getName());

		service.submit(task1);
		service.submit(task2);
		service.submit(task3);
		service.submit(task4);

	}

}
