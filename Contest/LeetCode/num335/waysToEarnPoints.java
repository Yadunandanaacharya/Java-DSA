package Contest.LeetCode.num335;

import java.util.Arrays;

public class waysToEarnPoints {
    static long[][] dp;
    static long mod = 1000000007; // in question written to return ans mod (10^9+7)

    static long knapSack(int i, int target, int[][] types) {
        if (target == 0) {
            return 1;
        }
        if (i >= types.length) {
            return 0;
        }
        if (dp[target][i] != -1) {
            return dp[target][i];
        }
        long ans = 0;
        for (int count = 0; count <= types[i][0]; count++) {
            if (target - types[i][1] * count >= 0) {
                ans = (ans + knapSack(i + 1, target - types[i][1] * count, types)) % mod;
            }
        }
        dp[target][i] = ans;
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
