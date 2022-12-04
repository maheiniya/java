package com.oopsConcepts;

/** overloading:
 * Providing multiple definiton to the same identifier. 
  */

class exam1 {
	public void print(int a) {
		System.out.println("int  -" + a);
	}
	public void print(float a) {
		System.out.println("float -" + a);
	}
	public void print(String a) {
		System.out.println("string -" +a);
	}
}

public class Overloading {

	public static void main(String[] args) {
        exam1 obj = new exam1();
		obj.print(10);
		obj.print(5.5f);
		obj.print("hai");		

	}

}
