package day06;

public class TataSafari extends TataCarSpec {

	public static void main(String[] args) {
		
		TataSafari safari = new TataSafari();
		safari.displayHeight();
		safari.displayWidth();

	}

	
	@Override
	
	 public void displayHeight()
	
	{
		System.out.println("Tata Safari Height is 10");
	}
	
	@Override
	
	public void displayWidth()
	{
		System.out.println("Tata Safari Width is 6.7");
	}
	
	
	
	
	
	
	
}
