package Contest.LeetCode.con02042023;
import java.util.*;


public class justFindCycle {
    static int n = 4;
    static int[] vis = new int[n];
    public static boolean bfs(int i, List<List<Integer>> graph, int[] vis){
        int[] dis = new int[vis.length];
        Arrays.fill(dis, 1_000_000_000);
        dis[i] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        while (!q.isEmpty()) {
            int parent = q.poll(); 
            for (int child : graph.get(parent)) {
                if (dis[child] == 1_000_000_000) {
                    dis[child] = 1 + dis[parent];
                    q.offer(child);
                } else if (dis[parent] <= dis[child]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);

        boolean ans = false;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0 && bfs(i, adj, vis) == true) {
                ans = true;
                break;
            }
        }
    }
}





