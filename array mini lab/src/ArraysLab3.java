/*Reina Lobos
 * 10/31
 */
import java.util.*;
public class ArraysLab3 {
	/*	Plan: create new int[] sum
	for loop where i=0;i<length of array; i++
	in the loop add index of i of both arrays and put into new array
	continue until array is full
	return array outside of loop
	 */
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int [arr1.length];
		for (int i = 0; i<= arr1.length; i++) {
			sum[i] = arr1[i] + arr2[i] ;
		}
		return sum;
	}
	//plan: create new array int[] append with length+1
	// for loop

	public static int[] append(int[] arr, int num) {
		int[] append = new int [arr.length +1];
		for (int i = 0; i <= append.length; i++) {
			append[i] = arr[i];
		}
		append[append.length-1]= num;
		return append;
	}
	/*plan: create new array named remove with length-1
	Copy over numbers in a for loop until length -1(original length) 
	for loop up to length
	if in for loop if i is not idx copy into new array
	* Write a method named remove that accepts an array of integers arr and an integer idx 
	* and returns an array of integers consisting of all of the elements of arr 
	* except for the element at index idx (thus, the returned array has a length of arr.length � 1). 
	* You can assume arr has at least two elements.
	*/
	public static int[] remove(int[] arr, int idx){
		for (int i = 0; i <)
		assert (arr.length >= 2);
	}
	/*
	* Write a method sumEven that accepts an array of integers arr 
	* and returns an integer containing the sum of the elements at the even indices of arr. 
	* (That means elements at indices 0,2,4,6,8.) You can assume arr has at least one element.
	*/
	public static int sumEven(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i += 2) {
		sum += arr[i];
		}
		return sum;
	}
	/*
	* Write a method rotateRight that accepts an array of integers arr 
	* and does not return a value. 
	* The rotateRight method moves each element of arr one index to the right 
	* (element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0). 
	* You can assume arr has at least one element.
	*/
	public static void rotateRight(int[] arr){
		int last = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 1; i--) {
		;	arr[i] = arr[i-1];
		}
		arr[0] = last;
		assert (arr.length > 0);
	}

	/*
	* Write a main method that will 
	Contain
	integer arrays a1, a2, sumArr, appendArr, removeArr
	int variables appendNum, removeIdx, sumOfEvens
	Carry out the following actions
	Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
	and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
	Form sumArr by calling the sum method with a1 and a2 as inputs
	Declare int appendNum and set it to 200.
	Form appendArr by calling the append method with a1 and appendNum as inputs
	Declare int removeIdx and set it to 5.
	Form removeArr by calling remove with a2 and removeIdx
	Form sumOfEvens by calling sumEven with appendArr as the input
	Call rotateRight with a1 as the input
	On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
	sumArr
	appendArr
	removeArr
	sumOfEvens (an int you don�t need Arrays.toString)
	a1
	*/

	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20 , 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int sumArr[] = sum(a1, a2);
		int appendNum = 200;
		int appendArr[] = append(a1, appendNum);
		int removeIdx = 5;
		int removeArr[] = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
	
}



