import java.util.*;

public class RevInt {
	public static void main(String[] args) {

		// Test cases:
		System.out.println(reverse(-123));
		System.out.println(reverse(1000000008));
		System.out.println(reverse(Integer.MAX_VALUE));
		System.out.println(reverse(Integer.MIN_VALUE));
	}
	public static int reverse(int x) {
		int maxDiv10 = Integer.MAX_VALUE/10;
		int ret = 0;
		while (x != 0) {
			// handles overflow/underflow
			if(Math.abs(ret) > maxDiv10) return 0;
			ret = ret * 10 + x % 10;
			x /= 10;
		}
		return ret;
	}
}
