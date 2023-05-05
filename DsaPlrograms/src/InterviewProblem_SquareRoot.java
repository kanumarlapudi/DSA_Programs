import java.util.Scanner;

public class InterviewProblem_SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whose square root you are looking for: ");
		int num = scan.nextInt();
		
		int low = 0, high = num, result = -1;
        
        while(low<=high) {
        	int mid = low + (high-low)/2;
        	long val = mid * mid;
        	if(val == num) {
        		//Perfect square root of the number
        		result = mid;
        		break;
        	}
        	else if (val < num) {
        		//store the mid as we need to report the floor value in case of non perfect square root of the given number
        		result = mid;
        		// right side of an array
        		low = mid + 1;
        	}
        	else {
        		high = mid-1;
        	}
        }
	    System.out.println("The square root of a given number is: " + result);
		
	}

}
