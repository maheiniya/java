package com.oopsConcepts;

/**
 * this - refers to current object. a reference variable that points to the
 * current objects on which the operation is being performed.
 * 
 * usages - 1) Resolving local and instance variable references 2) Constructor
 * invocation from another constructor of the same class 3) Referencing /
 * returning current object with in the methods.
 */


class Exam2 {
	private int x;

	public void setx(int x) {
		this.x = x;
	}

	public int getx() {
		return x;
	}

	public Exam2 getref() {
		return this;
	}

}

public class ThisEx1 {
	public static void main(String[] args) {
		Exam2 s1, s2;
		s1 = new Exam2();
		s1.setx(10);
		System.out.println(s1.getx());
		s2 = s1.getref();
		System.out.println(s2.getx());

	}

}