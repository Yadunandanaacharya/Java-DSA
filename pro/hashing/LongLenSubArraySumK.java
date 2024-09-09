package pro.hashing;

import java.util.HashMap;

public class LongLenSubArraySumK {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int[] arr = { -8, -8, -3, 8, 2, 3 };
        int k = 5;
        int sum = 0;
        // for longest length of subarray whose sum is k
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k)
                max = Math.max(max, i + 1);
            if (hm.containsKey(sum - k))
                max = Math.max(max, (i - hm.get(sum - k)));
            if (!hm.containsKey(sum))
                hm.put(sum, i);
        }
        if (max != Integer.MIN_VALUE)
            System.out.print(countMinLengthSubarrays(arr, max, k));
    }

    // Sliding Window for subarrays of shortest length whose sum == k
    public static int countMinLengthSubarrays(int[] arr, int maxLength, int k) {
        int count = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            if (end - start + 1 < maxLength) {
                continue;
            }

            if (end - start + 1 == maxLength) {
                if (currentSum == k) {
                    count++;
                }
                currentSum -= arr[start];
                start++;
            }
        }

        return count;
    }
}




