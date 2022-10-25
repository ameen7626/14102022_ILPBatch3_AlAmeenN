package com.experion.utility;


import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		ArrayList<Product>productList = new ArrayList <Product>();;
		
		Scanner scanner = new Scanner(System.in);
		char mainChoice;
		do {
			
		
		System.out.println("1.Add Card Product 2.ADD Account Product 3.Buy Product");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: productList.add(Service.createProduct("Cards"));
		        break;
		case 2: productList.add(Service.createProduct("Accounts"));
		        break;
		case 3: Service.displayProductDetails(productList);
		        break;
		default: System.out.println("Invalid Choice");
		
		
		}
		System.out.println("Do you want to Continue: ");
		mainChoice = scanner.next().charAt(0);
		
		

	}
		while(mainChoice == 'y');
		

	}
}


