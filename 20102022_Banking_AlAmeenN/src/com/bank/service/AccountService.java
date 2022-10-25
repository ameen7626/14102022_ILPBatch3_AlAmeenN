package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;


public class AccountService {
	Scanner scanner = new Scanner(System.in);
	Service bankService = new Service(null);
	ArrayList<Service> bankServicesList = new ArrayList<Service>();

	public ArrayList<Customer> createAccount(ArrayList<Customer> customers) // to create account
	{
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		String findCustomerId = checkCustomer(customerIdEnter, customers);
		if (findCustomerId == null) {
			System.out.println("Customer Id not available!! Create new Account");
			customers = createNewCustomerAccount(customers);
		} else {
			System.out.println("Customer available!! Creating Account using existing details");
			customers = createExistingCustomerAccount(findCustomerId, customers);
		}
		return customers;

	}

	private ArrayList<Customer> createExistingCustomerAccount(String findCustomerId, ArrayList<Customer> customers) {
		Account account = null;
		String customerCode = null;
		String customerName = null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				customerCode = customer.getCustomerId();
				customerName = customer.getCustomerName();
			}
		}
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountCode, accountType, bankServicesList, 0);
			System.out.println("Savings Max Account is created for " + customerName + "......Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountCode, accountType2, bankServicesList, 0);
			System.out.println("Current Account is created for " + customerName + "....Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountCode, accountType3, bankServicesList, 0);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Available Services are :");
		for (Service bankService : bankServicesList) {
			System.out.println(bankService.getServiceName());
		}
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				ArrayList<Account> accounts = customer.getAccountList();
				accounts.add(account);
			}
		}

		return customers;

	}

	private ArrayList<Customer> createNewCustomerAccount(ArrayList<Customer> customers) {
		Account account = null;

		System.out.println("These are the Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Code :");
		String customerCode = scanner.nextLine();
		System.out.println("Enter the Customer Name :");
		String customerName = scanner.nextLine();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountType, accountType, bankServicesList, accountChoice);
			System.out.println("Savings Max Account is created for " + customerName + "...Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountCode, accountType2, bankServicesList, 0);
			System.out.println("Current Account is created for " + customerName + "...Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			bankServicesList = BankService.createServices();
			account = new Account(accountCode, accountType3, bankServicesList, 0);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Available Services are :");
		for (Service bankService : bankServicesList) {
			System.out.println(bankService.getServiceName());
		}
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(account);
		Customer customer = new Customer(customerName, customerCode, accounts);
		customers.add(customer);
		return customers;
	}

	private String checkCustomer(String customerIdEnter, ArrayList<Customer> customers) {

		String findCustomerId = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
				findCustomerId = customer.getCustomerId();
			}
		}
		return findCustomerId;
	}

public static void displayProductDetails(ArrayList<Product>productList) {
		
		
		Account account = null;
		System.out.println("CustomerCode		CustomerName       AccountCode		 AccountType                Balance");
		for (Product product : productList) {
			
			 if (product instanceof Account) {
				account = (Account)product;
				System.out.println(account.getProductCode()+"		"+account.getProductName()+"		"+account.getAccountBalance()+"		");
				System.out.println("The list of services are given below");
				for(Service bankServices : product.getServiceList())
					System.out.println(bankServices.getServiceName());
				
			}
					
		
		
		
					}
				}

	
}


