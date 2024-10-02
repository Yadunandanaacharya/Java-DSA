package Contest.LeetCode.con01042023;

import java.util.*;

public class larPosInt {
    public int findMaxK(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int ans = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] * -1)) {
                ans = Math.max(ans, nums[i]);
                System.out.println(ans);
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}
