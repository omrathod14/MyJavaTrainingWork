package com.aurionpro.solution.test;

import com.aurionpro.solution.model.IWorkable;
import com.aurionpro.solution.model.IWorker;
import com.aurionpro.solution.model.Labour;
import com.aurionpro.solution.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker loader = new Labour();
		loader.start();
		loader.stop();
		loader.eat();
		loader.rest();

		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
	}
}
