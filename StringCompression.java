import java.util.*;
import java.util.stream.*;

public class StringCompression{
	public static void main(String[] args){

		Hashtable<Character, Integer> hastable = new Hashtable<>();
		StringBuilder compressedString = new StringBuilder();

		// a set to get the compressed string sorted
		HashSet<Character> set = new HashSet<>();

		char[] chars = args[0].toCharArray();

		// store frequency of each char in a hastable
		for(char c: chars){
			set.add(c);
			if(hastable.containsKey(c)) {
				hastable.put(c, hastable.get(c) + 1);
			}else{
				hastable.put(c, 1);
			}
		}
		System.out.println(hastable);

		/* add each character from set and each frequency from hastable
		   to new compressed string */
		for(char c: set){
			compressedString.append(c);
			compressedString.append(hastable.get(c));	
		}

		System.out.println(compressedString);

		// test set
		HashSet<Character> testSet = new HashSet<>();
		testSet.add('d');
		testSet.add('c');
		testSet.add('b');
		testSet.add('a');
		System.out.println(testSet);

	}
}