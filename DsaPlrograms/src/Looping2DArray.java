import java.util.Scanner;

public class Looping2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows in an array: ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns in an array: ");
		int column = scan.nextInt();
		int arr[][] = new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Enter the value of " + i + j + " : ");
				arr[i][j] = scan.nextInt(); 
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
