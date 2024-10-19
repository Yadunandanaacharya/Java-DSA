package pro.dp.subArrayDp;
import java.util.*;

public class burstBallons {
    public static int maxCoins(int[] b) {
        int n = b.length;
        List<Integer> g = new ArrayList<>();
        
        g.add(1); // Add the boundary balloons
        for (int num : b) {
            g.add(num);
        }
        g.add(1); // Add the boundary balloon at the end

        int[][] dp = new int[n + 2][n + 2]; // Create a dp array

        // Initialize dp for single balloon cases
        for (int i = 1; i <= n; i++) {
            dp[i][i] = g.get(i - 1) * g.get(i) * g.get(i + 1);
        }

        // Calculate dp for subarrays of increasing length
        for (int length = 2; length <= n; length++) {
            for (int i = 1; i <= n - length + 1; i++) {
                int j = i + length - 1; // Determine the end index of the subarray
                int maxCoins = Integer.MIN_VALUE; // Max coins for dp[i][j]

                // Check all possible last balloons to burst
                for (int k = i; k <= j; k++) {
                    int possibility = g.get(i - 1) * g.get(k) * g.get(j + 1);

                    // Add the coins from left and right subarrays if they exist
                    if (i <= k - 1) {
                        possibility += dp[i][k - 1];
                    }
                    if (k + 1 <= j) {
                        possibility += dp[k + 1][j];
                    }

                    maxCoins = Math.max(maxCoins, possibility); // Update maxCoins
                }

                dp[i][j] = maxCoins; // Store the result in dp
            }
        }

        return dp[1][n]; // Return the result for the full range
    }


    public static void main(String[] args) {
        
    }
}

