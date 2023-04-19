package day06;

public class TataTiago extends TataCarSpec {

	public static void main(String[] args) {
		
		TataTiago tiago = new TataTiago();
		tiago.displayHeight();
		tiago.displayWidth();
		tiago.displaySpeed();
		tiago.displayPrice();
		
	}

	
	@Override
	public void displayHeight()

	{
   System.out.println("Tata Tiago Height is 7.5f");
}

	@Override
	public void displayWidth()

	{
   System.out.println("Tata Tiago Width is 9f");
}


	@Override
	public void displaySpeed()

	{
   System.out.println("Tata Tiago Speed is 140KM/Hr");
}

	@Override
	public void displayPrice()

	{
   System.out.println("Tata Tiago Price is 12.5L");
}

	
	
	
	
	
}
