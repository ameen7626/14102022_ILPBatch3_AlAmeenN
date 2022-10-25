package com.experion.entity;

public abstract class Account {
	private String cashDeposit;

	
	public Account(String cashDeposit) {
		super();
		this.cashDeposit = cashDeposit;
	}
	


	public String getCashDeposit() {
		return cashDeposit;
	}



	public void setCashDeposit(String cashDeposit) {
		this.cashDeposit = cashDeposit;
	}



	public abstract void checkProductValidity();
	
	
	

}
