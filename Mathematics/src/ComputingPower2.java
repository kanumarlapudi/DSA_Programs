import java.util.Scanner;

//Efficient Solution
//Time Complexity - O(log n)


public class ComputingPower2 {
	
	public static int power(int x, int n) {
		
		if(n == 0) {
			return 1;
		}
		
	    int temp = power(x , n/2);
	    temp = temp * temp;
	    
	    if(n % 2 == 0) {
	    	return temp;
	    }
	    else {
	    	return temp * x;
	    }
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
