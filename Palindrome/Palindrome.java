package com.qa.portfolio.palindrome;

public class Palindrome {
	/**
	 * Takes in a String input and returns true if it is a palindrome
	 * @param s
	 * @return
	 */
	public boolean checkWord(String s) {
		String noSpace = s.toLowerCase().replaceAll(" ", "");
		return new StringBuilder(noSpace).reverse().toString().equals(noSpace);
	}
}
