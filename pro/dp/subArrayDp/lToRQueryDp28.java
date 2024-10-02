package pro.dp.subArrayDp;
import java.util.*;;

public class lToRQueryDp28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        int[][] dp = new int[5000][5000];
        int[][] dp1 = new int[5000][5000];
 
        // length 1 string
        int i = 0;
        while (i < n) {
            dp[i][i] = 1;
            dp1[i][i] = 1;
            i++;
        }
 
        // length 2 string
        i = 0;
        while (i < n - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
            }
 
            dp1[i][i + 1] = dp1[i][i] + dp1[i + 1][i + 1] + dp[i][i + 1];
 
            i++;
        }
 
        System.out.println(dp1[0][1]);
 
        long length = 3;
        while (length <= n) {
            i = 0;
            while (i < n - length + 1) {
                long j = i + length - 1;
 
                if (s.charAt(i) == s.charAt((int) j) && dp[i + 1][(int) (j - 1)] == 1) {
                    dp[i][((int) j)] = 1;
                }
 
                dp1[i][((int) j)] = dp1[i][((int) j) - 1] + dp1[i + 1][((int) j)] - dp1[i + 1][((int) j) - 1] + dp[i][((int) j)];
 
                i++;
            }
            length++;
        }
 
        int q = scanner.nextInt();
        for (int x = 0; x < q; x++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
 
            System.out.println(dp1[l][r]);
        }
    }
}
