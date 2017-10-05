import java.util.*;

public class TwoSumII {
	public static void main(String[] args) {

		// Testcase 1
		int [] arr = {1,2,3,4,5};
		int[] test = twoSum(arr, 5);
		System.out.println(test[0]);
		System.out.println(test[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		for (int i =0; i< nums.length; i++) {
			int x = nums[i];
			int index = binarySearch(nums, target-x);
			if (index != -1) return new int[] {index, i};
		}
		throw new IllegalArgumentException("No two sum solution found");
	}
	public static int binarySearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		while(lo < hi) {
			int mid = lo + (hi - lo)/2;
			if (key > arr[mid]) lo = mid + 1 ;
			else if (key < arr[mid]) hi = mid - 1;
			else return mid;	
		}
		return -1;
	}
}
