package com.oopsConcepts;

/**
 * STRING --String objects are immutable -- Because they are immutable, objects
 * with same value can be shared. --Use StringBuilder -When you are constructing
 * a string content dynamically
 * 
 * --equals() --equalsIgnoreCase() --compareTo() --compareToIgnoreCase()
 */

public class StringEx1 {

	public static void main(String[] args) {
		String s = "abc";
		s = s + "xyz";
		System.out.println(s);
		String s1 = "pqr";
		String s2 = "pqr";
		String s3 = new String("pqr");

		// reference comparison means address comparison ==

		if (s1 == s3) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		StringBuilder sb = new StringBuilder("My first string.");
		sb.append("My 2nd string");
		sb.append("My 3rd string");
		String str = sb.toString();
		System.out.println(str);

		String str1 = "abc";
		String str3 = "ABC";
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		if (str1.compareTo(str3) > 0) {
			 System.out.println("str1 > str3");
		} else if (str1.compareTo(str3) < 0) {
			 System.out.println("str1 < str3");
		} else {
			System.out.println("str1 = str3");
		}

	}

}
