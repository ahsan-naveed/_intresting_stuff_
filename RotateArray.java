import java.util.*;
import java.util.stream.*;

public class RotateArray 	{
	public static void main(String[] args){
		System.out.println(Arrays.toString(rotateArr(7, 3)));
	}
	public static int[] rotateArr(int n, int k){
		// n - size of the array
		// k - rotate by k elements
		int[] arr = new int[n];
		int rotateBy = k;

		// intialize arr
		for(int i =0; i<n; i++){
			arr[i] = i + 1;
		}

		// rotate
		for(int j=0; j<k; j++){
			int temp = arr[j];
			arr[j] = arr[k+1+j];
			arr[k+1+j] = temp;	
		}
		return arr;
	}
}
