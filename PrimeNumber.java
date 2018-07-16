package com.simple.problem;

public class PrimeNumber {
	
	public boolean isPrime(int number) {
		if(((number + 1) % 6 == 0 ) || ((number - 1) % 6 == 0 ))
			return true;
		return false;
	}

}
