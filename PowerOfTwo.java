package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter the number for power of 2 : ");
		int number = utility.getIntValue();
		utility.getPowerOfTwo(number);

	}

}
