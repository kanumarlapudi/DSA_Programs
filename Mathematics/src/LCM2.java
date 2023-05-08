import java.util.Scanner;

public class LCM2 {
	
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
		
	public static int lcm(int a, int b) {
		return (a * b) / gcd (a,b);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the two numbers to find lcm : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("The lcm of " + a + " " + b + " is : " + lcm(a,b));

	}

}
