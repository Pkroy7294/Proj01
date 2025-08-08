package com.coding.challange;
import java.util.Scanner;

public class CheckPalindrom {
	private String str;
	public CheckPalindrom(String str) {
	this.str = str;
	}
public void check() {
	String reverse = "";
	for(int i=str.length()-1; i>=0; i--) {
		reverse += str.charAt(i);
	}
	if(reverse.equals(str)){
		System.out.println(str+ " is a palindrom.");
	}
	else {
		System.out.println(str+ " is a not palindrom");
	}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string value: ");
		CheckPalindrom obj1 = new CheckPalindrom(sc.nextLine());
		obj1.check();
	}
}
