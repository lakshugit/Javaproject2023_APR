package day03;

public class program3 {

	public static void main(String[]args) {
		
		int x=addFunction(60,40);
		int y=subFunction(80,10);
		System.out.println(x);
		System.out.println(x*x);
		System.out.println(x*x/2);
		System.out.println(y*y/2);
	}
	public static int addFunction(int a,int b)
	{
		return a+b;
		
	}
	
	public static int subFunction(int a, int b) {
		return a-b;
		
	}
	
	
}
