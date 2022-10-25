package com.experion.basicprograming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int letter;
		System.out.println("Enter a number - ");
		letter=scanner.nextInt();
		switch(letter) {
		case 1: 
			System.out.println(letter+"Monday");
			break;
		case 2:
			System.out.println(letter+"Tuesday");
			break;
		case 3:
			System.out.println(letter+"wednesday");
			break;
		case 4:
			System.out.println(letter+"Thursday");
			break;
		case 5:
			System.out.println(letter+"Friday");
			break;
		case 6:
			System.out.println(letter+"Saturday");
			break;
		case 7:
			System.out.println(letter+"Sunday");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		    
		}
		
		

	}

}
