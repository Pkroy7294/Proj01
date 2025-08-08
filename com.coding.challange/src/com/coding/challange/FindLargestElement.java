package com.coding.challange;

import java.util.Scanner;
public class FindLargestElement {
	private int []arr;
	public FindLargestElement(int []arr) {
		this.arr = arr;
		}
	public void largestnum() {
		int max=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max+ " is largest element.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("enter the "+ size+ "element value: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		FindLargestElement obj1 = new FindLargestElement(arr);
		obj1.largestnum();	
	}
}
