package com.aurionpro.model;

public class UpiPayment implements IPayments {

	@Override
	public void processpayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Upi Amount:"+amount);
	}

}
