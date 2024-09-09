
import java.util.HashMap;
import java.util.Map;

public class largeSmallSubarraySumK {
    public static int[] largestSubarraySumK(int[] nums, int k) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, 0);
        int currentSum = 0;
        int maxLen = 0;
        int[] result = { -1, -1 };

        for (int j = 0; j < nums.length; ++j) {
            currentSum += nums[j];

            if (sumIndexMap.containsKey(currentSum - k)) {
                int length = j + 1 - sumIndexMap.get(currentSum - k);
                if (length > maxLen) {
                    maxLen = length;
                    result[0] = sumIndexMap.get(currentSum - k) + 1; // 1-based index
                    result[1] = j + 1;
                }
            }

            if (!sumIndexMap.containsKey(currentSum)) {
                sumIndexMap.put(currentSum, j + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, -1, 6 };
        int k = 9;
        int[] result = largestSubarraySumK(nums, k);
        if (result[0] != -1) {
            System.out.println("Largest subarray with sum " + k + " is from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray with sum " + k);
        }
    }
}
