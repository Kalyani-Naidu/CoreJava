package com.example.strings;

public class ReplacingWords {
	
	public void replaceWord(String input) {
		String data = "Hatred was spreading everywhere, blood was being spilled everywhere, wars were breaking out everywhere.";
		input = input.toLowerCase();
		data = data.toLowerCase();
		data = data.replace("everywhere", input);
		System.out.println("After replacing with given word: "+data);
		
	}

}
