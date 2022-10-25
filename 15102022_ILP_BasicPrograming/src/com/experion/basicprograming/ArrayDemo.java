package com.experion.basicprograming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String productNames[]= new String[5];
		System.out.println("Enter the product name:");
		productNames[0]= scanner.nextLine();
		System.out.println("Enter the product name:");
		productNames[1]= scanner.nextLine();
		System.out.println("Enter the product name:");
		productNames[2]= scanner.nextLine();
		System.out.println("Enter the product name:");
		productNames[3]= scanner.nextLine();
		System.out.println("Enter the product name:");
		productNames[4]= scanner.nextLine();
		System.out.println(productNames[0]);
		System.out.println(productNames[1]);
		System.out.println(productNames[2]);
		System.out.println(productNames[3]);
		System.out.println(productNames[4]);
		
		
		
	}

}
