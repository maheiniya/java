package com.oopsConcepts;

//once u initiliaze the objects how u r initilize is called constructor

class PositiveInteger1 {
	private int x;                   // data /state

	public PositiveInteger1() {         // operations / behaviour
			x=0;
	}
	public PositiveInteger1(int value) {
            x=value; 
	}
            
	public void set (int value) {
		if (value>=0)
			x=value;
	}
	public int get() {
		return x;
	}
	}
	


public class ConstructorEx2 {

	public static void main(String[] args) {
		PositiveInteger1 n1= new PositiveInteger1();
		System.out.println(n1.get());
		PositiveInteger1 n2= new PositiveInteger1(900);
		System.out.println(n2.get());
		
		
	}

}
