import java.util.*;
import java.util.stream.*;

public class MinIndex{
	public static void main(String[] args){
		int[] arr = {1,2,-1,4,56,0};
		System.out.println(minIndex(arr));
		System.out.println(secondMinIndex(arr));
		System.out.println(thirdMinIndex(arr));
	}

	// minIdx
	public static int minIndex(int[] arr){
		int minIdx = -1;
		int minValue = Integer.MAX_VALUE;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<minValue){
				minValue = arr[i];
				minIdx = i;
			}
		}
		return minIdx;
	}

	// secondMinIdx
	public static int secondMinIndex(int[] arr){
		int secondIdx = -1;
		int minIdx= minIndex(arr);
		for(int i=0; i<arr.length; i++) {
			if (i == minIdx)
				continue;
			if (secondIdx == -1 ||
				arr[i] < arr[secondIdx])
				secondIdx = i;

		}

		return secondIdx;

	}

}