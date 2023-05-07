import java.util.Scanner;

public class GCD_EuclideanAlgorithm2 {
	
	public static int gcd(int a, int b) {
		
		if( b == 0 ) {
			return a;
		}
		else {
			return gcd( b , a%b);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the two number to find GCD : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
	
		System.out.println("The GCD of " + a + " and " + b + " is : " + gcd(a,b));

	}

}
