import java.util.Scanner;

public class InterviewProblem_LowerBound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the elements in a array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of the arr[" + i + "] : ");
            arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the target value that you want to search for: ");
		int target = scan.nextInt();
		
		//Implementation of Linear Search Algorithm
        int low = 0, high = arr.length-1, idx = -1;
        
        while(low<=high) {
        	int mid = low + (high-low)/2;
        	if(arr[mid] == target) {
        		idx = mid;
        		high = mid-1;
        	}
        	else if(mid<target) {
        		low = mid+1;
        	}
        	else {
        		high = mid-1;
        	}
        }
        if(idx == -1) {
			System.out.println("Element not found :" + target);
		}
		else {
			System.out.println("First Occurence of an element is at the location: " + idx);
		}
	}

}
