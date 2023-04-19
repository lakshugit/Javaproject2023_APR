package day06;

public class program2 extends program1 {

	public static void main(String[] args) {
		
		program2 pro2=new program2();
		pro2.cal(10,5);
		
		program1 pro1=new program1();
		pro1.cal(10,2);
		
		
	}

	  @Override
	  public void cal(int a,int b)
	
	  {
	System.out.println("program2-Calculator");
	System.out.println((a*a)+(b*b));
	System.out.println((a*a)-(b*b));
	System.out.println((a*a)*(b*b));
	System.out.println((a*a)/(b*b));
	
	
}

}