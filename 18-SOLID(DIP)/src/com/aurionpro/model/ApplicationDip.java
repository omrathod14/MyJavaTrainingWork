package com.aurionpro.model;

public class ApplicationDip {

	IDatabase database;

	public ApplicationDip(IDatabase data) {
		this.database = data;
	}

	public void start() {
		database.connect();
	}

}
