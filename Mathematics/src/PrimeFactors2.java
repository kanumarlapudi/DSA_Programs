import java.util.Scanner;

//Naire Solution

public class PrimeFactors2 {

	public static void printFactors(int num) {
		if(num <= 1) {
			return;
		}
		for (int i = 2; i*i <= num; i++) {
			
				while (num % i == 0) {
					System.out.println(i);
					num = num/i;
				}
			}
		if(num>1) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to find prime factors: ");
		int num = scan.nextInt();

		printFactors(num);

	}

}
