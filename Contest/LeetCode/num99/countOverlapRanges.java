package Contest.LeetCode.num99;

import java.util.*;


public class countOverlapRanges {
    public static void main(String[] args) {
        
    }

    long binpow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }

    public int countWays(int[][] ranges) {
        List<Pair<Integer, Integer>> m = new ArrayList<>();
        for (int[] r : ranges) {
            m.add(new Pair<>(r[0], 1));
            m.add(new Pair<>(r[1] + 1, -1));
        }

        Collections.sort(m, (p1, p2) -> {
            if (p1.first.compareTo(p2.first) != 0)
                return p1.first.compareTo(p2.first);
            else
                return p1.second.compareTo(p2.second);
        });

        int ans = 0, sum = 0;
        for (int i = 0; i < m.size(); i++) {
            sum += m.get(i).second;
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

