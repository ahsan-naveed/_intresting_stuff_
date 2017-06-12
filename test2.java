import java.io.*;
import java.util.*;
import java.util.stream.*;

public class test2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      System.out.println(s);
      System.out.println(duplicateEntry(s));
    }
  }
  public static int duplicateEntry(String str){
      String[] parts = str.split(";");
      int size = Integer.parseInt(parts[0]);
      boolean[] flags = new boolean[256];
      String[] arr = parts[1].split(",");
      for(int i=0; i<arr.length; i++){
          if(flags[arr[i].charAt(0)]){
              return Integer.parseInt(arr[i]);
          }
          flags[arr[i].charAt(0)] = true;
      }
      return -1;
  }
}

