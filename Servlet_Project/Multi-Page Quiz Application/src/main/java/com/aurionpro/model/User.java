package com.aurionpro.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
