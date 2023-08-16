package com.example.strings;

public class PalindromeSubstrings {
	
	public boolean countPalindromeSubstrings(String myString) {
		
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equalsIgnoreCase(data)){
	    	  return true;
	      } else {
	      return false;
	      }
	}

}
