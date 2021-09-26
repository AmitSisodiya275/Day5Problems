package com.bridgelab.functionalprogram;

import com.bridgelab.utility.FunctionalUtility;

public class Distance {

	public static void main(String[] args) {
		
		FunctionalUtility functionalutility = new FunctionalUtility();
		System.out.println("Welcome to Distance.java program");
		System.out.println("Enter the value of X-point : ");
		int x = functionalutility.getIntValue();
		System.out.println("Enter the value of Y-point : ");
		int y = functionalutility.getIntValue();
		int length = functionalutility.getEuclideanDistance(x, y);
		System.out.println("Euclidean distance from origin (0,0) to entered point ("+x+","+y+") is : "+length);
	}

}
