import java.util.*;

public class RotateArrayByK {
	public static void main (String[] args) {
		// Testcase 1
		int[] arr = {0, 1, 2, 3, 4, 5, 6};
		rotateByK(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

	public static void rotateByK (int[] arr, int k) {
		for (int i = k-1, j = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
	}
}
