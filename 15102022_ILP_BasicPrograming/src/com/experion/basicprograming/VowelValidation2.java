package com.experion.basicprograming;

import java.util.Scanner;

public class VowelValidation2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		char letter;
		System.out.println("Enter a chara - ");
		letter=scanner.next().charAt(0);
		switch(letter) {
		case 'a': 
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		    
		}
		
		

	}

}
