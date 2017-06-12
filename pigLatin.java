import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.lang.*;

public class pigLatin{
  public static void main(String[] args){
    System.out.println(pigLatin(args[0]));
  }
  public static String pigLatin(String textLine){
    StringBuilder pigLatinLine = new StringBuilder();
    Set<Character> vowels = new HashSet<Character>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    String[] words = textLine.split("[.?:' ]");
    for(String word : words){
      if(vowels.contains(Character.toLowerCase(word.charAt(0)))){
        // word[0] is vowel then put ay at the end
        pigLatinLine.append(word+"ay");
      }else{
        // word[0] is consonant then put word[)] + ay at the end
        pigLatinLine.append(word.substring(1)+Character.toString(word.charAt(0))+"ay");
      }
      // process every word an add space
      pigLatinLine.append(" ");
    }
    return new String(pigLatinLine);
  }
}
