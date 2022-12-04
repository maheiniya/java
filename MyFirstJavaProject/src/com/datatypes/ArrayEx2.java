package com.datatypes;

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

public class ArrayEx2 {
		
	/*	ststic int f(int a,intb){
			//logic
			if(a>b)
				return a;
			else
				return b; 
		}
	*/
		//void-its not goint to return anything, print-name of the function int array, 
		//static is make a call
	
	static void print(int b[]) {
		
		System.out.println("Elementes in the array are");
		for (int ele : b) {
			System.out.println(ele);
		}
	}
	
	
	static void setzero(int b[]) {
		
		System.out.println("Elementes in the array are");
		for (int i=0; i<b.length; i++) {
			b[i]=0;
		}
	}
	
	
	public static void main(String[] args) {
				//int arr[]= {10, 20, 30, 40};
				//	intx=f(10,20);
				//	System.out.println( x);
		
		int arr[]= {10, 20, 30 };
		print (arr);
		setzero(arr);
		System.out.println();
		print(arr);
		
	}

}
