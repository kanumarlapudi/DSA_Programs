import java.util.Scanner;

public class RecursionFibonacci {

	public static int fibonacciFinding(int n) {
		int result = 1;
		//1.base case condition
		if(n<=1) {
			return n;
		}
		else {
			result = fibonacciFinding(n-1) + fibonacciFinding(n-2);
		}
		return result;

	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nth number in fibonacci series : ");
		int n = scan.nextInt();
		int result = fibonacciFinding(n);
		System.out.println("The result of fibonacci is: " + result);

	}

}
