package Contest.LeetCode.con18032023;

import java.util.*;;

public class minScoreChange2Items {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        return Math.min(
            Math.min(nums[nums.length-1]-nums[2], nums[nums.length-3]-nums[0]),
            nums[nums.length-2]-nums[1]
        );
    }
}
