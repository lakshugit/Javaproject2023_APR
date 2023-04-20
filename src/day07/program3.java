package day07;

public class program3 {

	
	public program3()
	
	{
	  System.out.println("Testing....");
	}
	
public program3(String message)
	
	{
	  System.out.println(message);
	}
	
public program3(int m1,int m2)
	
	{
	  System.out.println(m1);
	}	
	public static void main(String[] args) {
		
		program3 pro = new program3("Good Evening..!");
		pro.display();
	}

	
	public void display()
	

	{
	  System.out.println("Good Day..!");
	}
	
}
