//Time complexity - O(n^2)
//space complexity - O(1)
//Bubble sort is a stable sort

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the elements in a array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of the arr[" + i + "] : ");
            arr[i] = scan.nextInt();
		}
		
		//Implementation of Bubble Sort 
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr.length-i-1;j++) {
    		   if(arr[j] > arr[j+1]) {
    			   int temp = arr[j];
    			   arr[j] = arr[j+1];
    			   arr[j+1] = temp;
    		   }
    	   }
       }
       
       System.out.println("Sorted Array is : ");
       System.out.println(Arrays.toString(arr));
	}
}
