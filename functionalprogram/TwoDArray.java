package com.bridgelab.functionalprogram;

import com.bridgelab.utility.FunctionalUtility;

public class TwoDArray {

	public static void main(String[] args) {
	
		FunctionalUtility functionalutility = new FunctionalUtility();

		int m = 0, n = 0,select;
		System.out.println("1.int 2-D array: ");
		System.out.println("2. double 2-D array : ");
		System.out.println("3. boolean 2-D array : ");
		System.out.println("Select the type of array from above ");
	    select= functionalutility.getIntValue();
	    
	    if (select>0 && select <=3) {
	    	System.out.println("Enter no of columns");
	    	m=functionalutility.getIntValue();
	    	System.out.println("Enter no of rows ");
	    	n= functionalutility.getIntValue();
	    	
	    	switch (select)
	    	{
	    	case 1:
	    		Integer [][] array = functionalutility.getIntTwoDArray(m, n);
	    		functionalutility.printArray(array, m, n);
	    		break;
	    	case 2: 
	    		Double [][] array1 = functionalutility.getDoubleTwoDArray(m,n);
	    		functionalutility.printArray(array1, m, n);
	    	}
	    }
	}

}
