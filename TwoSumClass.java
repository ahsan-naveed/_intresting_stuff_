// Solution to: TwoSumIII - Data structure design 

import java.util.*;


public class TwoSumClass {
	public static void main(String[] args) {

		// Testcase 1
		TwoSum obj = new TwoSum();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		boolean bol = obj.find(7);
		System.out.println(bol);
	}
}

class TwoSum {

	static ArrayList<Integer> arr = new ArrayList<>();

	// O(n)	
	public static void add (int val) {
		arr.add(val);
	}

	// O(n)
	public static boolean find(int val) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i =0; i<arr.size(); i++) {
			int x = arr.get(i);
			if (map.containsKey(val - x)) return true;
			map.put(x, i);
		}
		return false;
	}
}
