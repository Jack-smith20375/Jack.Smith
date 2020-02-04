package Questions;

//Write a program that prompts the user for two integers and then prompts the user to enter an option. If the choice is 1, add the two integers.  
//If it is 2 subtract the second integer from the first and if it is 3, multiply the integers. Display the results of the arithmetic.
//
//Modify the program so the user can enter 4 for divide. If the user enters 4 and the second integer is 0, 
//display an error message "Cannot divide by Zero"; otherwise divide the first number by the second and display the result.

import java.util.Scanner;

public class ifQuesionsPt2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int option;

		System.out.println("please enter your first integer");
		int int1 = key.nextInt();

		System.out.println("please enter your second integer");
		int int2 = key.nextInt();

		System.out.println(
				"please make a choice for what computation you would like to do : \nEnter 1 for addition, \n2 for subtraction, \n3 for multiplication, \n4 for division ");
		option = key.nextInt();

		if (option == 1) {
			int answer = int1 + int2;
			System.out.println("Addition selected = " + answer);
		} else if (option == 2) {
			int answer = int1 - int2;
			System.out.println("Subtraction selected = " + answer);
		} else if (option == 3) {
			int answer = int1 * int2;
			System.out.println("Multiplication selected = " + answer);
		} else if (option == 4) {
			if (int1 == 0 || int2 == 0) {
				System.out.println("cannot divide by 0!!");

			} else {
				int answer = int1 / int2;
				System.out.println("Division selected = " + answer);
			}

		}

	}
}
