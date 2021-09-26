package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Prime Factorization program.");
		System.out.println("Enter any number to get Prime Factors : ");
		int number = utility.getIntValue();
		utility.getPrimeFactors(number);
	}

}
