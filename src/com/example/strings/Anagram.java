package com.example.strings;

import java.util.Arrays;

public class Anagram {

	public void isAnagram(String word1, String word2) {

		String str1 = word1.toUpperCase();
		String str2 = word2.toUpperCase();

		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		str2 = str2.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given two strings are anagrams");
		}
		else {
			System.out.println("Given two strings are not anagrams");
		}
		
	}

}
