package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Account;

public class Service {
	Account productList[]=new Account[3];
	//Product product = new Product();
	int i=0;
	
	public void creatAccount() {
		
		  for (int n = 0; n < productList.length; n++) {
			  productList[n] = new Account("CS001","Arjun Mohan"); 
			  }
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer id - ");
		String customerId = scanner.nextLine();
		System.out.println("Enter customer Name - ");
		String customerName = scanner.nextLine();
		
		productList[i].setCustomerId(customerId);
		productList[i].getCustomerName(customerName);
		productList[i].setProductDescription(productDescription);
		productList[i].setProductPrice(productPrice);
		productList[i].setExpiryDate(expiryDate);
		i++;

	}

	public void stockDisplay() {
		for(i=0;i<3;i++) {
			if(productList[i]!=null) {

		System.out.println("the productCode is:"+productList[i].getProductCode());
		System.out.println("the productname is:"+productList[i].getProductName());
		System.out.println("the productDescription is:"+productList[i].getProductDescription());
		System.out.println("the productPrice is:"+productList[i].getProductPrice());
		System.out.println("the productExpiryDate is:"+productList[i].getExpiryDate());
			}
	}

	}
	
	

}
