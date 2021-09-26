package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Swapping of two numbers.");
		System.out.println("Enter first number : ");
		int number1 = utility.getIntValue();
		System.out.println("Enter second number : ");
		int number2 = utility.getIntValue();
		System.out.println("Befor swapping number1 = "+number1+ " and number2 = "+number2);
		utility.swapTwoNumber(number1, number2);
	}

}
