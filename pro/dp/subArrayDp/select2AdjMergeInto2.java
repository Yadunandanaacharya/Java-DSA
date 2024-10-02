package pro.dp.subArrayDp;

import java.util.Scanner;

public class select2AdjMergeInto2 {
    static int[] b = new int[200005];
    static int[] prefix = new int[200005];

    static int sum(int i, int j) {
        return prefix[j] - prefix[i - 1];
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // int n = scanner.nextInt(); // size of array
        // int n = 3;
        int n = 4;
        // b = new int[]{0,5,5,8};
        b = new int[]{0,5,8,2,10};
        // Input the array and calculate the prefix sum
        for (int i = 1; i <= n; i++) {
            // b[i] = scanner.nextInt(); // taking input of array
            prefix[i] = prefix[i - 1] + b[i];
        }

        // DP table to store results
        int[][] dp = new int[n + 5][n + 5];

        // Calculating answers for all subarrays of length 1
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 0;
        }

        // Calculating answers for all subarrays of length 2
        for (int i = 1; i <= n - 1; i++) {
            dp[i][i + 1] = b[i] + b[i + 1];
        }

        // Calculating for subarrays of length greater than 2
        for (int length = 3; length <= n; length++) {
            for (int i = 1; i <= n - length + 1; i++) {
                int j = i + length - 1;

                // Calculate dp[i][j]
                int ii = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    int possibility = dp[i][k] + dp[k + 1][j] + sum(i, j);
                    ii = Math.min(possibility, ii);
                }

                dp[i][j] = ii;
            }
        }

        // Output the result
        System.out.println(dp[1][n]);

        // scanner.close();
    }
}





    