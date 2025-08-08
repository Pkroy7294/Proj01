package com.coding.challange;
import java.util.Scanner;

public class ReverseOfString {
		private String str;
	public ReverseOfString(String str) {
		this.str = str;
	}
	public void printReverse() {
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		ReverseOfString obj1 = new ReverseOfString(sc.nextLine());
		obj1.printReverse();
	}
}