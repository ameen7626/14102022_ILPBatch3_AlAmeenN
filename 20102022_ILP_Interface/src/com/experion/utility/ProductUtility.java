package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		/*Account account = new Account("Womens Savings Account","ACC1987677",10000);
		AccountService accountService = new AccountService();
		accountService.depositCash(account,20000);
		accountService.depositCash(account, 0,"suneesh@okhdfc.com");
		accountService.depositCash(account, "CHQNO9987878", 100000);*/
		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice == 1) {
			product = new Account("Womens Savings Account","ACC1987677",10000);
			Account account = (Account)product;
			account.cashwithdraw();
			account.checkbalance();
			
		}
		else if(choice == 2 ) {
			product = new Card("Master Card","CARD3924893",100000);
			Card card = (Card)product;
			card.cashwithdraw();
			card.checkbalance();
		}
		else if (choice ==3) {
			product = new Loan("Home Loan","LOAN1987677",10000000);
			Loan loan = (Loan)product;
			loan.checkdueDate();
			loan.loanapproval();
			
		}
		product.checkProductValidity();
		
	}
}
		