/* Reina Lobos
* Oct 30, 2017
*/
import java.util.*;
public class LotsofCopies {
	public static void main (String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		//System.out.println(num);	
		//System.out.println(strMain);
		//System.out.println(Arrays.toString(arrMain));
	}	
		
	public static void changeMe(int x, String str, int[] arr) {
		//x=8;
		str = "Hello";
		for (int i = 0; i < arr.length; i++) {
		arr[i]++;
		}
		// a = startValue
		// b = a
		// a = newValue
		// x = 7; x is our first a
		int b = x;
		 x = 3;
		 System.out.println("b:" + b);
		 
		 String bStr = str;
		 str = "Hi";
		 System.out.println("bStr:"+ bStr);
		 
		 int[] barr = arr;
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		 System.out.println("barr:" + Arrays.toString(barr));
	}
	

}
