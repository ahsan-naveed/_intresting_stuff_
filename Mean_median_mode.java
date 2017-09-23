import java.io.*;
import java.util.*;

public class Mean_median_mode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.nextLine());
        String[] X = scan.nextLine().split(" ");
        System.out.println(Double.toString(mean(N, X)));
        System.out.println(median(N, X));
        System.out.println(Integer.toString(mode(N, X)));
    }
    
    public static double mean(Integer N, String[] X) {
        int total = 0;
        for(int i=0; i<N; i++) {
            total += Integer.parseInt(X[i]);
        }
        return (double) total/N;
    }
    
    public static double median(Integer N, String[] X) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            integerList.add(Integer.parseInt(X[i]));
        }
        Collections.sort(integerList);
        int size = integerList.size();
        int index = size / 2;
        if (size %2 == 0) {
            return  (( (double) integerList.get(index-1) + (double) integerList.get(index))/2);
        } else {
            return (double) integerList.get(index);
        }
    }
   
    public static int mode (Integer N, String[] X) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String key;
        for(String str: X){
			if(hashtable.containsKey(str)) {
				hashtable.put(str, hashtable.get(str) + 1);
			}else{
				hashtable.put(str, 1);
			}
		}
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            integerList.add(Integer.parseInt(X[i]));
        }
        Optional<Integer> minVal = integerList.stream().reduce(Integer::min);
        Optional<Integer> maxVal = hashtable.values().stream().reduce(Integer::max);
        HashSet<Integer> set = new HashSet<>(hashtable.values());
        Set<String> keys = hashtable.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) { 
            key = itr.next();
            if(hashtable.get(key) == maxVal.get()){
                arrayList.add(Integer.parseInt(key));
            }
        }
        if (set.size() == 1) {
            return minVal.get();
        }
        return arrayList.stream().reduce(Integer::min).get();
    }
}
