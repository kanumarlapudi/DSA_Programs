import java.util.Scanner;

public class FindingPrime1 {
	
	
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number to check prime or not : ");
		int n = scan.nextInt();
		
		System.out.println(isPrime(n));

		
	}

}
