package com.example.strings;

public class StringsExample {

	public static void main(String... args) {

		LongestCommonPrefix obj = new LongestCommonPrefix();
		String s[] = { "flower", "flow", "flight" };
		System.out.println("Longest Common Prefix: " + obj.longestCommonPrefix(s));

		String data = "Hello world, how are you?";
		ReverseOrder obj1 = new ReverseOrder();
		obj1.reverseOrderOfSentence(data);

		String word = "TEST";
		AllSubstrings as = new AllSubstrings();
		as.allSubstrings(word);

		String str1 = "sddddddddddddggjhjnnn";
		CompressedString comStr = new CompressedString();
		comStr.charCount(str1);

		String word1 = "snooze alarms";
		String word2 = " alas, no more Z's";
		Anagram anagram = new Anagram();
		anagram.isAnagram(word1, word2);

		String myStr = "Book";
		AllSubstrings myObj = new AllSubstrings();
		String arr[] = myObj.allSubstrings(myStr);
		PalindromeSubstrings palindrome = new PalindromeSubstrings();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isPal = palindrome.countPalindromeSubstrings(arr[i]);
			if (isPal == true) {
				count++;
			}
		}
		System.out.println("Given String has " + count + " palindrome substrings");

		String input = "NOWHERE";
		ReplacingWords repeatingWords = new ReplacingWords();
		repeatingWords.replaceWord(input);
	}
}
