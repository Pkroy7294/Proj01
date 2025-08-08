package com.coding.challange;

//write a program to find second largest element.

import java.util.Scanner;
public class SecondLargest {
	private int []arr;
	public SecondLargest(int []arr) {
		this.arr = arr;
		}
	public void largestnum() {
		System.out.println(arr.length);
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>fmax) {
				smax = fmax;
				fmax = arr[i];
			}
			else if(arr[i] > smax && arr[i] != fmax) {
				smax = arr[i];
			}
		}
		if(smax == Integer.MIN_VALUE) {
			System.out.println("not a second largest number.");
		}
		else
		System.out.println(smax+ " is a second largest element.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("enter the "+ size+ " element value: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		SecondLargest obj1 = new SecondLargest(arr);
		obj1.largestnum();	
	}
}
