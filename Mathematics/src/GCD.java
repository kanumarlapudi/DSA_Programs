import java.util.Scanner;

public class GCD {
	static int res;
	public static int gcd(int a, int b) {
		res = Math.min(a, b);
		
		while(res>0) {
			if( a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the two number to find GCD : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		gcd(a,b);
		System.out.println("The GCD of " + a + " and " + b + " is : " + res);

	}

}
