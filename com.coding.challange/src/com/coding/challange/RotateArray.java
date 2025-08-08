package com.coding.challange;
//RotateArray 
public class RotateArray {
	public static void rotateArr(int []arr, int index) {
		int arr1[] = new int[(int) arr.length];
		int count = 0;
		for(int i=index; i< arr.length; i++) {
			arr1[count++] = arr[i];
			
		}
		for(int i = 0; i<index; i++) {
			arr1[count++]=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr [] = {10,22,55,88,11,582};
		int index = 2;
		rotateArr(arr,index);
	}
}
