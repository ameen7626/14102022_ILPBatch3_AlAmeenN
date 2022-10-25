package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.SavingsAccount;
import com.experion.entity.Product;

public class Service {


	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","Cash deposit"));
		bankServices.add(new BankServices("SAC100","atm withdrawl"));
		bankServices.add(new BankServices("SFN100","online banking"));
		Product product = null;
		if(productType.compareTo("Cards")==0) {
			product = new SavingsAccount("cs001","arjun mohan","savings max account",4000);
		
		}
		
		return product;
	}
	
		
		
		
		
	

	public static void displayProductDetails(ArrayList<Product>productList) {
		
		SavingsAccount card = null;
		Account account = null;
		System.out.println("Product Code"+"		"+"product name"+"		"+"Product Type"+"		"+"Card or account");
		for (Product product : productList) {
			if(product instanceof SavingsAccount) {
				card = (SavingsAccount)product;
				System.out.println(card.getProductCode()+"		"+card.getProductType()+"		"+card.getProductName()+"		"+card.getCardType());
				}
			else if (product instanceof Account) {
				account = (Account)product;
				System.out.println(account.getProductCode()+"		"+account.getProductType()+"		"+account.getProductName()+"		"+account.getAccountType()
				+"		");
				System.out.println("The list of services are given below");
				for(BankServices bankServices : account.getBankServices())
					System.out.println(bankServices.getServiceName());
				
			}
		
	}
	}
}

	


