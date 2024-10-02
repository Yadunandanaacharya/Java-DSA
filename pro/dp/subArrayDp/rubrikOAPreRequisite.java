package pro.dp.subArrayDp;

import java.util.Scanner;

public class rubrikOAPreRequisite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        int[][] dp = new int[500][500];

        // length 1 string
        int i = 0, g = 0;
        while (i < n) {
            dp[i][i] = 1;
            i++;
        }

        // length 2 string
        i = 0;
        while (i < n - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
            }
            i++;
        }

        // length 3, length 4, length 5, ..., length n
        long length = 3;
        while (length <= n) {
            i = 0;
            while (i < n - length + 1) {
                long j = i + length - 1;

                if (s.charAt(i) == s.charAt((int) j) && dp[i + 1][(int) (j - 1)] == 1) {
                    dp[i][(int) j] = 1;
                }
                i++;
            }
            length++;
        }

        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                if (dp[x][y] == 1) {
                    g = g + 1;
                }
            }
        }
        
        System.out.println(g);
    }

    
}




























