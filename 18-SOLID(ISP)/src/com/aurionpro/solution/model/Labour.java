package com.aurionpro.solution.model;

public class Labour implements IWorker {
	@Override
	public void start() {
		System.out.println("Labour starting work.");
	}

	@Override
	public void stop() {
		System.out.println("Labour stopping work.");
	}

	@Override
	public void eat() {
		System.out.println("Labour eating lunch.");
	}

	@Override
	public void rest() {
		System.out.println("Labour taking a rest.");
	}
}
