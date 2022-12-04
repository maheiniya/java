/** 
 * Inheritance - 
 *  - Mechanism in which one class acquires the properties of another class inorder 
 *    to extent or modify the existing functionality.
 *   - Class being extended is called base class or parent class or super class.
 *   - Class extending the base class is called as subclass or derived class.
 *   - forms as IsA relation with the base class.
 */

package com.section4;

class BasicCalc {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
                     //IsA
class ScientificCalc extends BasicCalc {
	private static final double pi = 3.1417;
	
	public double sin(double deg) {
		double rad = deg * pi/100;
		return Math.sin(rad);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		BasicCalc bcal1 = new BasicCalc();
		System.out.println("Testing Basic Calc");
		System.out.println(bcal1.add(50, 50));
		System.out.println(bcal1.sub(50, 25));
		
		BasicCalc scal1 = new ScientificCalc();
		System.out.println("Testing Basic Calc");
		System.out.println(scal1.add(50, 50));
		System.out.println(scal1.sub(50, 25));
		//System.out.println(scal1.sin(90));
		
		BasicCalc b1 = new BasicCalc();		
		System.out.println("Testing Basic Calc");
		System.out.println(b1.add(50, 50));
		System.out.println(b1.sub(50, 25));

		BasicCalc b2 = new ScientificCalc();		
		System.out.println("Testing Basic Calc");
		System.out.println(b2.add(50, 50));
		System.out.println(b2.sub(50, 25));
	}

}
