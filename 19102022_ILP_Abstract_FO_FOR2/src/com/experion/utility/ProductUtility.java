package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.SavingsMaxAccount;
import com.experion.entity.LoanAccount;
import com.experion.entity.CurrentAccount;
import com.experion.entity.Account;

public class ProductUtility {

	public static void main(String[] args) {
		/*Account account = new Account("Womens Savings Account","ACC1987677",10000);
		AccountService accountService = new AccountService();
		accountService.depositCash(account,20000);
		accountService.depositCash(account, 0,"suneesh@okhdfc.com");
		accountService.depositCash(account, "CHQNO9987878", 100000);*/
		
		Account product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice == 1) {
			product = new SavingsMaxAccount("Womens Savings Account","ACC1987677",10000);
		}
		else if(choice == 2 ) {
			product = new LoanAccount("Master Card","CARD3924893",100000);
		}
		else if (choice ==3) {
			product = new CurrentAccount("Home Loan","LOAN1987677",10000000);
			
		}
		product.checkProductValidity();
		
	}
}
		