package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Quotient and Remainder finder program.");
		System.out.println("Enter any number you want to divide (dividend) : ");
		int dividend = utility.getIntValue();
		System.out.println("Enter any number like divisor : ");
		int divisor = utility.getIntValue();
		utility.getQuotientAndRemainder(dividend, divisor);
	}

}
