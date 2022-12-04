package com.section4;

/**
 * Overriding and method Invocation -- Dynamic binding - binding/linking to the
 * corresponding method definition based an object.
 */

class Base {
	void f() {
		System.out.println("f() in Base");
	}

	void g() {
		System.out.println("g() in Base");
	}

}

class Derived extends Base {
	void f() {
		System.out.println("f() in Derived");
	}

	void h() {
		System.out.println("h()");
	}
}

public class DynamicBindingInheritance {

	public static void main(String[] args) {
//		Base b1 = new Base();
//		b1.f(); // f() base
//		b1.g(); // g() base
//
//		System.out.println();
//
//		Base b2 = new Derived();
//		b2.f(); // f() derived
//		b2.g(); // g() base
//		b2.h();        /////error
		
		test(new Derived());

	}
	static void test(Base b) {
		b.f();
		b.g();
		if(b instanceof Derived) {  //instance of run time error checking
			((Derived) b).h();     //without type cast we cannot call the method.
		}
	}

}
