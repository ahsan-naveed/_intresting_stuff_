import java.util.*;
import java.util.stream.*;

public class reverseInt{
    public static void main(String[] args){
        System.out.println(reverse(123));
        System.out.println(reverse(1));
        System.out.println(reverse(-2345));
    }
    public static int reverse(int x) {
        String numStr = Integer.toString(x);
        if(numStr.length()>Integer.toString(Integer.MAX_VALUE).length() || numStr.length()>Integer.toString(Integer.MIN_VALUE).length()) return 0;
        if(numStr.length()==1) return x;
        char[] num=Integer.toString(x).toCharArray();
        int start = x>0?0:1;
        int end = num.length-1;
        //reverse num
        while(start<end){
            char temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            end--;
            start++;
        }
        String strNum = new String(num);
        return Integer.parseInt(strNum);
    }
}
