package com.qa.portfolio.find;

public class Find {
	/**
	 * Returns true if a character is at specific point in a string
	 * 
	 * @param s
	 * @param i
	 * @param c
	 * @return
	 */
	public boolean find(String s, int i, char c) {
		boolean output = false;
		char[] wordLowerCase = s.toLowerCase().toCharArray();
		char[] wordUpperCase = s.toUpperCase().toCharArray();
		if (i > s.length()) {
			throw new IllegalArgumentException("Index out of range");
		}
		if ((wordLowerCase[i - 1] == c) || (wordUpperCase[i - 1] == c)) {
			output = true;
		}
		return output;
	}
}
