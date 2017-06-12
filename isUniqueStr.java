import java.util.*;
import java.util.stream.*;

public class isUniqueStr {
	public static void main(String[] args){
		// if str.length()> 128 then the string is not uniq since it is not possible to have
		// more than 128 uniq chars out of 128 available chars - very important point

		// isUnique - bruteForce
		if(args[0].length() > 128) {
			System.out.println("string isn't uniq!");
			return;
		}
		for(int i=0; i<args[0].length(); i++) {
			char pointer = args[0].charAt(i);
			for (int j=i+1; j<args[0].length(); j++) {
				if(pointer==args[0].charAt(j)){
					System.out.println("string isn't uniq!");
					return;
				}
			}
		}
		System.out.println("string is uniq!");

		// isPermutation - bruteForce
		char[] str1 = args[0].toCharArray();
		char[] str2 = args[1].toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);

		if(str1.length != str2.length) {
			System.out.println("no permutation!");
			return;
		}

		if(Arrays.equals(str1, str2)){
			System.out.println("yes permutation!");
			return;
		}
	}
}