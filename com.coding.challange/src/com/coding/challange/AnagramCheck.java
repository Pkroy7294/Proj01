package com.coding.challange;

//8.Check if Two Strings Are Anagrams.
//Write a Java program to check whether two given strings are anagrams of each other.

import java.lang.reflect.Array;
import java.util.Arrays;
public class AnagramCheck {
	public static void check(String str1,String str2) {
		str1 = str1.trim();
		str2 = str2.trim();
		
		char[] s1 = str1.toCharArray();
		char [] s2 = str1.toCharArray();
		if(s1.length != s2.length) {
			System.out.println("No anagram");
			return;
		}
		 for (int i = 0; i < s1.length - 1; i++) {
	            for (int j = 0; j < s1.length - i - 1; j++) {
	                if (s1[j] > s1[j + 1]) {
	                    char temp = s1[j];
	                    s1[j] = s1[j + 1];
	                    s1[j + 1] = temp;
	                }
	                if (s2[j] > s2[j + 1]) {
	                    char temp = s2[j];
	                    s2[j] = s2[j + 1];
	                    s2[j + 1] = temp;
	                }
	            }
	        }
		if(Arrays.equals(s1, s2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("no anagram");
		}
	}

	public static void main(String[] args) {
		String name = "raja";
		String name1 = " jara";
		check(name,name1);
	}
}
