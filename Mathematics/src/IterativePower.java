import java.util.Scanner;

public class IterativePower {

	public static int power(int x, int n) {

		int res = 1;
		
		while( n > 0 ) {
			if( n % 2 != 0) {
				res = res * x;
			}
			
			x = x * x;
			
			n = n / 2;
		}
		
		return res;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the value of x : ");
		int x = scan.nextInt();
		System.out.println("Please Enter the value of n : ");
		int n = scan.nextInt();

		power(x, n);
		System.out.println("power(" + x + "," + n + ") is : " + power(x, n));

	}

}
