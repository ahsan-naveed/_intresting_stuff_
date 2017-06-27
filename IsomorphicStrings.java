
/* 
=============================================================================
% Given two strings s and t, determine if they are isomorphic. 
% Two strings are isomorphic if the characters in s can be replaced to get t.

% For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
=============================================================================
*/ 

import java.util.*;
import java.util.stream.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// create number sequence for each string
		ArrayList<Integer> numSeq_str1 = getNumSeq(args[0]);
		ArrayList<Integer> numSeq_str2 = getNumSeq(args[1]);

		// compare both number sequences of the respective strings
		if(numSeq_str1.equals(numSeq_str2)) {
			System.out.println("Strings are isomorphic");
		}else{
			System.out.println("Strings are not isomorphic");
		}
	}

	// for "foo" returns {1, 2} - for bar returns {1, 1, 1}
	public static ArrayList<Integer> getNumSeq(String str) {
		ArrayList<Character> chars = new ArrayList<>();
		ArrayList<Character> copyOfChars = new ArrayList<>();
		ArrayList<Integer> numSeq = new ArrayList<>();
		for (char c : str.toCharArray()) {
			chars.add(c);
			copyOfChars.add(c);
		}
		for (char c : copyOfChars) {
			// count the occurences of c in chars and remove it
			numSeq.add(getOccrs(c, chars));
			chars.removeAll(Collections.singleton(c));
			// no need for further looping
			if(chars.isEmpty())
				break;
		}
		return numSeq;
	}

	// get frequencies of each char in a string
	public static Integer getOccrs(char target, ArrayList<Character> chars) {
		int count = 0;
		for (char c : chars) {
			if (c == target)
				count += 1;
		}
		return count;
	}
	
}