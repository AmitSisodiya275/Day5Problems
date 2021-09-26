package com.bridgelab.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtility {

	Scanner scanner;

	public FunctionalUtility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}

	public double getDoubleValue() {
		return scanner.nextDouble();
	}
	
	public boolean getBooleanValue() {
		return scanner.nextBoolean();
	}

	public Integer[][] getIntTwoDArray(int m, int n) {
		Integer[][] array = new Integer[m][n];
		System.out.println("Enter " + (m * n) + "Integer value in Integer Array");
		for (int i = 0; i < m; i++) { // 1 2 3
			for (int j = 0; j < n; j++) { // 4 5 6
				array[i][j] = getIntValue();
			}
		}
		return array;
	}

	public Double[][] getDoubleTwoDArray(int m, int n) {
		Double[][] array1 = new Double[m][n];
		System.out.println("Enter " + (m * n) + "double value in Double Array ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array1[i][j] = getDoubleValue();
			}
		}
		return array1;
	}
	
	public Boolean[][] getBoolenTwoDArray(int m, int n) {
		Boolean [][] array2 = new Boolean [m][n];
		System.out.println("Enter "+(m*n)+" Boolean value in Boolean Array.");
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				array2[i][j] = getBooleanValue();
			}
		}
		return array2;
	}


	public <t> void printArray(t[][] array, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = " + array[i][j]);
				writer.flush();
			}
			System.out.println();
		}

	}

	// Logic of Distance.java program
	public int getEuclideanDistance(int x, int y) {
		int length = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return length;
	}

	// Logic of Quadratic.java program
	public void getRoot(int a, int b, int c) {
		int delta = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("First root of the above equation is : " + root1);
		System.out.println("Second root of the above equation is : " + root2);
	}

	// Logic of Sum of three Integer adds to Zero
	public int[] getArray(int capacity) {
		int[] array = new int[capacity];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public void printArray(int[] array) {
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println();
	}

	public void findTriplets(int[] array) {
		boolean found = false;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("(" + array[i] + "," + array[j] + "," + array[k] + ")");
						found = true;
					}
				}
			}
		}
		if (found == false) {
			System.out.println("Triplets doesn't exist.");
		}
	}
}
