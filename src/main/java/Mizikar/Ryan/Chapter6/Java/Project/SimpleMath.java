package Mizikar.Ryan.Chapter6.Java.Project;

public class SimpleMath {
	public double numerator;
	public double denominator;
	public double ArithmeticException;
	public double multiply;
	
	//start of divide method
public double divide(double numerator, double denominator) {
		if(denominator==0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result = numerator / denominator;
		
		System.out.println(result);
		return result;
		
	}
public double multiply(double number1, double number2) {
	
	double result = number1*number2;
	System.out.println(result);
	return result;
}
	}
