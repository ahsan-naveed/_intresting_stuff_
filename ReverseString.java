import java.util.*;


public class ReverseString {
	public static void main (String[] args) {
		System.out.println(reverse("         the        sky is      blue"));
	}

	// wrong solution:
	/*public static String reverse(String str) {
		StringBuilder rstr = new StringBuilder();
		for (int i=str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			if (c != ' ') rstr.append(c);
		}
		return new String(rstr);
	}*/

	// another try - it worked the second time
	public static String reverse(String str) {
		StringBuilder rstr = new StringBuilder();
		String[] strs = str.trim().split("\\s+");
		for (int i = strs.length - 1; i >= 0; i--) {
			StringBuilder temp = new StringBuilder();
			temp.append(strs[i]).append(" ");
			rstr.append(temp);
		}
		return new String(rstr).trim();
	}
}
