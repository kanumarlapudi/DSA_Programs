import java.util.Scanner;

public class LinearSearch {

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
		int idx = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("Element not found :" + target);
		}
		else {
			System.out.println("Element is present at the location: " + idx);
		}
		
	}

}
