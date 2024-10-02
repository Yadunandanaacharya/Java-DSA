package Contest.LeetCode.con18032023;
import java.util.*;

public class MinImpossibleOR {
    public int minImpossibleOR(int[] nums) {
        HashMap<Long, Integer> m = new HashMap<>();
        for (int i : nums) {
            if (!m.containsKey((long)i)) {
                m.put((long)i, 0);
            }
            m.put((long)i, m.get((long)i) + 1);
        }
        long i;
        for (i = 1; i <= 2e9; i *= 2) {
            if (!m.containsKey(i) || m.get(i) == 0) {
                return (int)i;
            }
        }
        return (int)i;
    }
}
