package com.aurionpro.model;

public class MainDip {
	public static void main(String[] args) {
		
		ApplicationDip app1=new ApplicationDip(new MySqlDatabase());
		app1.start();
		
		ApplicationDip app2=new ApplicationDip(new Postgre());
		app2.start();
		
		ApplicationDip app3 = new ApplicationDip(new Cloud());
		app3.start();
		
		
	}

}
