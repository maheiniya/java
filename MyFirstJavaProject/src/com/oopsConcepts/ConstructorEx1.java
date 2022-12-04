package com.oopsConcepts;
/**
 *  Constructor - A function like block which takes the name of the class 
 *  but with no return type.
 
 */
class Sample1 { 
	
	//no arguments constructor
		public Sample1() {
		System.out.println("no arg constructor");
	}
		public Sample1(int value) {
			System.out.println("arg constructor with value" + value);
		}
		
}

public class ConstructorEx1 {

	public static void main(String[] args) {
	Sample1 s1=new Sample1();
	Sample1 s2=new Sample1(100);
	}

}
