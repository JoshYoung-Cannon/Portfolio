package com.qa.portfolio.factorial;

public class Factorial {
	/**
	 * Takes an int input and returns the factorial value
	 * @param i
	 * @return
	 */
	public int factorial(int i) {
		int output = 1;
		if (i == 0) {
			output = 0;
		} else {
			for (int x = 2; x <= Math.abs(i); x++) {
				output = output * x;
			}
			if ((i < 0) && (i%2 != 0)) {
				output = 0 - output;
			}
		}
		return output;
	}
}
