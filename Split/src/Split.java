/*Reina lobos
Split String
 * 24 oct 2017
 */
//SplitString Starter Code
		 //It's a method that acts on a string, <StringName>.split(<String sp>);
	//Where sp is the string where the string splits
	//And it returns an array
	// Example: "I like apples!".split(" "); 
//		it will split at spaces and return an array of ["I","like","apples!"]
	// Example 2: "I really like really red apples"split("really")
//		it will split at the word "really" and return an array of ["I "," like "," red apples!"]
	//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?

import java.util.*;
public class Split {
	public static void main(String[] args) {
		String[] apples = "I like apples!".split(" ");
		System.out.println(Arrays.toString(apples));
		String[] redApples =  "I really like really red apples".split("really");
		System.out.println(Arrays.toString(redApples));
		String[] reallyx2 = "I reallyreally like apples".split("really");
		System.out.println(Arrays.toString(reallyx2));
		String [] really ="really I reallyreally like apples, really ".split("really");
		System.out.println(Arrays.toString(really));
	}
	
	//Your task:
	/*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	* ignore apples, pineapples, and cheese
	*plan:
	*find indexes of bread
	*
	
	public static void breadSplit (String sandwich) {		
		String firstSlice = sandwich.inde
		for (int i = 0; i < sandwich.length(); i++) {
			if() {
				
			}
	
	
	}
	//Your task pt 2:
	/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/



	


}
