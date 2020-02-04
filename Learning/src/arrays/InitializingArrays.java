package arrays;

import java.util.Scanner;

public class InitializingArrays {

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		// create an array of integers
		int[]anArray = new int[10];
		
		//If this statement is missing, then the compiler prints an error like the following, and compilation fails:

		//ArrayDemo.java:4: Variable anArray may not have been initialized.
		//The next few lines assign values to each element of the array:

		anArray[0] = 100; // initialize first element
		anArray[1] = 200; // initialize second element
		anArray[2] = 300; // and so forth
		//Each array element is accessed by its numerical index:

		System.out.println("Element 1 at index 0: " + anArray[0]);
		System.out.println("Element 2 at index 1: " + anArray[1]);
		System.out.println("Element 3 at index 2: " + anArray[2]);
		
		
		//Alternatively, you can use the shortcut syntax to create and initialize an array:
		int[] anArray1 = 
		{ 
		100, 200, 300,
		400, 500, 600, 
		700, 800, 900, 1000
		};
		
	//--------------------------------------------------------------------------------------------------------------------------------
		
	
	
	
	}

}
