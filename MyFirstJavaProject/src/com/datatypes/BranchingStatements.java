package com.datatypes;

/**  
     Branching statements - 
       1)  if (contidion)
               statement1
            else
               ststement2
               
        2) Switch(expression) {
             case value1:statements;
                         break;
                         .....
            default:statements;
           }              
               
  @author mahi 
*/

public class BranchingStatements {

	public static void main(String[] args) {
		int a=10;int b=10;
		if(a<b) {
			System.out.println("B is greater");
		}
		else if (a>b) {
			System.out.println("A is graeter");
		}
		else {
			System.out.println("A is Equal to B");

		}
		
		
		int day =3;
		switch (day) {
		case 1:
			  System.out.println("Sunday");
			  break;
		case 2:
			  System.out.println("Monday");
			  break;
	    default:
			  System.out.println("Some other day");
		}
     }
	

}


