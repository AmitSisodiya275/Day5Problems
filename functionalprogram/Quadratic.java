package com.bridgelab.functionalprogram;

import com.bridgelab.utility.FunctionalUtility;

public class Quadratic {

	public static void main(String[] args) {
		
		FunctionalUtility functionalutility = new FunctionalUtility();
		System.out.println("Welcome to Quadratic.java program which can find the roots of the quadratic equation");
		System.out.println("Example of quadratic equation : ax^2+bx+c");
		System.out.println("Enter the value of a for your equation : ");
		int a = functionalutility.getIntValue();
		System.out.println("Enter the value of b for your equation : ");
		int b = functionalutility.getIntValue();
		System.out.println("Enter the value of c for your equation : ");
		int c = functionalutility.getIntValue();
		System.out.println("Your equation is : "+a+"x^2+"+b+"x+"+c);
		functionalutility.getRoot(a, b, c);
		
	}

}
