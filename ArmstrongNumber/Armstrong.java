package com.qa.portfolio.armstrong;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {
	/**
	 * Returns a list of all Armstrong numbers between 0 and the int input numLimit
	 * @param numLimit
	 * @return
	 */
	public List<Integer> armstrongList(int numLimit) {
		List<Integer> output = new ArrayList<>();
		int currentNum, testValue;
		for (int i = 0; i <= numLimit; i++) {
			currentNum = i;
			testValue = 0;
			while (currentNum > 0) {
				testValue += Math.pow(currentNum % 10, String.valueOf(i).length());
				currentNum = currentNum / 10;
			}
			if (testValue == i) {
				output.add(i);
			}
		}
		return output;
	}
}
