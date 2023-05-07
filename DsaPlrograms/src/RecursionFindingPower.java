//time complexity = O(logn)
import java.util.Scanner;
import java.math.*;

public class RecursionFindingPower {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a and b : ");
		BigInteger a = scan.nextBigInteger();
		int b = scan.nextInt();
		
		//Function calling
		BigInteger result = powerFind(a,b);
		System.out.println("a^b is " + result);

	}

	public static BigInteger powerFind(BigInteger a, int b) {
		BigInteger result , finalResult;
		//base case condition
		if(b==1) {
			return a;
		}
		
		else {
			
			//recursive function call
			result = powerFind(a,b/2);
			finalResult = result.multiply(result);
			if(b%2 == 0) {
				return finalResult;
			}
			else {
				return a.multiply(finalResult);
			}
		}
	}

}
