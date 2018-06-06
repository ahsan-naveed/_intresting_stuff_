// credits: coding question from geeksforgeeks.org

import java.util.*;
import java.math.*;

public class GCD {
	public static void main(String[] args) {
		// testcase 1:
		System.out.println(gcd(8,12));
		System.out.println(builtinGcd(8,12));
	}
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		for (int i = 1; i<=n1 && i<=n2; i++) {
			if (n1%i==0 && n2%i==0) gcd = i;
		}
		return gcd;
	}

	// builtin:
	public static int builtinGcd (int n1, int n2) {
		BigInteger b1 = BigInteger.valueOf(n1);
		BigInteger b2 = BigInteger.valueOf(n2);
		BigInteger gcd = b1.gcd(b2);
		return gcd.intValue();
	}
}

// javac GCD.java
// java GCD
