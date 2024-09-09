package Contest.LeetCode.num334;

public class leftRightSumDiff {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int l = 0, r = 0;

            for (int j = 0; j < i; j++) {
                l += nums[j];
            }

            for (int j = n - 1; j > i; j--) {
                r += nums[j];
            }

            ans[i] = Math.abs(l - r);
        }

        return ans;
    }

    
}
