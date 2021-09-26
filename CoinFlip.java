package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class CoinFlip {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to Coin Flip program.");
		System.out.println("Enter how many times you want to flip the coin : ");
		int numberOfFlips = utility.getIntValue();
		utility.doFlips(numberOfFlips);
	}

}
