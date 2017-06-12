import java.util.*;
import java.util.stream.*;

public class Stringify{
	public static void main(String[] args){
		//split the string on spaces
		String[] words = args[0].split(" ");
		StringBuilder strfy = new StringBuilder();

		//while building a new string
		//add %20 after adding every entry from array
		for(String word: words){
			if(word != words[words.length-1]){
				strfy.append(word+"%20");
			}else{
				strfy.append(word);
			}
		}
		char[] chars = args[0].toCharArray();
		Arrays.sort(chars);
		int[] chrCount = new int[chars.length];
		for(char c : chars){
			if(c==str.indexOf(index))
				
		}



	}

	public static boolean isPlaindrome (String str){
		int start = 0, end = str.length()-1;
		while(start <= str.length()/2){
			if(str.charAt(end)!=str.charAt(start))
				return false;
			start ++;
			end --;
		}
		return true;
	}
}