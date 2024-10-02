package pro.dp.subArrayDp;
import java.util.*;

public class countSubStringTupleInPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();

        int[][] dp = new int[n][n];
        int[][] dpc = new int[n][n];

        // Length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
            dpc[i][i] = 1;
        }

        // Length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                dpc[i][i + 1] = 3;
            } else {
                dpc[i][i + 1] = 2;
            }
        }

        // Length 3
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                }
                dpc[i][j] = dpc[i + 1][j] + dpc[i][j - 1] - dpc[i + 1][j - 1] + dp[i][j];
            }
        }

        int[] pdpp = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i;
            int b = 0;
            while (j >= 0) {
                if (dp[j][i] == 1) {
                    b++;
                }
                j--;
            }
            if (i + 1 < n) {
                int rest = dpc[i + 1][n - 1];
                int val = b * rest;
                pdpp[i] = val;
            }
        }

        int[] pdpt = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i;
            int b = 0;
            while (j >= 0) {
                if (dp[j][i] == 1) {
                    b++;
                }
                j--;
            }
            if (i + 1 < n) {
                int rest = 0;
                for (int k = i + 1; k < n; k++) {
                    rest += pdpp[k];
                }
                int val = b * rest;
                pdpt[i] = val;
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += pdpt[i];
        }
        System.out.println(total);
    }
}
