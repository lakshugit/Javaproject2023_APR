package day06;

public class TataPunch extends TataCarSpec{

	public static void main(String[] args) {
		
		TataPunch punch = new TataPunch();
		punch.displayHeight();
		punch.displayWidth();
		punch.displaySpeed();
		punch.displayPrice();
		
		TataCarSpec tatapunch = new TataPunch();
		tatapunch.displayHeight();
		tatapunch.displayModelNumber();
	}
	
			

	public static void displayModelNumber()

	{
   System.out.println("TataPunch DisplayModelNumber is 123456");
	
	
	}

			
			@Override
			public void displayHeight()

			{
		   System.out.println("Tata Punch Height is 4.5f");
		}

			@Override
			public void displayWidth()

			{
		   System.out.println("Tata Punch  Width is 6.5f");
		}


			@Override
			public void displaySpeed()

			{
		   System.out.println("Tata Punch  Speed is 110KM/Hr");
		}

			@Override
			public void displayPrice()

			{
		   System.out.println("Tata Punch  Price is 9.5L");
		}

			
			
			
			
			
		

	}


