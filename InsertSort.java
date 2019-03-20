/**
 * InsertSort O(n^2) even if Binary Search is used to find insertion location
 */
public class InsertSort {
    public static int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static String printUtil(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int element : arr) {
            str.append(String.valueOf(element));
            str.append(", ");
        }
        return new String(str.substring(0, str.length() - 2));
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("before sort: " + printUtil(arr));
        System.out.println("after sort: " + printUtil(sort(arr)));
    }
}