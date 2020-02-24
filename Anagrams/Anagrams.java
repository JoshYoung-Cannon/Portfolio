package com.qa.portfolio.anagrams;

import java.util.ArrayList;

public class Anagrams {
	/**
	 * Returns true is Sting a is an anagram of String b
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean anagramCheck(String a, String b) {
		boolean output = true;
		a = a.replaceAll(" ", "");
		b = b.replaceAll(" ", "");
		if (a.length() == b.length()) {

			ArrayList<Character> A = new ArrayList<>();
			ArrayList<Character> B = new ArrayList<>();
			for (int i = 0; i < a.length(); i++) {
				A.add(a.toLowerCase().toCharArray()[i]);
				B.add(b.toLowerCase().toCharArray()[i]);
			}
			A.sort(null);
			B.sort(null);
			for (int i = 0; i < A.size(); i++) {
				if (A.get(i) != B.get(i)) {
					output = false;
				}
			}
		}
		else {
			output = false;
		}
		return output;
	}
}
