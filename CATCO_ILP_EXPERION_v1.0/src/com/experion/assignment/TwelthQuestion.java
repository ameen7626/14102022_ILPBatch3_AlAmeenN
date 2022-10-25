package com.experion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TwelthQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int numbers[]= new int[4];
		System.out.print("Enter four numbers.");

	     numbers[0] = scanner.nextInt();
	     numbers[1] = scanner.nextInt(); 
	     numbers[2] = scanner.nextInt();
	     numbers[3] = scanner.nextInt();
	     Arrays.sort(numbers);
	     System.out.print("Numbers in Ascending Order: " );
	     
	     for (int values : numbers) 
	    	 System.out.print(values + " ,");
	     System.out.print("Numbers in Descending Order: " ); 
	     for(int i = 3; i >= 0; i--){ 
	       System.out.print( ", " + numbers[i]);
	     }
	    	 
	    
	     }
		
		
	}
		
		
		




