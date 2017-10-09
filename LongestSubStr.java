import java.util.*;

public class LongestSubStr {
	public static void main (String[] args) {
		// Testcase 1 : should return 1
		String s = "bbbbb";
		System.out.println(longest(s));
	}
	public static int longest (String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) return map.size();
			else map.put(c, 1);
		}
		return 0;
	}
}
