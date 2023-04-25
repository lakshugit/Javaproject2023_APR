package day08;

public class program5 {

	public static void main(String[] args) {
		//&& || ! true/false
		boolean a=true;
		boolean b=false;
		boolean c=true;
		boolean d=false;
		
		
		//&& we both are true then o/p true if anyone false o/p is false
		System.out.println(a&&b);//false

		System.out.println(a&&c);//true
		System.out.println(a&&d);//true
		
		//&& we anyone are true then o/p true if both false o/p is false
				

				System.out.println(a||b);//true
				System.out.println(b||d);//true
				
				
		// ! toggle true---->false false---->true
				
				System.out.println(!a);	
				System.out.println(!b);
	}

}
