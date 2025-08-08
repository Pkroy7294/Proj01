package com.coding.challange;

//Find the Missing Number in an Array.

public class MissingNumber {
	public static void missingNumberFind(int[] arr, int num) {
		int totalSum = num*(num+1)/2;
		int sum = 0;
		for(int n : arr) {
			sum+=n;
		}
		System.out.println("Missing num: "+ (totalSum-sum));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7};
		int num = 7;
		missingNumberFind(arr,num);
	}
}
