

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the elements in a array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of the arr[" + i + "] : ");
            arr[i] = scan.nextInt();
		}
		
		//Implementation of Insertion Sort 
       for(int i=1;i<arr.length;i++) {
    	   int j = i;
    	   while(j>0 && arr[j] <arr[j-1]) {
    		   //swap between arr[j] and arr[j-1]
    		   int temp = arr[j];
    		   arr[j] = arr[j-1];
    		   arr[j-1] = temp;
    		   j--;
    	  }
       }
       
       System.out.println("Sorted Array is : ");
       System.out.println(Arrays.toString(arr));
	}
}
