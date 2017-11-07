/*Reina Lobos
* Sept 5, 2017 
*home grown library that contains various mathematical methods
*/
public class Calculate {
	
	public static int square (int operand) {
		return operand * operand;
		
/*This method takes an integer and returns its square*/
	} 
	public static int cube (int inputNumber) {
		return inputNumber * inputNumber *inputNumber;
	}
<<<<<<< HEAD
	public static double average (double inputNumber1, double inputnumber2) {
		return (inputNumber1 + inputnumber2 )/2;
	}
	public static double average (double inputNumber3, double inputNumber4, double inputNumber5) {
		return ( inputNumber3 + inputNumber4 + inputNumber5 )/2;
	}
	public static double averageOf3 (double inputNumber3, double inputNumber4, double inputNumber5) {
		return ( inputNumber3 + inputNumber4 + inputNumber5 )/2;
=======
	public static double averageOf2 (double inputNumber, double inputnumber2) {
		return (inputNumber + inputnumber2 )/2;
	}
	public static double averageOf3 (double inputNumber, double inputNumber2, double inputNumber3) {
		return ( inputNumber + inputNumber2 + inputNumber3 )/2;
>>>>>>> branch 'master' of https://github.com/reinalobos/r_lobos-Aug2017.git
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
	public static String toMixedNum (int wholeNumber, int numerator, int denominator) {
		return (numerator / denominator) + " " + (numerator % denominator) + "/" + denominator; 
		// fix so it returns a string
	}
<<<<<<< HEAD
	public static String foil (int inputNumber6, int inputNumber7, int inputNumber8, int inputNumber9,char n) {
		int a2 = (inputNumber6 * inputNumber8 * n * n);
		int b2 = (inputNumber7 * inputNumber8 * n) + (inputNumber6 * inputNumber9 * n);
		int c2 = (inputNumber7 * inputNumber9);
		return ("a2 + b2 + c2");
				// not sure if this actually returns a string
=======
	public static String foil (int inputNumber, int inputNumber2, int inputNumber3, int inputNumber4,String variable) {
		int numOne = inputNumber *inputNumber3;
		int numTwo = (inputNumber * inputNumber4) + (inputNumber2 * inputNumber3);
		int numThree = inputNumber2 * inputNumber4;
		
		return numOne + variable + "^2" + " + " + numTwo + variable + " + " + numThree;
>>>>>>> branch 'master' of https://github.com/reinalobos/r_lobos-Aug2017.git
	}

	public static boolean isDivisibleBy (int diviser, int dividend) { 
		if (dividend % diviser == 0) { 
			return true;
		} else {
			return false;
		}
	}
	public static double absValue (double inputNumber) {
		if (inputNumber < 0) {
			return -inputNumber;
		} else if (inputNumber == 0){ 
			return 0;
		} else {
			return inputNumber;
		}
	}
	public  static double max (double inputNumber, double inputNumber2) {
		if (inputNumber > inputNumber2) {
			return inputNumber;
		} else { 
			return inputNumber2;
		}
	}
	public static double max (double inputNumber, double inputNumber2, double inputNumber3) {
		if (inputNumber > inputNumber2 & inputNumber > inputNumber3) {
			return inputNumber;
		} else if (inputNumber2 > inputNumber3) {
			return inputNumber2;
		} else {
			return inputNumber3;
		}
	}
	public static int min (int inputNumber, int inputNumber2) {
		if(inputNumber < inputNumber2) {
			return inputNumber;
		} else {
			return inputNumber2;
		}
	}
	public static double round2 (double orig) {
		double result = 0.0;
		int tempInt = (int)(orig * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
		if (roundNum >= 5 && tempInt > 0) {
			tempInt++;
		} else if (roundNum <= -5 && tempInt < 0) {
			tempInt--;	
		}

	

	result = tempInt / 100.0;
		return result;
	}
	public static double exponent(double base, int exponent) {
		if(exponent < 0) {
			throw new IllegalArgumentException();
		}
		double result = 1;
		for(int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}public static int factorial(int inputNumber) {
		if(inputNumber < 0) {
			throw new IllegalArgumentException();
		}
		int result = inputNumber;
		for(int i = 1; i < inputNumber; i++) {
			result *= inputNumber - i;
		}
		return result;
	}
	public static  boolean isPrime (int input) {
		if(input < 2) {
			return false;
		} else if(input == 2) {
			return true;
		} else {
			for(int i = 2; i <= input; i++) {
				if(isDivisibleBy(i, input)) {
					return false;
				}else {
					return true;
				}
			}
		}
		return false;
	}

}

																																																																																																																																																																																											
	
	
	
	
