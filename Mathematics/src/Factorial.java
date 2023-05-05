import java.util.Scanner;

public class Factorial {
	
	static int total = 1;
	
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			total = num * fact(num-1);
		}
		return total;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number to find factorial : ");
		int num = scan.nextInt();
		
		fact(num);
		System.out.println("The factorial of number " + num + " is : " + total);

	}

}
