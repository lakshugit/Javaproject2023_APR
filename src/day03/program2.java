package day03;


	public class program2{
		
		public static void main(String[]args) {
			
			addFunction(10,20);
			program2 x=new program2();
			x.subFunction(30,40);
			x.subFunction(50, 10);
			addFunction(20,60);
			addFunction(100,200);
		}
		public static void addFunction(int a,int b)
		{
			 System.out.println(a+b);
		}
		public static void subFunction(int a,int b)
		
		{
			 System.out.println(a-b);
		}	
	}


