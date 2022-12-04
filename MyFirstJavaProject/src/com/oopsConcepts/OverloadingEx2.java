package com.oopsConcepts;

class SearchUtil {

	// returns the index if found otherwise -1
	public static int search(int arr[], int ele) {
		return search(arr, 0, ele);
	}

	public static int search(int arr[], int pos, int ele) {
		for (int i = pos; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}

		}
		return -1;
	}
}

public class OverloadingEx2 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 20, 50, 20 };
		int SearchEle = 20;
		
		int index =-1;
		
		do {
		    index=SearchUtil.search(arr, index +1,SearchEle);		    
	
		    if (index != -1) {
		
		    	System.out.println("found at " + index);
		    }
			
		    }while (index !=-1);
		

	}

}
