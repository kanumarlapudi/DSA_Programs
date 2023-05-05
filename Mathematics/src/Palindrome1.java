import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to check palindrome or not: ");
		int num = scan.nextInt();
		int x = num;
		int temp = 0;
		while (x > 0) {
			temp = temp * 10 + (x % 10);
			x = x/10;
		}
		
		if(num == temp) {
			System.out.println("The given number is palindrome : " + num);
		}
		else {
			System.out.println("The given number is not a palindrome : " + num);
		}

	}

}
