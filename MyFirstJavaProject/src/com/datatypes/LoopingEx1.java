package com.datatypes;

/** Looping statements - 
 *     While(condition) statements
 *     
 *     do statement while(condition);
 *     
 *     for( expr1; expr2; expr3 ) statements
 *     
 * @author mahi
 *
 */

public class LoopingEx1 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println("Hello");
		    i++;
		}
		
		int a=5;
		do {
			System.out.println("hai");
			a++;
		}while(a<3);
		
		for(int x=1;x<=5;x++) {
			System.out.println("It is for ...");
		}
		
		//break and continue...
	}
			
}
	


