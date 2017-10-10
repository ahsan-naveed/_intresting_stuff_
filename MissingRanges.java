// following solution only gives missing ranges within the provided nums

import java.util.*;

public class MissingRanges {
	public static void main(String[] args) {
		int[] nums = {0, 1, 3, 50, 75};
		System.out.println(missingRanges(nums));
	}

	public static ArrayList<String> missingRanges(int[] nums) {
		ArrayList<String> ranges = new ArrayList<>();
		for (int i = 0; i < nums.length - 1; i++) {
			int diff = Math.abs(nums[i+1] - nums[i]);
			if ( diff > 1) {
				String LRange = String.valueOf(nums[i]+1);
				String RRange = String.valueOf(nums[i+1]-1);
				if (RRange.equals(LRange)) ranges.add(String.valueOf(diff));
				else ranges.add(LRange+"->"+RRange);
			}
		}
		return ranges;
	}
}
