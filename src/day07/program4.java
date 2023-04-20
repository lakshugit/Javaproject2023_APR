package day07;

public class program4 {

	int a;
	int b;
	
	public program4(int a,int b){
		
		this.a=a;
		this.b=b;	
	}
	
	
	public static void main(String[] args) {
	    program4 pro = new program4(10,20);
		pro.add();
		pro.sub();
		pro.mul();
		pro.div();
	}

	  public void add()
	  {
		  System.out.println(a+b);
	  }
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	public void div()
	{
		System.out.println(a/b);
	}
	
	
	
}
