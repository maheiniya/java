package com.oopsConcepts;

/**
 * Other constructor invocation using this. note : this (..) call should be the
 * first statement in the constructor.
 */
class Demo {

	Demo() {
		this(100);
		System.out.println("Rest of the code");
	}

	Demo(int a) {
		System.out.println("some complecated init ... " + a);

	}
}

public class ConstructorEx4 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println();
		Demo d2 = new Demo(300);
		

	}

}
