import java.util.*;
import java.util.stream.*;

// Implementation of reverse polish notation - algorithm adapted from leetcode.com
// Author: Ahsan Naveed
// Date: June 11, 2017

public class RPN{
	public static void main(String[] args){
		// test array
		String[] arr = {"4", "13", "5", "/", "+"};
		eval(arr);
	}	
	public static void eval(String[] arr){
		Stack<String> stack = new Stack<>();
		String operators = "+-/*";
		for(String str: arr){	
			// push str in stack if it is a number
			if(!operators.contains(str)) {
				stack.push(str);
			}
			else{
				int rightOperand, leftOperand;
				rightOperand = Integer.valueOf(stack.pop());
				leftOperand = Integer.valueOf(stack.pop());
				switch(str){

					case "+": 
						// voilating DRY principle
						stack.push(String.valueOf(leftOperand + rightOperand));
                    	break;

					case "-": 
						stack.push(String.valueOf(leftOperand - rightOperand));
                    	break;

					case "*": 
						stack.push(String.valueOf(leftOperand * rightOperand));
                    	break;

					case "/": 
						stack.push(String.valueOf(leftOperand / rightOperand));
                    	break;

                    // optional
                    /*default:
                    	break;*/

				}
			}
		}
		System.out.println(stack);


		/* Iterator<String> iter = stack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}*/

	}
	// not needed
	/*public static boolean isNumber(String str){
		try{
			Long.parseLong(str);
		}catch (Exception e) {
			return false;
		}
		return true;
	}*/
}
