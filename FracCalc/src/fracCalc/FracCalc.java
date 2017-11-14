//Reina Lobos
// 7 Nov 2017
package fracCalc;
import java.util.*;

public class FracCalc {
   
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
    	} while (goAgain != "Q");
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
    public static String produceAnswer(String input){ 
      
    //checkpoint 1
    	String[] inputToArray = input.split(" ");
       String firstOperand = inputToArray[0];
       String operator = inputToArray[1];
       String secondOperand = inputToArray[2];
       String[] input1 = firstOperand.split("_|/");
       String[] input2 = secondOperand.split("_|/");
     return OperandsBrokenDown(firstOperand, secondOperand);
       
      // return input2BrokenDown;
    	// TODO: Implement this function to produce the solution to the input    
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String OperandsBrokenDown (String firstoperand, String secondOperand) {
    	String[] input1 = firstoperand.split("_|/");
         String[] input2 = secondOperand.split("_|/");
         String input1BrokenDown =  "whole:" + input1[0] + " numerator:" + input1[1] + " denominator:" + input1[2];
         String input2BrokenDown = "whole:" + input2[0] + " numerator:" + input2[1] + " denominator:" + input2[2];
         for (int i = 0; i < 2; i++) {
        		 if (input1[i] == "null") {
        		 input1[i] = "0";
        	 }
         }
         if (input1[2] == "null") {
        	input1[2] = "1";
        }
         for (int i = 0; i < 2; i++) {
    		 if (input2[i] == "null") {
    		 input2[i] = "0";
    	 }
     }
        if (input2[2] == "null") {
        	input2[2] = "1";
        }
         return input2BrokenDown;
    }
}
