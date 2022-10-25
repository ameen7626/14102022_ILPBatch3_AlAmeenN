package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList= new ArrayList <Product>();// arraylist is created to clear off the index
		do {
			
		
		
		System.out.println("1.Create Product 2. Display Product");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: productList.add(Service.createProduct());//adding created pbject to productList
		        break;
		case 2: Service.displayProductDetails(productList);
		
		}
		System.out.println("Do you want to continue(Y/n): ");
		mainChoice = scanner.next().charAt(0);
		

	}
		while(mainChoice == 'y');
     
}
	
}
