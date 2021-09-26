package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}

	public char getCharValue() {
		return scanner.next().charAt(0);
	}

	// Logic of the Coin Flip program
	public void doFlips(int number) {
		float percentTail = 0, percentHead = 0;
		for (int i = 0; i < number; i++) {
			float random = (float) Math.random();
			if (random < 0.5) {
				System.out.println("Result of coin flip is tail.");
				percentTail = random * 100 / number;
				System.out.println("Percentage of tail is : " + percentTail);
			} else {
				System.out.println("Result of coin flip is head.");
				percentHead = 100 - percentTail;
				System.out.println("Percentage of the head is : " + percentHead);
			}

		}
	}

	// Logic of leap year
	public void checkLeapYear(int year) {
		if (year > 999 && year < 10000) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("Entered year " + year + " is Leap Year.");
			} else
				System.out.println("Entered year " + year + " is not a Leap year");
		} else
			System.out.println("Enter valid year.");
		checkLeapYear(getIntValue());
	}

	// Logic of Power of 2 program
	public void getPowerOfTwo(int number) {
		if (number > 0 && number < 31) {
			for (int i = 1; i <= number; i++) {
				System.out.println("Value of 2^" + i + " is " + (int) Math.pow(2, i));
			}
		} else
			System.out.println("Enter valid number for power of 2 in the range of 1 to 30.");
		getPowerOfTwo(getIntValue());
	}

	// Logic of Harmonic number program
	public float getHarmonicNumber(int number) {
		float sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += (float) 1 / i;
		}
		return sum;
	}

	// Logic of Prime Factors Program
	public void getPrimeFactors(int number) {
		while (number % 2 == 0) {
			System.out.print(2 + " ");
			number /= 2;
		}
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}
		if (number > 2) {
			System.out.print(number + " ");
		}
	}

	// Logic of Quotient and Remainder program
	public void getQuotientAndRemainder(int dividend, int divisor) {
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("If number " + dividend + " is divided by " + divisor + " then Quotient is " + quotient
				+ " and remainder is " + remainder);
	}

	// Logic of Swapping of two number
	public void swapTwoNumber(int number1, int number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After swapping number1 = " + number1 + " and number2 = " + number2);
	}

	// Logic of Even Odd program
	public void checkEvenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Entered number is even number.");
		} else
			System.out.println("Entered number is odd number.");

	}

	// Logic of Vowel and Consonant
	public void checkVowelOrConsonant(char c) {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Entered char " + c + " is Vowel.");
		} else
			System.out.println("Entered char " + c + " is Consonant.");
	}

	// Logic of Largest of three number
	public void getLargest(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println("First number "+ num1+ " is Largest");
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("Second number "+num2+ " is Largest");
		}
		else if (num1==num2 && num1==num3) {
			System.out.println("All the three numbers are Equal.");
		}
		else if (num3>num1 && num3>num2) {
			System.out.println("Third number " + num3+ " is Largest.");
		}
		else 
			System.out.println("Can't decide, Two numbers are same.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
