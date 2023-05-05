// Time complexity is O(n)

import java.util.Scanner;

public class RecusrionFactorial {

	static int result = 1;
	
	public static int factorial(int n) {
		if(n == 1 || n==0) {
			return 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find factorial : ");
		int num = scan.nextInt();
		factorial(num);
		System.out.println("The factorial of " + num +" is : " + result);

	}
	

}
