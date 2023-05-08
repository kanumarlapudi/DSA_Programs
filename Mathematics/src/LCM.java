import java.util.Scanner;

public class LCM {
	
	public static int lcm(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res % a == 0 && res % b == 0) {
				return res;
			}
			res++;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the two numbers to find lcm : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("The lcm of " + a + " " + b + " is : " + lcm(a,b));

	}

}
