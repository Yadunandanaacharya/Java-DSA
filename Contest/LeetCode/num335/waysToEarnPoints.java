package Contest.LeetCode.num335;

import java.util.Arrays;

public class waysToEarnPoints {
    static long[][] dp;
    static long mod = 1000000007; // in question written to return ans mod (10^9+7)

    static long knapSack(int indx, int target, int[][] types) {
        if (target == 0) {
            return 1;
        }
        if (indx >= types.length) {
            return 0;
        }
        if (dp[target][indx] != -1) {
            return dp[target][indx];
        }
        long ans = 0;
        for (int count = 0; count <= types[indx][0]; count++) {
            if (target - types[indx][1] * count >= 0) {
                ans = (ans + knapSack(indx + 1, target - types[indx][1] * count, types)) % mod;
            }
        }
        dp[target][indx] = ans;
        return ans;
    }

    public static int waysToReachTarget(int target, int[][] types) {
        dp = new long[target + 1][types.length + 1];
        for (int i = 0; i <= target; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int) knapSack(0, target, types);
    }

    public static void main(String[] args) {
        int target = 3;
        int[][] types = new int[][] { { 2, 1 }, { 1, 2 } };
        System.out.println(waysToReachTarget(target, types));
    }

    

}
