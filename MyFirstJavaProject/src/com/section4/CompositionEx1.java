package com.section4;
class Basic1 {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
               // ScientificCalc has-a BasicCalc

class Scientic1 {
	private static final double pi = 3.1417;
	
	BasicCalc bcal1 = new BasicCalc();
	
	public int add(int a, int b) {
		return bcal1.add(a ,  b);
	}

	public int sub(int a, int b) {
		return bcal1.sub(a,  b);
	}
	
	public double sin(double deg) {
		double rad = deg * pi/100;
		return Math.sin(rad);
	}
}


public class CompositionEx1 {

	public static void main(String[] args) {

		Basic1 bcal1 = new Basic1();
		System.out.println("Testing Basic Calc");
		System.out.println(bcal1.add(50, 50));
		System.out.println(bcal1.sub(50, 25));
		
		Scientic1 scal1 = new Scientic1();
		System.out.println("Testing Basic Calc");
		System.out.println(scal1.add(50, 50));
		System.out.println(scal1.sub(50, 25));
		//System.out.println(scal1.sin(90));
		
		Basic1 b1 = new Basic1();		
		System.out.println("Testing Basic Calc");
		System.out.println(b1.add(50, 50));
		System.out.println(b1.sub(50, 25));

		/*BasicCalc b2 = new ScientificCalc();		
		System.out.println("Testing Basic Calc");
		System.out.println(b2.add(50, 50));
		System.out.println(b2.sub(50, 25));*/
	}

	}


