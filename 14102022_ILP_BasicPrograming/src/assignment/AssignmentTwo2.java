package assignment;

import java.util.Scanner;

public class AssignmentTwo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int number1;
		int number2;
		int number3;
		System.out.println("Enter your number1 - ");
		number1=scanner.nextInt();
		System.out.println("Enter your number2 - ");
		number2=scanner.nextInt();
		System.out.println("Enter your number3 - ");
		number3=scanner.nextInt();
		if((number1<number2)&&(number1<number3)) {
			if(number2<number3) {
				System.out.println(number2+"is second smallest");
			}
			else {
				System.out.println(number3+"is second smallest");
			}
		}
		else if((number2<number1)&&(number2<number3)){
			if(number3<number1) {
				System.out.println(number3+"is second smallest");
			}
			else {
				System.out.println(number1+"is second smallest");
			}
			
		}
		else if((number3<number1)&&(number3<number2)) {
			if(number1<number2) {
				System.out.println(number1+"is second smallest");
			}
			else {
				System.out.println(number2+"is second smallest");
			}
			
		}
		
		
		
	}

}
