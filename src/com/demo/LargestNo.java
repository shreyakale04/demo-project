package com.demo;

public class LargestNo {

	public static void main(String[] args) {
		
		int[]arr = {20, 34, 56, 42, 12, 8};
		int largest = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]>largest){
				
				largest = arr[i];
				
				}
			
			
		}
		System.out.println(largest);
	}

}
