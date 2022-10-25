package com.experion.entity;

public class SavingsAccount extends Product {
	
	private double balance;

	public SavingsAccount(String customerId, String customerName, String accountType, double balance) {
		super(customerId, customerName, accountType);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	

}
