import java.util.*;

public class PairwiseProduct {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean isInputAvailable = true;
		String yesOrNo = "y";
		do {
			System.out.println("Enter a non-negative integer: ");
			int num = scanner.nextInt();
			System.out.println("Enter another number (y/n): ");
			yesOrNo = scanner.next();
			isInputAvailable = yesOrNo.toLowerCase().equals("y") ? true:false;
			nums.add(num);
		} while (isInputAvailable);
		
		// find highestVal in non-negative nums
		int highestVal =  Collections.max(nums);

		// find secondHighestVal
		nums.remove(highestVal);
		int secondHighestVal =  Collections.max(nums);

		System.out.println("Maximum pairwise product: " + Integer.valueOf(highestVal*secondHighestVal));
	}
}