package Contest.LeetCode.con02042023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class makeKSubArrSumsEqual {
    public long makeSubKSumEqual(int[] arr, int k) {
        long ans = 0;
        int n = arr.length;
        k = gcd(n, k);
        for (int i = 0; i < k; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = i; j < arr.length; j += k) {
                a.add(arr[j]);
            }
            Collections.sort(a);
            for (int x : a) {
                ans += Math.abs(a.get(a.size() / 2) - x);
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
