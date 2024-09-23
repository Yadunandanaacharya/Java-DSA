package Contest.LeetCode.con12032023;
import java.util.*;

public class minTimeAllTasks {
    public static int findMinimumTime(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> Integer.compare(a[1], b[1]));
        boolean[] used = new boolean[2001];
        int ans = 0;
        for (int[] t : tasks) {
            for (int i = t[0]; i <= t[1]; i++) {
                if (used[i]) {
                    t[2]--;
                }
            }
            for (int i = t[1]; t[2] > 0; i--) {
                if (!used[i]) {
                    used[i] = true;
                    t[2]--;
                    ans++;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[][] tasks = new int[][]{{1,3,2},{2,5,3},{5,6,2}};
        System.out.println(findMinimumTime(tasks));
    }
}
