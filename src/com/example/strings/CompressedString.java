package com.example.strings;

public class CompressedString {

	public void charCount(String str) {
		String input = str;
		char searchChar = str.charAt(0);
		String finalStr = "";
		String newStr = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == searchChar) {
				count++;

			} else {

				newStr = String.valueOf(searchChar) + String.valueOf(count);
//				System.out.println(newStr);
				finalStr += newStr;
//				System.out.println("Final Output: " + finalStr);
				searchChar = str.charAt(count);
//				System.out.println("searchChar: " + searchChar);
				str = str.substring(count);
//				System.out.println("str " + str);
				count = 1;
				i = 0;
			}
		}
		
		
	finalStr = finalStr+str.charAt(0)+str.length();
	if(finalStr.length()<input.length()) {
	System.out.println("Compressed String is: "+finalStr);
	}
	else {
	System.out.println("Compressed String is: "+input);	
	}
	}	
	
//	public void StringCompression(String str) {
//	// aabcccccaaa
//	String finalStr = "";
//	String newStr = "";
//	char searchChar = str.charAt(0);
//	for (int j = 0; j < str.length(); j++) {
//		if (str.length() != 0) {
//
//			int count = 0;
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(i) == searchChar) {
//					count++;
//				}
//			}
//			System.out.println("Character " + searchChar + " appears in the input String " + count + " times");
//			newStr = String.valueOf(searchChar) + String.valueOf(count);
//			System.out.println(newStr);
//		}
//		finalStr += newStr;
//		System.out.println("Final Output: " + finalStr);
//		String replaceChar = String.valueOf(searchChar);
//		str = str.replace(replaceChar, "");
//
//	}
//}
	
}
