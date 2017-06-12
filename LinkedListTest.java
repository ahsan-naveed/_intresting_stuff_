import java.util.*;
import java.util.stream.*;
import java.io.*;

public class LinkedListTest{
	public static void main(String[] args){

		Stack<Character> stack = new Stack<>();
		System.out.println("It is palindrome? " + args[0]);
		char[] charArr = args[0].toCharArray();
		for (int i=0; i<charArr.length; i++ ) {
			stack.push(charArr[i]);
		}
		int i=0;
		while (!stack.empty()) {
			if(charArr[i]!=stack.pop())
				return;
			i++;
		}
		System.out.println("It 'IS' palindrome!");

		// Lynda Challange

		ArrayList<String> groceryLst1 = new ArrayList<>(Arrays.asList("eggs", "milk"));
		ArrayList<String> groceryLst2 = new ArrayList<>(Arrays.asList("butter"));
		groceryLst1.addAll(groceryLst2);

		System.out.println(groceryLst1);

		if(groceryLst1.contains("eggs"))
			groceryLst1.remove("eggs");

		System.out.println(groceryLst1);


		// Lynda Challenge
		double lenght, width, height, size;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Length of the house?");	
		lenght = scanner.nextDouble();

		System.out.println("Width of the house?");	
		width = scanner.nextDouble();

		System.out.println("Height of the house?");	
		height = scanner.nextDouble();

		double houseVol= lenght*width*height;

		System.out.println("Volume of the house is : " + houseVol);

		int windows, doors;
		double windowSize, doorSize;

		double cost_of_paint_perUnit = 2.2;

		System.out.println("How many windows are there?");	
		windows = scanner.nextInt();

		System.out.println("Size of one window?");	
		windowSize = scanner.nextDouble();

		System.out.println("How many doors are there?");	
		doors = scanner.nextInt();

		System.out.println("Size of one door?");	
		doorSize = scanner.nextDouble();

		double non_paintable_area = doors*doorSize + windows*windowSize;
		double paintable_area = houseVol - non_paintable_area;
		double totalCost = cost_of_paint_perUnit * paintable_area;

		System.out.println("Total cost for painting the whole house is: " + totalCost);

	}

}