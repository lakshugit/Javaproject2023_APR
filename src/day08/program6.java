package day08;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		
		
		System.out.println("Start Program...!");
		
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Enter the value of a:-");
	  int a=scanner.nextInt();
	  scanner.close();
	  
		
		// r-0 it is even:: r-1 it is odd number
        
		int b=50;
		
		if(a%2==0)
		{
			System.out.println("a is even number");
		}
		else
		{
			System.out.println("a is odd number");
		
		}
		System.out.println("End Program...!");
	}

	}

