//Time complexity - O(n^2)
//space complexity - O(1)
//Bubble sort is a stable sort

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the elements in a array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of the arr[" + i + "] : ");
            arr[i] = scan.nextInt();
		}
		
		//Implementation of Selection Sort 
       for(int i=0;i<arr.length;i++) {
    	   //min_idx is responsible to store the index of minimum value in every iteration
    	   int min_idx = i;
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[j] < arr[min_idx]) {
    			   min_idx = j;
    		   }
    	   }
    	   if(min_idx != i) {
    		   //swap required
    		   int temp = arr[min_idx];
    		   arr[min_idx] = arr[i];
    		   arr[i] = temp;
    	   }
    		  
       }
       
       System.out.println("Sorted Array is : ");
       System.out.println(Arrays.toString(arr));
	}
}
