package com.oopsConcepts;

/** 
 * Static members - 
 *      - Shared by all the objects of the class
 *      - No need for objects
 *      - static .... can only access .... other static members directly
 *      */
		// !) static members they belongs to class
		// class members
     

// -------- white board wants to share all the  student--------

      class Student {
	 
	  private static String board;             //!)   //(board is shared by all the obj of the class)
	  public static void writeToBoard(String s) {
		  board = s;
	  }
	  
	  // ------- each student has write and print the note-------
	 
	  private String note;	             //non static -related to objects. 
	  public void writeNote(String s) {
		  note = s;
	  }
	  public void print () {
		  System.out.println("Content on the board - " + board);
		  System.out.println("My notes - " +note);
	  }
  }

public class StaticEx1 {

	public static void main(String[] args) {
		Student.writeToBoard("written to board");   
		Student s1 , s2;
		s1 = new Student();
		s2 = new Student();
		s1.writeNote("abc");
		s1.writeToBoard("witten by s2");
		s2.writeNote("xyz");
		s1.print();
		s2.print();		
		
	}

}
