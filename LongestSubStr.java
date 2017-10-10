import java.util.*;

public class LongestSubStr {
	public static void main (String[] args) {
		// Testcase 1 : should return 1
		String s = "bbbbbbabcdefghbbbbabcdef";
		System.out.println(longest(lean(s)));
	}
	public static int longest (String s) {
		Map<Character, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				list.add(map.size());
				map.clear();	
			}
			else map.put(c, 1);
		}
		return list.size() > 0 ? Collections.max(list) : 0;
	}

	// remove repeated chars 
	public static String lean(String s) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++ ) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			if (c1 != c2) str.append(c1);	
		}
		// get the last char
		str.append(s.charAt(s.length() -1));
		return new String(str);	
	}

}
