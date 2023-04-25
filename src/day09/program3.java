package day09;

public class program3 {

	public static void main(String[] args) 
	{
		System.out.println("Start program");
		int a=100;
		int b=100;
		int c=10;

		if(a>=b && a>=c)
		{
			if(a==b && a==c)
			{
				System.out.println("a,b &c are equal");
			}
			else if(a>=b && b>c)
			{
				if(a==b)
				{
					System.out.println("a, & b are equal, greater than c");
					
				}
				else {
					System.out.println("a is greater than b, b is greater than c");
					
				}
			}
			else if(a>c && c>=b)
			{
				if(b==c)
				{
					System.out.println("a,is greater than b & c ,b greater than c");
				}
				else 
				{
					System.out.println("a is greater than c & b & a are equal");
				}
			}
				else if(b>=a && b>=c) {
					if(b>a && a>c) 
					{
					
					System.out.println("b is greater than a, a is greater than c");
				}
					
					else if(b>=c && c>a) {
						if(b==c) 
						{
						
						System.out.println("b and c are equal,  greater than a");
					}
				
						else 
							
							{
							
							System.out.println("b is greater than c, c is greater than a");
						}
					}
						else 
						{
							
								
								System.out.println("b is greater than a, a is greater than c");
							}
						}
				else
							{
							if(a>b)
							
							{
							System.out.println("c is greater than a, a is greater than b");
						}
					else if(b>a) {
									
						
						
						System.out.println("c is greater than b, b is greater than a");
					}
					else 
						{
						
						System.out.println("c is greater than a & b and a & b are equal");
					}
				
			}
			System.out.println("End program....!");
		}
	}
}
				
			
			
			
	



		
	