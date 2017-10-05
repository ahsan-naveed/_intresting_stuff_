import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int[] test = twoSum(arr, 5);
		System.out.println(test[0]);
		System.out.println(test[1]);
	}
	public static int[] twoSum (int[] nums, int target) {
		// Bruteforce
		/*for (int i = 0; i< nums.length; i++) {
			int x = nums[i];
			for (int j = i+1; j<nums.length; j++ ) {
				if (target-x == nums[j]) {
					return new int[] {i+1, j+1};
				}
			}
		}
		return new int[] {-1};*/
    
    // lookup time reduced to O(1)
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<nums.length; i++) {
			int x = nums[i];
			if(map.containsKey(target-x)) return new int[] {map.get(target-x), i};
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution found");

		
	}
}
