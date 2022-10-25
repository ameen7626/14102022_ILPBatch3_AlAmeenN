package com.experion.assignment;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	    System.out.print("Enter three numbers.");

	    double x = scanner.nextDouble();
	    double y = scanner.nextDouble(); 
	    double z = scanner.nextDouble();

	    if (x >= y && x>=z){
	            if (y >= z) 
	                System.out.print("In order " + x + " "+ y + " " + z);
	            
	            else 
	                System.out.print("In order " + x + " "+ z + " " + y);

	            
	    }

	    else if (y >= x && y>=z)
	    {
	            if (x>= z)
	                System.out.print("In order " + y + " " + x + " "+ z);
	            else
	            System.out.print("In order " + y + " " + z + " " + x);
	        
	    }
	    else {
	    	if(y>=x)
	    		System.out.print("In order " + z + " " + y + " "+ x);
	    	else
	    		System.out.print("In order " + z + " " + x + " "+ y);
	    		
	    }


	  }
	
		
		

}


