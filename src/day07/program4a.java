package day07;

public class program4a {

	int a;
	int b;


public program4a(int a,int b) {
	
	this.a=a;
	this.b=b;
    this.Calculator();
}
	public static void main(String[] args) {
		program4a pro = new program4a(10,20);
		
		
		
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
	
	
	
	public void Calculator() {
	  this.add();
	  this.sub();
	  this.mul();
	  this.div();
	
	}
}
