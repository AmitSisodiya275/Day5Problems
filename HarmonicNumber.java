package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter the number of which you want Harmonic number : ");
		int number = utility.getIntValue();
		float harmonicNumber = utility.getHarmonicNumber(number);
		System.out.println(harmonicNumber);
	}

}
