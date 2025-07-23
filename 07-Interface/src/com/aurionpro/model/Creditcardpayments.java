package com.aurionpro.model;

public class Creditcardpayments implements IPayments {
    
	@Override
	public void processpayment(double amount) {
		System.out.println("Credit Card Payment Amount:"+amount);
		
	}
	

}
