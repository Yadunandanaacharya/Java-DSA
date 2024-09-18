package Contest.LeetCode.num99;

import java.util.*;


public class countOverlapRanges {
    public static void main(String[] args) {
        
    }

    long binpow(long base, long exponent, long mod) {
        base %= mod;
        long res = 1;
        while (exponent > 0) {
            if ((exponent & 1) != 0)
                res = res * base % mod;
            base = base * base % mod;
            exponent >>= 1;
        }
        return res;
    }

    public int countWays(int[][] ranges) {
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for (int[] r : ranges) {
            list.add(new Pair<>(r[0], 1));
            list.add(new Pair<>(r[1] + 1, -1));
        }

        Collections.sort(list, (p1, p2) -> {
            if (p1.first.compareTo(p2.first) != 0)
                return p1.first.compareTo(p2.first);
            else
                return p1.second.compareTo(p2.second);
        });

        int ans = 0, sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).second;
            if (sum == 0)
                ans++;
        }

        return (int) binpow(2, ans, (long) 1e9 + 7);
    }
}

class Pair<T, U> {
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}


