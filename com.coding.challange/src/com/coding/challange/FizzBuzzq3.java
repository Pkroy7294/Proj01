package com.coding.challange;

import java.util.Scanner;

public class FizzBuzzq3 {
	private int num;
	public FizzBuzzq3(int num) {
		this.num = num;	
	}
	public void printFizzBuzz() {
		for(int i=1; i<=this.num; i++) {
			if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the value of intger: ");
		Scanner sc = new Scanner(System.in);
		FizzBuzzq3 obj1 = new FizzBuzzq3(sc.nextInt());
		obj1.printFizzBuzz();
	}

}
