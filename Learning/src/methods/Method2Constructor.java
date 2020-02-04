package methods;

public class Method2Constructor {

	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
		double interest = rate / 100.0;
		
		double partial1 = Math.pow((1 + interest), -numPeriods);
		
		double denominator = (1 - partial1) / interest;
		
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		
		return answer;
	
	/*This method has four parameters: the loan amount, the interest rate, the future value and the number of periods.
	 *The first three are double-precision floating point numbers, and the fourth is an integer. 
	 *The parameters are used in the method body and at runtime will take on the values of the arguments that are passed in.*/
	 
	}
}
