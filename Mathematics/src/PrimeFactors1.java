import java.util.Scanner;

//Naire Solution

public class PrimeFactors1 {

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printFactors(int num) {
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				int x = i;
				while (num % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}else {
				System.out.println(num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to find prime factors: ");
		int num = scan.nextInt();

		printFactors(num);

	}

}
