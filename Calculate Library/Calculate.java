/*Reina Lobos
* Sept 5, 2017 
*home grown library that contains various mathematical methods
*/
public class Calculate {
	
	public static int square (int operand) {
		return operand * operand;
/*This method takes an integer and returns its square*/
	} 
	public static int cube (int number) {
		return number * number *number;
	}
	public static double averageOf2 (double inputNumber1, double inputnumber2) {
		return (inputNumber1 + inputnumber2 )/2;
	}
	public static double averageOf3 (double inputNumber3, double inputNumber4, double inputNumber5) {
		return ( inputNumber3 + inputNumber4 + inputNumber5 )/2;
	}
	public static double toDegrees (double inputRadian) {
		return inputRadian * (180/3.14159); 
	}
	public static double toRadians (double inputDegrees) {
		return inputDegrees * (3.14159/180); 
	}
	public static double discriminant (double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}
	public static int toImproperFrac (int wholeNumber, int numerator, int denominator) {
		return (wholeNumber + numerator) / denominator;
				// fix so it returns a string
	}
	public static int toMixedNum (int wholeNumber2, int numerator2, int denominator2) {
		return 
		// fix so it returns a string
	}
	public static int foil (int inputNumber6, int inputNumber7, int inputNumber8, int inputNumber9,char n) {
		int a2 = (inputNumber6 * inputNumber8 * n * n);
		int b2 = (inputNumber7 * inputNumber8 * n) + (inputNumber6 * inputNumber9 * n);
		int c2 = (inputNumber7 * inputNumber9);
		return (a2 + b2 + c2);
				// not sure if this actually returns a string
	}
}

	
	
	
	
	
