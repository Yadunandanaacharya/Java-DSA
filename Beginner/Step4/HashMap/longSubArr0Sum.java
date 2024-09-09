
import java.util.*;
/*
Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
8
15 -2 2 -8 1 7 10 23
 */

public class longSubArr0Sum {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println(maxLen(nums, nums.length));
    }

    public static int maxLen(int[] A, int n) {
        int sum = 0;
        int longest_length = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1);

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (mpp.containsKey(sum)) {
                longest_length = Math.max(longest_length, i - mpp.get(sum));
            } else {
                mpp.put(sum, i);
            }
        }

        return longest_length;
    }

}
