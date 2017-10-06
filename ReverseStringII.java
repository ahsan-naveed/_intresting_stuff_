// in-place reversal

import java.util.*;

public class ReverseStringII {
	public static void main (String[] args) {
		StringBuilder str = new StringBuilder("the sky is blue");
		System.out.println(reverse(new StringBuilder(reverse(str))));
	}
	
	// wrong solution - wait till I post the correct solution
	/*public static String reverse(StringBuilder str) {
		int i = 0, j = str.length() - 1;
		while (i != j) {
			char temp = str.charAt(i);
			str.setCharAt(i, str.charAt(j));
			str.setCharAt(j, temp);
			i++;
			j--;
		}
		return new String(str);
	}*/
}
