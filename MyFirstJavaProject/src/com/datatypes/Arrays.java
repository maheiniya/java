package com.datatypes;

import java.util.Scanner;

/*	 Arrays - An array is a collection of homogeneous elements.
 *     -index starts with 0.
 *	   -length property allows you to find the length of the array.
 * 	   -allocated using new operator.
 * 		   int arr[] = new int[5];
 * 		Initialized using two ways
 *         1) int arr[] = {10, 20, 30};
 *         2) int arr[];
 *            arr = new int[]{10, 20, 30};
 *     -Acessing arrays beyond its boundaries leads to ArrayIndexOutOfBoundsException
 */

public class Arrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		int i;
		for(i=0; i<arr.length;i++) {
			System.out.println("Enter" + i + "Element");
			arr[i] = scan.nextInt();	
		}
		
		 System.out.println("values in the array are");
		 for(i=0; i<arr. length;i++) {
			 System.out.println(arr[i]);
			 
		   
			 System.out.println("values in the array are");
			 for(int ele:arr) {
				 System.out.println(ele);
		 }

	}

}
}