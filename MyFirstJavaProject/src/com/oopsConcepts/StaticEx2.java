package com.oopsConcepts;

//search is an array.

class arrayutils {
	public int search(int arr[],int ele) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ele){
				return i;
			}
			
		}
		return -1;
	}
}

public class StaticEx2 {

	public static void main(String[] args) {
        int a[]= {10, 20, 30, 40, 50};
        int searchele = 50;        
        arrayutils obj = new arrayutils();        
        int index = obj.search(a, searchele);
        if (index !=-1) {
        	System.out.println("Found at" + index);
        } else {
        	System.out.println("Not Found");
        }
        
        
	}

}
