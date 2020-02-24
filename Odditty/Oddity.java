package com.qa.portfolio.oddity;

import java.util.ArrayList;
import java.util.List;

public class Oddity {
	/**
	 * Takes a int array and returns a List of all the odd values
	 * @param nums
	 * @return
	 */
	public List<Integer> odditty (int[] nums){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2  != 0) {
				output.add(nums[i]);
			}
		}
		return (List<Integer>) output;
	}
}
