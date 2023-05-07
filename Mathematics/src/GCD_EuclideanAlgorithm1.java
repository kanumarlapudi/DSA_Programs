import java.util.Scanner;

public class GCD_EuclideanAlgorithm1 {
	
	public static int gcd(int a, int b) {
		
		while(a!=b) {
			if( a > b) {
				a = a - b;
			}
			else {
				b= b - a;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the two number to find GCD : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
	
		System.out.println("The GCD of " + a + " and " + b + " is : " + gcd(a,b));

	}

}
