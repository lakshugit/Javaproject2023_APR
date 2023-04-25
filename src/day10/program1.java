package day10;
 import java.util.Scanner;
 
public class program1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Mobile Brand:-");
		String brand = scan.next();
		int price;
		String colour;
		if(brand.equals("apple"))
		{
			System.out.println("Enter Apple Mobile price  Range:- ");
			price = scan.nextInt();
			if(price>=50000 && price<=150000)
			{
				System.out.println("Enter Apple the Mobile colour");
				colour = scan.next();
				if(colour.equals("red")||colour.equals("silver")){
						
						System.out.println("Apple Mobile is available");	
					
			}
			else
			{
				System.out.println("Apple Mobile  is not available");	
				
			}
			}
			else
			{
				System.out.println("Apple Mobile  is not available");	
				
			}
		}
		else if(brand.equals("oppo"))
		{
			System.out.println("Enter Oppo Mobile price Range");
			price = scan.nextInt();
			if(price>=15000 && price<=130000)
			{
				
				System.out.println("Enter Oppo Mobile  colour");
			 colour = scan.next();
			 if(colour.equals("black")||colour.equals("blue")) {
				 System.out.println("Oppo Mobile is available");
				 
			 }
			 else
			 {
				 System.out.println("Oppo Mobile is not available");
			 }
			}
			 else
			 {
				 System.out.println("Oppo Mobile is not available");
			 }
			}
		else if(brand.equals("oneplus"))
		{
		System.out.println("Enter Oneplus price Range");
		price = scan.nextInt();
		if(price>=25000 && price<=100000)
		{
			
			 System.out.println("Enter Oneplus colour");
			 colour = scan.next();
			 if(colour.equals("grey")||colour.equals("green")) {
				 
				 System.out.println("Oneplus Mobile is available");
			 }
			 else 
			 {
				 
				 System.out.println("Oneplus Mobile is  not available");
			 }
		}
			 else 
			 {
				 
				 System.out.println("Oneplus Mobile is  not available");
			 }
		}
		
		}
		
	}


