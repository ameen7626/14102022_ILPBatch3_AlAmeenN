package com.experion.entity;



public abstract class Account {

	private String customerId;
	private String customerName;
	public Account(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public abstract void cashDeposit();
	
	
	
	
	
	

	
	
}
