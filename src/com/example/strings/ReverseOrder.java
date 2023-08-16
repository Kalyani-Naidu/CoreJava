package com.example.strings;

public class ReverseOrder {
	
	public void reverseOrderOfSentence(String data) {
	
	String words[] = data.split(" ");
	int len = words.length;
	String sentence = "";
	for(int i = len-1; i>=0; i--) {
		 sentence += words[i]+" ";
	}
	System.out.println(sentence);
	}

}
