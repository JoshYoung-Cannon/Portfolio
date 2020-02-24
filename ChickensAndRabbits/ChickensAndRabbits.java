package com.qa.portfolio.chickens_and_rabbits;

public class ChickensAndRabbits {
	/**
	 * Takes in a whole number for heads and legs and outputs the number of Chickens and Rabbits that fit
	 * Following the rules: a Rabbit has 1 head and 4 legs, a Chicken has 1 head and 2 legs
	 * @param heads
	 * @param legs
	 */
	public void calculateChickensAndRabbits(int heads, int legs) {
		int rabbits = (legs / 2) - heads;
		int chickens = heads - rabbits;
		if ((rabbits * 4) + (chickens * 2) != legs) {
			System.out.println("Not possible with heads = " + heads + " and legs = " + legs);
		} else {
			System.out.println("Rabbits: " + rabbits + "\nChickens: " + chickens);
		}
	}
}
