package com.oopsConcepts;


 // classes  - 
 // class { data + opearations } + data hiding +encapsulation 
 //     encap  -(nothing but combining data and operations as a single unit.
 
 

class PositiveInteger {
		//data /state
	private int x;
	    //operations / behaviour 
	
	public void set(int value){
	   if(value >= 0)
		  x = value;
	 }
	public int get() {
	 return x;
	 }
}



public class ClassesEx2 {

	public static void main(String[] args) {
			//reference  variable
	   PositiveInteger n1;
	     	// RHS : creating object and assigned its reference to n1.	
	   n1=new PositiveInteger();
	 
	   PositiveInteger n2;	   
	   n2=new PositiveInteger();
	  
	   n1.set(10);
	   System.out.println(n1.get());
	   n1.set(-10);
	  // n1.x = -10;   
	   //error.     we cannot access code .  bz of private (restricted)
	   System.out.println(n1.get());

	}

}
