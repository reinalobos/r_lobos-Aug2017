//Reina Lobos
// 7 Nov 2017
package fracCalc;
import java.util.*;

public class FracCalc {
   
	public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	String input = userInput.nextLine();
    	System.out.println(produceAnswer(input));
    	//String firstOperand = "2_3/4";
    	 //String[] operand1 = firstOperand.split("_|/");
    	// System.out.println(Arrays.toString(operand1));
    }
    
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
       return secondOperand;
       String[] operand1 = firstOperand.split("_|/");
    	// TODO: Implement this function to produce the solution to the input    
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}