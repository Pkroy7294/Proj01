package com.coding.challange;

  public class NonRepeatedCharacter {
	   public static char findFirstNonRepeated(String str) {
	        int[] count = new int[256]; // ASCII character set

	        // Count frequency of each character
	        for (char ch : str.toCharArray()) {
	            count[ch]++;
	        }

	        // Find first character with frequency 1
	        for (char ch : str.toCharArray()) {
	            if (count[ch] == 1) {
	                return ch;
	            }
	        }
	        return 0; // No unique character found
	    }
	public static void main(String[] args) {
        String input = "aabbcdeff";
        char result = findFirstNonRepeated(input);

        if (result != 0)
            System.out.println("First non-repeated character: " + result);
        else
            System.out.println("No unique character found.");
    }
}