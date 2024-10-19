package pro.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class maxSumSubArraySizeK {
    public static long maximumSumSubarrays(int K, ArrayList<Integer> Arr, int N) {
        int ws = 0;
        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int we = 0; we < N; we++) {
            sum += Arr.get(we);
            max = Math.max(max, sum);
            if (we - ws + 1 >= K) {
                if (we - ws + 1 == K)
                    max = Math.max(max, sum);
                sum -= Arr.get(ws);
                ws++;
            }
        }
        return max;
    }

    public static long maximumSumSubarray(int m, int[] Arr, int N) {
        int i = 0, j = 0;
        long currWindowSum = 0;
        long maximumSubarraySum = Long.MIN_VALUE;
    
        while (j < Arr.length) {
            currWindowSum += Arr[j];
    
            // When the window size is equal to the required subarray size
            if (j - i + 1 == m) {
                maximumSubarraySum = Math.max(maximumSubarraySum, currWindowSum);
                currWindowSum -= Arr[i];
                i++;
            }
    
            j++;
        }
    
        return maximumSubarraySum;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 4, 8, 13, 20 };
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(10, 4, 8, 13, 20));
        int m = 2;
        long totalSum = 0;
        long finalAns = 0;
        long maxSumWindowM = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
    
        // maxSumWindowM = maximumSumSubarray(m, arr, arr.length);
        maxSumWindowM = maximumSumSubarrays(m, arrList, arr.length);
        finalAns = totalSum - maxSumWindowM;
        System.out.println(finalAns);
    }
}

