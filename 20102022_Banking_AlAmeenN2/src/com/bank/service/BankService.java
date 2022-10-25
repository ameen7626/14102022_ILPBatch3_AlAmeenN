package com.bank.service;

import java.util.ArrayList;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {

	public static ArrayList<Service> createServices(ArrayList<Service> allServiceList) {

//		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking")); 
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		allServiceList.add(new Service("online banking"));

		return allServiceList;

	}

	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList) {

		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(createSavingsMaxAccount(allServiceList));
		productList.add(createCurrentAccount(allServiceList));
		productList.add(createLoanAccount(allServiceList));
		

		return productList;

	}

	public static Account createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("Cheque Deposit") == 0)) {
				loanServiceList.add(service);
			}
		}
		Account account = new Account("LOAN100", "Loan Account", loanServiceList,0);
		System.out.println("Loan Account created");
		return account;

	}

	public static Account createCurrentAccount(ArrayList<Service> allServiceList) {
		ArrayList<Service> currentAcServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("online banking") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)
					|| (service.getServiceName().compareTo("Mobile Banking") == 0)) {
				currentAcServiceList.add(service);
			}
		}
		Account account = new Account("CA200", "current Account", currentAcServiceList, 0);
		System.out.println("Current Account created");
		return account;

	}

	public static Account createSavingsMaxAccount(ArrayList<Service> allServiceList) {
		ArrayList<Service> SavingsServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if ((service.getServiceName().compareTo("Cash Deposit") == 0)
					|| (service.getServiceName().compareTo("online banking") == 0)
					|| (service.getServiceName().compareTo("ATM Withdrawal") == 0)) {
				SavingsServiceList.add(service);
			}
		}
		Account account = new Account("SMA300", "savings Account", SavingsServiceList, 0);
		System.out.println("Savings max Account created");
		return account;
	}
	
	

		

	

}
