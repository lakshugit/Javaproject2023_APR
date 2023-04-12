package day04.packageB;

import day04.packageA.program1;

public class program3 extends program1{

	public static void main(String[] args) {
		addFunction_static(10,20);
		mulFunction_static(30,20);
		program3 x=new program3();
		x.addFunction(40,60);
		x.mulFunction(90,10);
		
	}

}
