import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int x = scan.nextInt();
		int count = 0;
		int temp = x;
		while (temp>0) {
			temp = temp/10;
			count++;
		}
		System.out.println("The no.of digits of the number " + x + " is : " + count);

	}

}
