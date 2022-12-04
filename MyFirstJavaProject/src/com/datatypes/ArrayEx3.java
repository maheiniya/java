package com.datatypes;
import java.util.Scanner;

public class ArrayEx3 {
	
	/**
	 *  return index if fount , otherwise -1.    (int means index)
	**/
	
	static int search(int arr[], int searchEle){   //int means index.
			
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchEle) {
				return i;
		   }
		 
	    }
		return -1;
	} 
	
	

	public static void main(String[] args) {
		
		int arr[]= {10, 20, 30, 40};
		int searchEle;
		  
		   Scanner scan=new Scanner (System.in);
		   System.out.println("Enter element to search");
	       searchEle =scan.nextInt();  //call search function up
	       
	       //lets make call down
	            
		int index = search(arr,searchEle);
		
		if (index !=-1) {
			System.out.println("Found at" + index);
		}else {
			System.out.println("Not Found");
		
		}
	}

}
