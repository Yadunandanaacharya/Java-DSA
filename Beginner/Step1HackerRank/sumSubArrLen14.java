package Step1HackerRank;

import java.util.HashMap;

public class sumSubArrLen14 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{1, 2, 1, 3, 2};
        int targetSum = 3;
        int tarLen = 2;
        HashMap<Integer,int[]> map = new HashMap<>();

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum = sum+ arr[i];
            if(sum == targetSum){
                
            }
        }

    }

    public static int countSubarraysWithSum(int[] s, int n, int d, int m) {
        int count = 0;

        // Iterate over all possible subarrays of length m
        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }
            // Check if the sum of the current subarray equals d
            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}
