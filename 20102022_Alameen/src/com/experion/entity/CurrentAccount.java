package com.experion.entity;

import com.experion.service.SaCaService;

public class CurrentAccount extends Account implements SaCaService {

	public CurrentAccount(String customerId, String customerName) {
		super(customerId, customerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cashDeposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atmwithdrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onlinebanking() {
		// TODO Auto-generated method stub
		
	}
	public void mobilebanking() {
		
	}
	

}
