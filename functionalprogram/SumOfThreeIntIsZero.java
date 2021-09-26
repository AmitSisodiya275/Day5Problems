package com.bridgelab.functionalprogram;

import com.bridgelab.utility.FunctionalUtility;

public class SumOfThreeIntIsZero {

	public static void main(String[] args) {
		
		FunctionalUtility functionalutility = new FunctionalUtility();
		System.out.println("Welcome to the program of Sum of Three Integer adds to Zero.");
		System.out.println("Enter how many numbers you want to add in the array : ");
		int number = functionalutility.getIntValue();
		System.out.println("Enter "+number+ " integer values to add in the array.");
		int [] array = functionalutility.getArray(number);
		System.out.println("Following are the element of the array : ");
		functionalutility.printArray(array);
		functionalutility.findTriplets(array);
	}

}
