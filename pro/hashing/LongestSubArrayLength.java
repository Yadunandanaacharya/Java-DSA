package pro.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayLength {
    public static void main(String[] args) {
        int N = 6;
        int k = 15;
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        Map<Long, Long> u = new HashMap<>();
        System.out.println(lenOfLongSubarr(arr, N, k));
    }

    public static int lenOfLongSubarr(int[] A, int N, int K) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < N; i++) {
            prefixSum += A[i];

            if (prefixSum == K) {
                maxLen = i + 1;
            } else if (sumIndexMap.containsKey(prefixSum - K)) {
                maxLen = Math.max(
                        maxLen,
                        i - sumIndexMap.get(prefixSum - K));
            }

            if (!sumIndexMap.containsKey(prefixSum)) {
                sumIndexMap.put(prefixSum, i);
            }
        }

        

        return maxLen;
    }

    
        
}
