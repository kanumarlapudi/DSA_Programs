import java.util.Scanner;

public class RecursionNumberOfStairs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of stairs : ");
        int n = scan.nextInt();
        
        //function calling
        int result = countFind(n+1);
        
        System.out.println("The number of ways are : " + result);
		
	}

	//function definition
	public static int countFind(int n) {
		//base case condition
		if(n<=1) {
			return n;
		}
		else {
			return countFind(n-1) + countFind(n-2);
		}
	}

}
