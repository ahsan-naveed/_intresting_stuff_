import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrQueries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrs = new int[n][];
        for (int i = 0; i<n ; i++) {
            int d = sc.nextInt();
            int [] arr = new int[d];
            for (int j = 0; j < d; j++) {
                arr[j] = sc.nextInt();
            }
            arrs[i] = arr;
        }
        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int xth = sc.nextInt() - 1;
            int yth = sc.nextInt() - 1;
            if (xth < arrs.length && yth < arrs[xth].length) {
                System.out.println(arrs[xth][yth]);
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
