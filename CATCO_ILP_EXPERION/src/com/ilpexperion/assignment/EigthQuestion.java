package com.ilpexperion.assignment;

import java.util.Scanner;

public class EigthQuestion {

	public static void main(String[] args) {
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the term: ");
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++) {
			int fact = 1;
			for(int j=1;j<=i;j++) {
				fact = fact*j;
			}
			sum = sum+(i/(fact+Math.pow(i, i*i)));
			
			
		}
		System.out.println("SUM IS"+"	"+ sum);
		
	
		
		 
		       
		

	}

}
