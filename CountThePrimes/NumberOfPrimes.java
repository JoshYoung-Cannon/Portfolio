package com.qa.portfolio.find_primes;

public class NumberOfPrimes {
	public int primeCounter(int maxVal) {
		int primeCount = 0, factorCount;
		if (maxVal >= 2) {
			primeCount++;
			if (maxVal > 2) {
				for (int i = 3; i <= maxVal; i++) {
					factorCount = 0;
					for (int j = 1; j <= (int) Math.sqrt(i); j++) {
						if (i % j == 0) {
							factorCount++;
						}
					}
					if (factorCount == 2) {
						primeCount++;
					}
				}
			}
		}
		return primeCount;
	}
}
