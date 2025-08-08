package com.coding.challange;

import java.util.Scanner;

public class RangeofPrimeNum {
	
	public int primeNum(int num) {
		int count = 0;
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+" ");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   RangeofPrimeNum obj1 = new RangeofPrimeNum();
	   System.out.println("enter the value: ");
	   int num = sc.nextInt();
	   sc.nextLine();
	   if(num>0) {
		 int  re = obj1.primeNum(num);
		  System.out.println("\nTotal prime numbers from 1 to " + num + " are: " + re);
	   }
	   else {
		   System.out.println("please enter a positive number.");
	   }
	}
}
