package pro.hashing;

import java.util.HashMap;

public class shortLenSubArraySumKCount {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        // int[] arr = { -8, -8, -3, 8 };
        int[] arr = {10,5,2,7,1,9,8,7};
        // int k = 5;
        int k = 15;
        int sum = 0;
        // for shortest length of subarray whose sum is k
        HashMap<Integer, Integer> hm = new HashMap<>();
        int shortlength = Integer.MAX_VALUE;
        int shortlengthCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k)
                shortlength = Math.min(shortlength, i + 1);
            if (hm.containsKey(sum - k))
                shortlength = Math.min(shortlength, i - hm.get(sum - k));
            hm.put(sum, i);
        }

        if (shortlength != Integer.MAX_VALUE)
            System.out.print(countMinLengthSubarrays(arr, shortlength, k));
    }

    // Sliding Window for subarrays of shortest length whose sum == k
    public static int countMinLengthSubarrays(int[] arr, int minLength, int k) {
        int count = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            if (end - start + 1 < minLength) {
                continue;
            }

            if (end - start + 1 == minLength) {
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



