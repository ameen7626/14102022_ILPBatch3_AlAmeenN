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

	public  ArrayList<Customer> createAccount(ArrayList<Customer> customers, ArrayList<Service> allServiceList) // to
																												// create
																												// account
	{
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		Customer findCustomerId = checkCustomer(customerIdEnter, customers);
		if (findCustomerId == null) {
			System.out.println("Customer Id not available!! Create new Account");
			customers = createNewCustomerAccount(customers, allServiceList);
		} else {
			System.out.println("Customer available!! Creating Account using existing details");
			customers = createExistingCustomerAccount(findCustomerId, customers, allServiceList);
		}
		return customers;
	}

	private ArrayList<Customer> createNewCustomerAccount(ArrayList<Customer> customers,
			ArrayList<Service> allServiceList) {
		System.out.println(
				"****Accounts Available***********\n 1.Savings Account \n 2.Current Account \n 3. Loan Account ");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the customer code");
		String customerId = scanner.nextLine();
		System.out.println("Enter the customer name");
		String customerName = scanner.nextLine();

		switch (choice) {
		case 1:
			ArrayList<Account> accountlist = new ArrayList<Account>();
			accountlist.add(BankService.createSavingsMaxAccount(allServiceList));
			Customer customer = new Customer(customerName, customerId, accountlist);
			customers.add(customer);
			break;
		case 2:
			ArrayList<Account> accountlist2 = new ArrayList<Account>();
			accountlist2.add(BankService.createCurrentAccount(allServiceList));
			Customer customer2 = new Customer(customerName, customerId, accountlist2);
			customers.add(customer2);
			break;
		case 3:
			ArrayList<Account> accountlist3 = new ArrayList<Account>();
			accountlist3.add(BankService.createLoanAccount(allServiceList));
			Customer customer3 = new Customer(customerName, customerId, accountlist3);
			customers.add(customer3);
			break;
		default:
			System.out.println("Inavalid Choice");

		}
		return customers;
	}

	// this fuction takes the user given customerid and the arraylist of customer objects and tries to find if the
	// customer object exists with the given customerid. If it exists returns the customer object, if it does not exist
	// return null.
	private Customer checkCustomer(String customerIdEnter, ArrayList<Customer> customers) {
		Customer findCustomerId = null;
		for (Customer customer : customers) {
			if (customerIdEnter.compareTo(customer.getCustomerId()) == 0) {
				findCustomerId = customer;
				break;
			}
		}
		return findCustomerId;
	}

	//this function takes a customer object and arraylist of customer and allservice list. Then it takes the user input
	//for which accnt to create. then it checks the customer accnt list whethers the accnt of the user given type exist
	// or not.if it exists prints a msg. if it does not exist create the accnt and add it to the customer obj accnt arraylist
	//and return the customer obj arraylist
	
	private ArrayList<Customer> createExistingCustomerAccount(Customer findCustomerId, ArrayList<Customer> customers, ArrayList<Service> allServiceList) {
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		ArrayList<Account> accountList = findCustomerId.getAccountList();

		switch (accountChoice) {
		case 1:
			Boolean savingsMaxAccExists = checkAccount("SMA300", accountList);
			if (savingsMaxAccExists) {
				System.out.println("Savings max account already exists for customer!");
			}
			else {
				accountList.add(BankService.createSavingsMaxAccount(allServiceList));
			}
			break;
		case 2:
			Boolean currentAccExists = checkAccount("CA200", accountList);
			if (currentAccExists) {
				System.out.println("Current account already exists for customer!");
			}
			else {
				accountList.add(BankService.createCurrentAccount(allServiceList));
			}
			break;
		case 3:
			Boolean loanAccExists = checkAccount("LOAN100", accountList);
			if (loanAccExists) {
				System.out.println("Loan account already exists for customer!");
			}
			else {
				accountList.add(BankService.createLoanAccount(allServiceList));
			}
			break;
		default: System.out.println("Invalid choice");
		}
		return customers;
	}
//this func is used to chech whether accnt is in the accnt list(customer object) or not. this func takes the accntlist
// and the user given accnt choice. and returns true or false.
	private Boolean checkAccount(String accountChoice, ArrayList<Account> accountList) {
		Boolean findAccount = false;
		for (Account account : accountList) {
			if (accountChoice.compareTo(account.getProductCode()) == 0) {
				findAccount = true;
				break;
			}
		}
		return findAccount;
	}
//
//
//}
//
}
