package com.qa.portfolio.fizz_buzz;

public class FizzBuzzPopSnap {
	/**
	 * Returns a concatenated string following FizzBuzz rules, if the value does not fit the rules it is returned as a string
	 * @param x
	 * @return
	 */
	public String buildFizzBuzzPopSnap(int x) {
		String output = "";
		if ((x % 3 == 0) || (x % 5 == 0) || (x % 7 == 0) || (x % 11 == 0)) {
			if (x % 3 == 0) {
				output += "Fizz";
			}
			if (x % 5 == 0) {
				output += "Buzz";
			}
			if (x % 7 == 0) {
				output += "Pop";
			}
			if (x % 11 == 0) {
				output += "Snap";
			}
		} else {
			output = String.valueOf(x);
		}
		return output;
	}
}
