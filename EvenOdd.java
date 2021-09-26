package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class EvenOdd {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Even Odd finder program.");
		System.out.println("Enter the number to check whether number is Even or Odd : ");
		int number = utility.getIntValue();
		utility.checkEvenOdd(number);
	}

}
