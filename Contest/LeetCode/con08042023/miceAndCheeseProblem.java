package Contest.LeetCode.con08042023;

import java.util.Arrays;

public class miceAndCheeseProblem {
    public int miceAndCheese(int[] r1, int[] r2, int k) {
        int n = r1.length;
        int[][] dif = new int[n][2];
        for (int i = 0; i < n; i++) {
            dif[i][0] = r1[i] - r2[i];
            dif[i][1] = i;
        }
        Arrays.sort(dif, (a, b) -> b[0] - a[0]);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += r1[dif[i][1]];
            r2[dif[i][1]] = 0;
        }
        for (int i : r2) {
            ans += i;
        }
        return ans;
    }
}
