package day06;

public class TataNexon extends TataCarSpec {

	public static void main(String[] args)
	{
		
          TataNexon nexon = new TataNexon();  
		  nexon.displayHeight();
		  nexon.displayWidth();
		  nexon.displaySpeed();
		  nexon.displayPrice();
		
	}
		
		@Override
		public void displayHeight()

		{
	   System.out.println("Tata Nexon Height is 5.5f");
	}

		@Override
		public void displayWidth()

		{
	   System.out.println("Tata Nexon Width is 7f");
	}


		@Override
		public void displaySpeed()

		{
	   System.out.println("Tata Nexon Speed is 120KM/Hr");
	}

		@Override
		public void displayPrice()

		{
	   System.out.println("Tata Nexon Price is 10.5L");
	}

		
		
		
		
		
	}


