package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Welcome to the Vowel or Consonant checker.");
		System.out.println("Enter any character to check whether it is Vowel or Consonant : ");
		char c = utility.getCharValue();
		utility.checkVowelOrConsonant(c);
	}

}
