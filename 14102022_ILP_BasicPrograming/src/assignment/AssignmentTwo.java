package assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int number1;
		int number2;
		System.out.println("Enter your number1 - ");
		number1=scanner.nextInt();
		number2=number1%10;
		if (number2%2==0){
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
