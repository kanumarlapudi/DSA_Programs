import java.util.Arrays;
import java.util.Scanner;

public class FindingPrimeNumberBetweenNumber3 {

	public static void sieve(int n) {
		if (n <= 1) {
			return;
		}

		Boolean isPrime[] = new Boolean[n + 1];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j = j + i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number to check prime or not : ");
		int n = scan.nextInt();

		sieve(n);

	}

}
