package Contest.LeetCode.con26032023;
import java.util.*;;

public class collectTheCoins {
    public int collectTheCoinss(int[] coins, int[][] edges) {
        int n = coins.length;
        List<Set<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int u = i;
            while (adj.get(u).size() == 1 && coins[u] == 0) {
                int v = adj.get(u).iterator().next();
                adj.get(u).remove(v);
                adj.get(v).remove(u);
                u = v;
            }

            if (adj.get(u).size() == 1) {
                q.add(u);
            }
        }

        for (int i = 0; i < 2; i++) {
            List<Integer> temp = new ArrayList<>();

            while (!q.isEmpty()) {
                int u = q.remove();

                if (adj.get(u).size() == 1) {
                    int v = adj.get(u).iterator().next();
                    adj.get(u).remove(v);
                    adj.get(v).remove(u);

                    if (adj.get(v).size() == 1) {
                        temp.add(v);
                    }
                }
            }

            q.addAll(temp);
        }

        int ans = 0;

        for (Set<Integer> hs : adj) {
            ans += hs.size();
        }

        return ans;
    }
}
