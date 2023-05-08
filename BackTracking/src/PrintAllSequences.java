import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllSequences {

	public static void printSequence(int arr[], int index, ArrayList<Integer> tempArr) {

		// base case
		if (index == arr.length) {
			// print all the sequences -- but do not print empty entries
			if (tempArr.size() > 0) {
				System.out.println(tempArr);
			}
			return;
		}

		// recursive call

		// include
		printSequence(arr, index + 1, tempArr);

		// add the value in tempArray
		tempArr.add(arr[index]);

		// do not include
		printSequence(arr, index + 1, tempArr);

		// remove the value from tempArray -- backtracking
		tempArr.remove(tempArr.size() - 1);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2 };

		System.out.println("for the array - " + Arrays.toString(arr));

		printSequence(arr, 0, new ArrayList<Integer>());

		int arr1[] = { 1, 2, 3};

		System.out.println("for the array - " + Arrays.toString(arr1));

		printSequence(arr1, 0, new ArrayList<Integer>());

	}

}
