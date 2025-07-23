package com.OOPs.model;

public class BankAccounnt {
	private int accountnumber;
	private String holdername;
	private double balance;
	
	public BankAccounnt(int accountnumber,String holdername,double balance) {
		this.accountnumber=accountnumber;
		this.holdername=holdername;
		this.balance=balance;
	}
	
	public void checkbalance() {
		System.out.println("\n-----------------------------------");
		System.out.println("Account Holder:"+ holdername);
		System.out.println("Account Number:"+ accountnumber);
		System.out.println("Current Balance :Rs"+balance);
		System.out.println("\n-----------------------------------");
	

}
}
