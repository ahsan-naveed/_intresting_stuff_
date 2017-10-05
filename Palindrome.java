import java.util.*;

public class Palindrome {
	public static void main (String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("panama"));
	}

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1; 
		while(i<j) {
			// skip non-alphanumeric character from head
			while (i<j && !Character.isLetterOrDigit(str.charAt(i))) i++;
			// skip non-alphanumeric character form tail
			while (i<j && !Character.isLetterOrDigit(str.charAt(j))) j--;
			if(Character.toLowerCase(str.charAt(i)) 
				!= Character.toLowerCase(str.charAt(j))) return false;
			i++;
			j--;
		}
		return true;
	} 
}
