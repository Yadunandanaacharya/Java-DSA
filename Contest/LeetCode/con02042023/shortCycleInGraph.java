package Contest.LeetCode.con02042023;
import java.util.*;

public class shortCycleInGraph {
    public int bfs(int i, List<List<Integer>> graph, int[] vis){
        int[] dis = new int[vis.length];
        Arrays.fill(dis, 1_000_000_000);
        dis[i] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        while (!q.isEmpty()) {
            int node = q.poll(); 
            for (int j : graph.get(node)) {
                if (dis[j] == 1_000_000_000) {
                    dis[j] = 1 + dis[node];
                    q.offer(j);
                } else if (dis[node] <= dis[j]) {
                    return dis[node] + dis[j] + 1;
                }
            }
        }
        return 1_000_000_000;
    }
    
    public int findShortestCycle(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] vis = new int[n];
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int ans = 1_000_000_000;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                ans = Math.min(ans, bfs(i, graph, vis));
            }
        }
        return ans == 1_000_000_000 ? -1 : ans;
    }
}
