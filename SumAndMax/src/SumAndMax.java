//Reina Lobos
//oct 3 2017
import java.util.*;
public class SumAndMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in numbers");
		int sum = 0;
		String numbers = scanner.nextLine();
        Scanner theNumber = new Scanner(numbers);
        for (int run = theNumber.nextInt(); run > 0; run--){
              System.out.print(run + " ");
              sum += theNumber.nextInt();
		}
        
	} 
	
}