import java.util.Scanner;

public class TrailingZeroesInFactorial {

	static int res = 0;
	public static int count(int num) {  
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact = fact * i;
		}
		
		while(fact % 10 == 0) {
			res++;
			fact = fact/10;
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
