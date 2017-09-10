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
	public static String toImproperFrac (int wholeNumber, int numerator, int denominator) {
		return (wholeNumber * denominator + numerator) + "/" +  denominator;
				// fix so it returns a string
	}
	public static String toMixedNum (int wholeNumber2, int numerator2, int denominator2) {
		return (numerator2 / denominator2) + " " + (numerator2 % denominator2) + "/" + denominator2; 
		// fix so it returns a string
	}
	public static String foil (int inputNumber6, int inputNumber7, int inputNumber8, int inputNumber9,char n) {
		int a2 = (inputNumber6 * inputNumber8 * n * n);
		int b2 = (inputNumber7 * inputNumber8 * n) + (inputNumber6 * inputNumber9 * n);
		int c2 = (inputNumber7 * inputNumber9);
		return (a2 + b2 + c2);
				// not sure if this actually returns a string
	}
	public static boolean isDivisibleBy (int diviser, int dividend) { 
		if (dividend % diviser == 0) { 
			return true;
		} else {
			return false;
		}
	}
	public static double absValue (double inputNumber10) {
		if (inputNumber10 < 0) {
			return -inputNumber10;
		} else if (inputNumber10 == 0){ 
			return 0;
		} else {
			return inputNumber10;
		}
	}
	public  static double max (double inputNum11, double inputNum12) {
		if (inputNum11 > inputNum12) {
			return inputNum11;
		} else { 
			return inputNum12;
		}
	}
	public static double max (double inputNum13, double inputNum14, double inputNum15) {
		if (inputNum13 > inputNum14 & inputNum13 > inputNum15) {
			return inputNum13;
		} else if (inputNum14 > inputNum15) {
			return inputNum14;
		} else {
			return inputNum15;
		}
	}
	public static int min (int inputNum16, int inputNum17) {
		if(inputNum16 < inputNum17) {
			return inputNum16;
		} else {
			return inputNum17;
		}
	}
	public static double round2 (double inputNum18) {
		if (inputNum18 * 1000 % 10 < 5) {
			return ((inputNum18 * 1000) - (inputNum18 * 1000 % 10))/1000;
		} else {
			return ((inputNum18 * 1000) + (10 - (inputNum18 * 1000 % 10)))/1000;
		}
	}
}

	
	
	
	
	
