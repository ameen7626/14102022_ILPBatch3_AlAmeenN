package assignment;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int number1;
		int number2;
		System.out.println("Enter your number1 - ");
		number1=scanner.nextInt();
		System.out.println("Enter your number2 - ");
		number2=scanner.nextInt();
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println(number1);
		System.out.println(number2);
		
		

	}

}
