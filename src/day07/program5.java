package day07;

public class program5 extends program4a {

	 public program5(int a,int b) {
		 
		 super(a,b);
		 
	 }
	
	
	
	public static void main(String[] args) {
		program5 pro5 = new program5(10,20);
		pro5.sub();//-10
		pro5.div();
		pro5.mul();
		pro5.a=50;
		pro5.b=30;
		pro5.loadvalue();
		pro5.sub();//20
		
	}

	public void loadvalue() {
		
		super.a=50;
		super.b=30;
		
	}
	
	
	
}
