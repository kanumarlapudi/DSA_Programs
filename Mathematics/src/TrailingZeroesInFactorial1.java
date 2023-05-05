import java.util.Scanner;

public class TrailingZeroesInFactorial1 {

	static int res = 0;
	public static int count(int num) {  
		for(int i=5; i<=num; i = i*5) {
			res = res + num/i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int num = scan.nextInt();
		
		count(num);
		System.out.println("The count of 0 in " + num + " is : " + res);

	}

}
