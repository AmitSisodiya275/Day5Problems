package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to the program of Largest of Three Numbers.");
		System.out.println("Enter first number : ");
		int num1 = utility.getIntValue();
		System.out.println("Enter second number : ");
		int num2 = utility.getIntValue();
		System.out.println("Enter third number : ");
		int num3 = utility.getIntValue();
		utility.getLargest(num1, num2, num3);
		
	}

}
