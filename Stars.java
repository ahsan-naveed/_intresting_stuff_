import java.util.*;

public class Stars{
	public static void main(String[] args){
		printStars(3);
	}
	public static void printStars(int n){

		// initialize number of rows
		String[][] arr = new String[n][];

		// intialize number of columns per row
		for(int i = 0; i < n; i ++){
			arr[i] = new String[i+1];
		}

		// set each entery to * row-by-row
		for(int j = 0; j < arr.length; j++){
			for(int k = 0; k < arr[j].length ; k++){
				arr[j][k] = "*";	
			}
			System.out.println(Arrays.toString(arr[j])
				.replace("[", "")
				.replace("]","")
				.replace(",",""));
		}
		
	}
}