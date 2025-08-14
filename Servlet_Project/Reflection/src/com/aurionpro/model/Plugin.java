package com.aurionpro.model;

public class Plugin {
	
	private double version;
	
	private Plugin() {} 
	
	public void execute() {
		System.out.println("Plugin Executed");
	}
}