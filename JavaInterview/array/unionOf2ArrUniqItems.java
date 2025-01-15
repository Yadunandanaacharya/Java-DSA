package array;

import java.util.HashMap;

public class unionOf2ArrUniqItems {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int[] b = new int[] { 1, 2, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < b.length; i++) {
            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }
        
        System.out.println();
        System.out.println(map.size());
    }
}


