package com.aurionpro.model;

public class Debitcardpayments implements IPayments {

	@Override
	public void processpayment(double amount) {
		
		System.out.println("Credit Card Payment Amount: "+amount);
	}

	
}
