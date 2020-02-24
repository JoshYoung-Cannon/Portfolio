package com.qa.portfolio.unique_characters;

import java.util.ArrayList;
import java.util.List;

public class UniqueCharacters {
	/**
	 * Takes in a String input and returns a String of the distinct chars
	 * @param s
	 * @return
	 */
	public String findUniqueCharacters(String s){
		ArrayList<Character> uniqueChars = new ArrayList<>();
		String uniqueString = "";
		for (char i : s.toCharArray()) {
			if (!uniqueChars.contains(i)) {
				uniqueChars.add(i);
				uniqueString += i;
			}
		}
		return uniqueString;
	}
}
