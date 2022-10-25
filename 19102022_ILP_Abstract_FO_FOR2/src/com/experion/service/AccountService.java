package com.experion.service;

import com.experion.entity.SavingsMaxAccount;

public class AccountService {
	public void depositCash(SavingsMaxAccount account, double amount) {
		
		System.out.println("Depositing money over the counter");
		
		
	}
	public void depositCash(SavingsMaxAccount account,String chequeNumber, double amount) {
		
		System.out.println("Depositing money via cheque");
		
	}
	public void depositCash(SavingsMaxAccount account, double amount,String upiCode) {
		
		System.out.println("Depositing money via online transfer");
		
	}


	
	
	}


	


