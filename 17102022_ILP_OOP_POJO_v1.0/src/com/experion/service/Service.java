package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	Product product = new 
	public void inputProductDetails() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Validity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setActive(active);
		product.setExpiryDate(expiryDate);
		product.setOpenDate(openDate);
		product.set	

	}

	public void displayProductDetails() {
		System.out.println("Product Name" + " " + "Product Description" + " " + "Product Price" + "	" + "Open Date"
				+ "	" + "Expiry Date");
		System.out.println(
				productName + "      " + productDescription + " " + productPrice + " " + openDate + " " + expiryDate);

	}


}
