package com.aurionpro.model;

public class Result {
	private int id;
	private int userId;
	private int score;

	public Result() {
	}

	public Result(int userId, int score) {
		this.userId = userId;
		this.score = score;
	}
}
