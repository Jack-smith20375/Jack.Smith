package Questions;

//3.	A lawn-mowing service needs a program to work out their pricing strategy. 
//The lawn-mowing season lasts 20 weeks. The weekly fee mowing a lot under 400 m2 is £25. 
//The fee for a lot that is 400 m2 or more but under 600 m2 is £35 per week. The fee for a lot that is over 600 m2 is £50 per week. 
//Prompt the user for the length and width of a lawn and then print the weekly mowing fee, as well as the 20-week seasonal fee.

//Update the program to prompt the user on how the customer wants to pay (1) once, (2) twice, or (3) 20 times per year.
//If the user enters 1 for once, the fee for the season is simply the seasonal total. If the customer request two payments,
//each payment is half the seasonal total plus a £5 service charge. If the user requests 20 separate payments add a £3 service charge per week.
//Display the number of payments the customer must make, each payment amount and the total for the season.

import java.util.Scanner;

public class ifQuestionsPt3 
{

	public static void main(String[] args)
	{
	Scanner key = new Scanner(System.in);	

	double weeklyFee=0;
	
	System.out.println("please enter the width of the lawn : ");
	double length = key.nextDouble();
	
	System.out.println("please enter the width of the lwn : ");
	double width = key.nextDouble();
	
	double area = length*width;
	
	if(area >=600)
	{
	weeklyFee = 50;	
	}
	else if (area <600 || area >=400)
	{
	weeklyFee = 35;
	}
	else
	{
	weeklyFee = 25;	
	}
	
	
	double seasonalFee= weeklyFee*20;
	System.out.println("Your weekly fee is £"+ weeklyFee +"\nYour seasonal fee is £"+seasonalFee);
	
	System.out.println("how would u like to pay (1) once, (2) twice  or (3) individual");
	int option=key.nextInt();
	
	if(option >3)
	{
	System.out.println("invalid payment choice!!");	
	}
	else if(option ==1)
	{
		System.out.println("Your total fee is £"+seasonalFee);
	}
	else if (option ==2)
	{
		double twoPayments = seasonalFee/2;
		double feeAfterService=seasonalFee+10;
		System.out.println("Make two payments of £"+twoPayments+ " Additional £5 fee for service charge, Total comes up £"+ feeAfterService);
	}
	else if (option ==3)
	{
		double singlePayments = seasonalFee/20;
		double feeAfterService=seasonalFee+60;
		System.out.println("Make twenty individual paymeents of £"+singlePayments+ " Additional £3 fee for service charge, Total comes up £"+ feeAfterService);
	}

	
	}
		

}
