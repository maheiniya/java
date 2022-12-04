package com.section4;


class BasicCal {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
                     //IsA
class ScientificCal extends BasicCal {
	private static final double pi = 3.1417;
	
	public double sin(double deg) {
		double rad = deg * pi/100;
		return Math.sin(rad);
	}
}

public class ExTypecasting {

	public static void main(String[] args) {
//		BasicCal bcal1 = new BasicCal();
//		System.out.println("Testing Basic Calc");
//		System.out.println(bcal1.add(50, 50));
//		System.out.println(bcal1.sub(50, 25));
//		
//		BasicCal scal1 = new ScientificCal();
//		System.out.println("Testing Basic Calc");
//		System.out.println(scal1.add(50, 50));
//		System.out.println(scal1.sub(50, 25));
//		//System.out.println(scal1.sin(90));
//		
//		BasicCal b1 = new BasicCal();		
//		System.out.println("Testing Basic Calc");
//		System.out.println(b1.add(50, 50));
//		System.out.println(b1.sub(50, 25));
//
//		BasicCal b2 = new ScientificCal();		
//		System.out.println("Testing Basic Calc");
//		System.out.println(b2.add(50, 50));
//		System.out.println(b2.sub(50, 25));
		
		test(new BasicCal());
		System.out.println();
		test(new ScientificCal ());
		
	}	
		static void test(BasicCal cal)  {
		System.out.println(cal.add(20,30));
		System.out.println(cal.sub(20,30));
		if (cal instanceof ScientificCal) {
			System.out.println(((ScientificCal)cal .sin(90)));
		}
		
			
		
	}


}
