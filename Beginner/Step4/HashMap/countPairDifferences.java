package Step4.HashMap;
/*
int[] b = {1, 5, 3, 4, 2};
int k = 2;
3-1=2, 4-2=2 only 2 pairs with difference=2
count=2 return
 */

import java.util.*;
public class countPairDifferences {
    public static int countPairsOptimized(int[] b, int k) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int j = 0; j < b.length; ++j) {
            int target = b[j] + k;
            if (freqMap.containsKey(target)) {
                count += freqMap.get(target);
            }
            freqMap.put(b[j], freqMap.getOrDefault(b[j], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // int[] b = {1, 6, 3, 8, 2,5, 10};
        int[] b = {1, 6, 1, 8, 3,10, 5};
        int k = 5;
        int count = countPairsOptimized(b, k);
 
        System.out.println("Count of pairs with sum " + k + " is: " + count);
    }
}
