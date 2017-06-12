import java.util.*;
import java.util.stream.*;

public class test{
	public static void main(String[] args){
		System.out.println(ParseInt("-234666"));	
	}
	public static int ParseInt(String number){
		if(Integer.toString(Integer.MAX_VALUE).length()<number.length() || number.length()==0) return -1;
		int result = 0;
		char[] num = number.toCharArray();
		int i = num[0]=='-' ? 1:0;
		int sign = i==1 ? -1:1;
		int tens = i==1 ? (int)Math.pow(10, num.length-2):(int)Math.pow(10, num.length-1);
		for(; i<num.length; i++){
			result += (num[i]-'0')*tens;
			tens /= 10;
		}
		return sign*result;
	}
}
