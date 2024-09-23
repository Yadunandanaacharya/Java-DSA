package Contest.LeetCode.con12032023;
import java.util.*;

public class countBeautifuSubArra {
    public static long beautifulSubarrays(int[] nums) {
        Map<Long, Long> map = new HashMap<>();
        long x = 0, ans = 0;
        map.put(0L, 1L);
            for (int i : nums) {
            x ^= i;
            ans += map.getOrDefault(x, 0L);
            map.put(x, map.getOrDefault(x, 0L) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,1,2,4};
        System.out.println(beautifulSubarrays(arr));
    }
}
