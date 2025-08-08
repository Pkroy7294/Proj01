package com.coding.challange;
import java.util.Scanner;
public class FrequencyCount {
	public static void frecount(int []arr) {
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			if(arr[i]!=-1) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					count++;
					arr[j] = -1;
				}
		   	}
			System.out.println(arr[i]+" is "+count+ " times.");
		}
	}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the "+size+" element value: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		frecount(arr);

	}

}
