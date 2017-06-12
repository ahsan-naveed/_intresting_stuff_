import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.lang.*;

public class freqASCII{
  public static void main(String[] args){
    System.out.println(args[0].toLowerCase().replaceAll("\\s+",""));
    freqs(args[0].toLowerCase().replaceAll("\\s+",""));
  }

  public static void freqs(String str){
    Hashtable<Integer, Integer> freqChars = new Hashtable<Integer, Integer>();
    for (int i=0; i<str.length(); i++){
      if(freqChars.containsKey((int)str.charAt(i))){
        freqChars.put((int)str.charAt(i), freqChars.get((int)str.charAt(i)) + 1);
      }else{
        freqChars.put((int)str.charAt(i), 1);
      }
    }

    Set<Integer> keys = freqChars.keySet();
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> valueList = new ArrayList<Integer>();

    //Obtaining iterator over set entries
    Iterator<Integer> itr = keys.iterator();

    while(itr.hasNext()){
      list.add(itr.next());
    }

    Collections.sort(list);

    for(int val: list){
      valueList.add(freqChars.get(val));
    }
    Collections.sort(valueList);
    int countofones = 0;
    boolean otherThanTwo = false;
    for(int value: valueList){
      System.out.println(value);
      if(value == 1){
        countofones ++;
      }
      if(value > 2){
        otherThanTwo = true;
      }
    }
    System.out.println("otherThanTwo: "+otherThanTwo);
    System.out.println("countofones: "+countofones);
    if(otherThanTwo || countofones > 1){
      System.out.println("not a palindrome permutation");
    }else{
      System.out.println("is a palindrome permutation");
    }
  }
}
