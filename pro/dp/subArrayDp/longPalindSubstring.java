package pro.dp.subArrayDp;

import java.util.Scanner;

public class longPalindSubstring {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[500][500];
        String s;
        s = sc.next();
        int n = s.length();
        int i;

        i = 0;
        int l_palindrome = 0;
        while (i < n) {
            dp[i][i] = 1;
            l_palindrome = 1;
            i++;
        }

        i = 0;
        while (i < n - 1) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            if (ch == ch1) {
                dp[i][i + 1] = 1;
                l_palindrome = 2;
            }

            i++;
        }

        int length = 3;
        while (length <= n) {

            i = 0;
            while (i < n - length + 1) {
                int j = i + length - 1;
                char ch3 = s.charAt(i);
                char ch4 = s.charAt(j);
                if (ch3 == ch4 && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    l_palindrome = length;
                }
                i++;
            }

            length++;
        }

        System.out.print(l_palindrome);
    }

     

}
