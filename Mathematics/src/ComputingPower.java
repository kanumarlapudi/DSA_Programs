import java.util.Scanner;

//Naive Solution
//Time Complexity - O(n)


public class ComputingPower {
	
	public static int power(int x, int n) {
		
		int res = 1;
		
		for(int i = 0; i < n; i++) {
			res = res * x;
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the value of x : ");
        int x = scan.nextInt();
        System.out.println("Please Enter the value of n : ");
        int n = scan.nextInt();
        
        power(x,n);
        System.out.println("power(" + x + "," + n + ") is : " + power(x,n));
	}

}
