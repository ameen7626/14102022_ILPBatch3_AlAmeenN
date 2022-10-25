package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		String productCode;
		String productName;
		Scanner scanner = new Scanner(System.in);
		Ser
		Product product = new Product();
		System.out.println("Enter the product code -");
		productCode = scanner.nextLine();
		product.setProductCode(productCode);
		System.out.println("The product code is - " + product.getProductcode());
		
		Product productTwo = new Product();
		System.out.println("Enter the second product code -");
		productCode = scanner.nextLine();
		productTwo.setProductCode(productCode);
		System.out.println("The product code is - " + product.getProductcode());
		
		
		
	}

}
