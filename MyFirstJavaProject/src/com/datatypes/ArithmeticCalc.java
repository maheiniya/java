package com.datatypes;

import java.util.Scanner;

public class ArithmeticCalc {

	public static void main(String[] args) {
		 //  SI=P*T*R/100
		double si,p,t,r;
		
		Scanner scan = new Scanner(System.in);		
		   System.out.println("Enter the principle amount");
		   p=scan.nextDouble();
		   System.out.println("Enter the tenureamount");
		   t=scan.nextDouble();
	   	   System.out.println("Enter the rate amount");
		   r=scan.nextDouble();
	   si=(p*t*r)/100;
		   System.out.println("Simple interest-"+si);
		 
		 
		 	  
	} 

}
