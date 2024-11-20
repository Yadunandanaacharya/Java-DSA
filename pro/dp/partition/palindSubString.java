package pro.dp.partition;

import java.util.*;

public class palindSubString {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        String s = "abc";
        int n = s.length();

        boolean[][] dp = new boolean[n][n];
        int[][] dp1 = new int[n][n];

        // length 1 string
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            dp1[i][i] = 1;
        }

        // length 2 string
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
            dp1[i][i + 1] = dp1[i][i] + dp1[i + 1][i + 1] + (dp[i][i + 1] ? 1 : 0);
        }

        // lengths 3 to n
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                }
                dp1[i][j] = dp1[i][j - 1] + dp1[i + 1][j] - dp1[i + 1][j - 1] + (dp[i][j] ? 1 : 0);
            }
        }

        System.out.println(dp1[0][n-1]);
        // int q = scanner.nextInt();
        // for (int i = 0; i < q; i++) {
        //     int l = scanner.nextInt();
        //     int r = scanner.nextInt();
        //     System.out.println(dp1[l][r]);
        // }

        // scanner.close();
    }

}
