package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {


	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","Online Banking"));
		bankServices.add(new BankServices("SAC100","Mobile Banking"));
		bankServices.add(new BankServices("SFN100","Cash Banking"));
		Product product = null;
		if(productType.compareTo("Cards")==0) {
			product = new Card("PRDMC100","Master Card","Cards","Master");
		} else if (productType.compareTo("Accounts")==0) {
			product = new Account("PRDWSA100", "Womens Savings Account","Accounts","aASDS",bankServices);
		}
		return product;
	}
		
		
		
		
	

	public static void displayProductDetails(ArrayList<Product>productList) {
		
		Card card = null;
		Account account = null;
		System.out.println("Product Code"+"		"+"product name"+"		"+"Product Type"+"		"+"Card or account");
		for (Product product : productList) {
			if(product instanceof Card) {
				card = (Card)product;
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

	


