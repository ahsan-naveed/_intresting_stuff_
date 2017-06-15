import java.util.*;
import java.util.stream.*;

public class TwoSum{
	public static void main(String[] args){
		int[] arr = {3,2,15, 3};
		System.out.println(twoSum(arr, 6));
	}
	public static ArrayList<Integer> twoSum(int[] arr, int target){

		Arrays.sort(arr);
		ArrayList<Integer> arrLst = new ArrayList<>(),
						   indicies = new ArrayList<>();
						   idxLst = new ArrayList<>();

		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i] < target){
				arrLst.add(arr[i]);
				idxLst.add(i);
			}
		}

		for(Integer val : arrLst){
			if(arrLst.contains(target-val)){
				indicies.add(val);
				indicies.add(target-val);
				break;
			}
		}

		for(int i =0; i<arr.length; i++){}
		return indicies;

	}
}