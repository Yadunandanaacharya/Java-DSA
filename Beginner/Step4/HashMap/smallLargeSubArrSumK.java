package Step4.HashMap;
import java.util.Arrays;

public class smallLargeSubArrSumK {
    public static int countShortestSubarraysWithSumK(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE, count = 0;
 
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    int lensubarr = j - i + 1;
                    if (lensubarr < minLength) {
                        minLength = lensubarr;
                        count = 1;
                    } else if (lensubarr == minLength) {
                        count++;
                    }
                }
            }
        }
 
        return count;
    }

    public static int countLargestSubarraysWithSumK(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0, count = 0;
 
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    int lensubarr = j - i + 1;
                    if (lensubarr > maxLength) {
                        maxLength = lensubarr;
                        count = 1;
                    } else if (lensubarr == maxLength) {
                        count++;
                    }
                }
            }
        }
 
        return count;
    }

    // public static void main(String[] args) {
    //     int[] nums = {1, 2, 3, 4, 2, 5};
    //     int k = 5;
 
    //     System.out.println("Shortest subarrays with sum " + k + ": " + countShortestSubarraysWithSumK(nums, k));
    //     // System.out.println("Largest subarrays with sum " + k + ": " + countLargestSubarraysWithSumK(nums, k));
    // }
}


