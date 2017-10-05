// bruteforce

import java.util.*;
import java.util.stream.*;

public class strStr{
	public static void main(String[] args){
		System.out.println(strStr(args[0], args[1]));
	}
	public static int strStr(String haystack, String needle) {
        	if(haystack.length()==0 && needle.length()==0) return 0;
       		if(needle.length()==0 && haystack.length()>0) return -1;
        	if(needle.length()>0 && haystack.length()==0) return -1;
        	ArrayList<Character> nArr = new ArrayList<Character>();
        	ArrayList<Character> hArr = new ArrayList<Character>();
        	for(int i=0; i<needle.length();i++){nArr.add(needle.charAt(i));}
        	for(int j=0; j<haystack.length(); j++){hArr.add(haystack.charAt(j));}
        	return Collections.indexOfSubList(nArr, hArr);
    	}
}
