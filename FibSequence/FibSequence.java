package com.qa.portfolio.fib;

public class FibSequence {
	/**
	 * Returns the value of the fibonacci sequence at index pos (n-1 in a maths sense)
	 * @param pos
	 * @return
	 */
	public int fibValueAt(int pos) {
		int output = -1;
		if (pos <= 1) {
			if (pos == 1 || pos == 0) {
				output = pos;
			}
		}
		else {
			int minusTwo = 0, minusOne = 1;
			for (int i = 2; i <= pos; i++) {
				output = minusTwo + minusOne;
				minusTwo = minusOne;
				minusOne = output;
			}
		}
		return output;
	}
	
	/**
	 * Recursively returns the value of the fibonacci sequence at index pos (n-1 in a maths sense)
	 * @param pos
	 * @return
	 */
	public int fibRecursion(int pos) {
		if (pos == 1 || pos == 0) {
			return pos;
		}
		return fibRecursion(pos - 1) + fibRecursion(pos - 2);
	}
}
