

import java.util.*;

/*
8
5 6 2 3 1 4 9 8
 */
public class longConseSequence {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        Map<Integer, Boolean> presentMap = new HashMap<>();
        for (int num : nums) {
            presentMap.put(num, true);
        }
        int longestSequence = 0;
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!presentMap.get(nums[i]))
                continue;
            int num = nums[i];
            int flag = 0;
            while (presentMap.containsKey(num)) {
                if (checkMap.containsKey(num)) {
                    checkMap.put(nums[i], checkMap.get(num));
                    flag = -1;
                    break;
                }
                presentMap.put(num, false);
                num--;
            }
            if (flag == 0)
                checkMap.put(nums[i], num + 1);
            int sequenceLength = nums[i] + 1 - checkMap.get(nums[i]);
            longestSequence = Math.max(longestSequence, sequenceLength);
        }
        System.out.println(longestSequence);
    }

}
