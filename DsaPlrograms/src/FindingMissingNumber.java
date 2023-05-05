
public class FindingMissingNumber {

	public static void main(String[] args) {

		int arr[] = {1,2,3,5,6,7};
		int n = arr.length;
		int sum_natural_nums = ((n+1)*(n+2))/2;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int missing_num = sum_natural_nums - sum;
		System.out.println("The missing number is : " + missing_num);
	}
}
