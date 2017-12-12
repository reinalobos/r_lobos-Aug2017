//Reina Lobos
// 7 Nov 2017
package fracCalcOld;
import java.util.*;

public class FracCalcOld {
   
	public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	String goAgain;
    	do {
    	String input = userInput.nextLine();
    	System.out.println(produceAnswer(input));
    	System.out.println("Type Q to quit");
    	goAgain = userInput.nextLine();
    	//String firstOperand = "2_3/4";
    	 //String[] operand1 = firstOperand.split("_|/");
    	// System.out.println(Arrays.toString(operand1));
    	} while (goAgain !="Q");
    }

		// TODO Auto-generated method stub
		
	

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
   
	public static int[] produceAnswer(String input){ 
   //checkpoint 1
		String[] inputToArray = input.split(" ");
        String firstOperand = inputToArray[0];
        String operator = inputToArray[1];
        String secondOperand = inputToArray[2];
        return OperandsBrokenDown(secondOperand);
       
      // return input2BrokenDown;
    	// TODO: Implement this function to produce the solution to the input    
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int[] OperandsBrokenDown (String operand) {
    	//String[] input1 = firstOperand.split("_|/");
      //  String[] input2  = secondOperand.split("_|/");
       int wholeNumber = 0;
       int numerator = 0;
       int denominator = 1;
    //this method separates each operand into the whole number, numerator, and denominator       
    	if (!(operand.indexOf("/")>0)){
    		//if operand is an integer
    		wholeNumber = Integer.parseInt(operand);
    		}
    	else if (!(operand.indexOf("_")>0) && (operand.indexOf("/")>0)){
    		//if operand is a fraction
    		numerator = Integer.parseInt(operand.substring(0, operand.indexOf("/")));
    		denominator = Integer.parseInt(operand.substring(operand.indexOf("/")+1));
    		}
    	else {
    		//if operand is a mixed number	
    		numerator = Integer.parseInt(operand.substring(operand.indexOf("_")+1, operand.indexOf("/")));
    		denominator = Integer.parseInt(operand.substring(operand.indexOf("/")+1));
    		wholeNumber = Integer.parseInt(operand.substring(0,operand.indexOf("_")));
    		}  
    	
    	//method returns the components as elements of an array
    	int[] components = new int[3];
    	components [0] = numerator;
    	components [1] = denominator;
    	components [2] = wholeNumber;
    	return components;
    }
}