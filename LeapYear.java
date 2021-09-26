package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Leap Year program.");
		System.out.println("Enter the Year to check wether it is leap year or not : ");
		int year = utility.getIntValue();
		utility.checkLeapYear(year);
	}

}
