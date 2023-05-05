//time complexity = O(logn)
import java.util.Scanner;

public class RecursionFindingPower {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a and b : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//Function calling
		int result = powerFind(a,b);
		System.out.println("a^b is " + result);

	}

	public static int powerFind(int a, int b) {
		int mid = 0, result = 0, finalResult = 0;
		//base case condition
		if(b==1) {
			return a;
		}
		
		else {
			mid = b/2;
			//recursive function call
			result = powerFind(a,mid);
			finalResult = result * result;
			if(b%2 == 0) {
				return finalResult;
			}
			else {
				return a * finalResult;
			}
		}
	}

}
