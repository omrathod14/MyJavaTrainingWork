package com.aurionpro.Enum.Test;

public class PaymentStatusHandling {
	public void main(PaymentStatus status) {
		switch(status) {
		case SUCCESS:
			System.out.println("Payment Received");
			break;
		case PENDING:
			System.out.println("Payment is Pending");
			break;
		case FAILED:
			System.out.println("Payment is Failed");
			break;
		case CANCELLED:
			System.out.println("Payment is Cancelled");
			break;
		default :
			System.out.println("Unknown Status!!");
		}
	}

}
