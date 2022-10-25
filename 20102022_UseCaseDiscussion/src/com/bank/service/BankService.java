package com.bank.service;

import java.util.ArrayList;

import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {
	public ArrayList<Service> createServices(){
		ArrayList<Service>allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("atm withdrawl"));
		allServiceList.add(new Service("cash deposit"));
		
		allServiceList.add(new Service("cheque deposit"));
		
		return allServiceList;
		
	}
	public ArrayList<Product> createProducts(ArrayList<Service>allServiceList){
		ArrayList<Product>productList = new ArrayList<Product>();
		createSavingsMaxAccount()(allServiceList);
		createCurrentAccount()(allServiceList);
		createLoanAccount()(allServiceList);
		
		return productList;
		
		
		
		

}
	private void createLoanAccount(ArrayList<Service>allServiceList) {
		ArrayList<Service>loanServiceList = new ArrayList<Service>();
		for(Service service: allServiceLIst)
			if(service.getServiceName().compareTo("CashDeposit")==0)
		
		
		
		
	}
