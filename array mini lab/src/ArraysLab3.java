/*Reina Lobos
 * 10/31
 */
import java.util.*;
public class ArraysLab3 {
	public static void main (String[] args) {
	}
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
	*/
	public static int[] remove(int[] arr, int idx) {
		int [] remove = new int[arr.length-1];
		for (int i = 0)
	}




}
