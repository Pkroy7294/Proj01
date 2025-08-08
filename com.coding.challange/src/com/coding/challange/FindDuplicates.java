package com.coding.challange;

public class FindDuplicates {
public static void findDublicates(int []arr){
	for(int i=0; i<arr.length; i++) {
		if(arr[i] != -1) {
			boolean flag = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					flag = true;
				}
			}
			if(flag) {
				System.out.println(arr[i]+" is dublicate");
			}
		}
	}
}
	public static void main(String[] args) {
		int arr [] = {10,22,55,88,88,22};
		findDublicates(arr);
	}
}
