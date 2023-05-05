
public class Palindrome {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,3,2,1 };
		int n = arr.length;
		boolean flag = false;
		for (int i=0;i<n/2;i++) {
			if(arr[i] != arr[n-i-1]) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.print("The given array is : Palindrome");
		}

	}

}
