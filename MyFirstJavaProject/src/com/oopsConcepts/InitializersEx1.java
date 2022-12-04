package com.oopsConcepts;

 /** Initializers  --- 
  * static initializer - runs once per the class
  * non - static initializer - runs once for each object
 */

class Exa {
	static { 
		System.out.println("Static Initializer");
	}
	
	{
		System.out.println("Non-Static initializers");
	}
}

public class InitializersEx1 {

	public static void main(String[] args) {
	Exa s1,s2,s3;
		s1 = new Exa();
		s2 = new Exa();
		s3 = new 
				Exa();
		
		
	}

}
