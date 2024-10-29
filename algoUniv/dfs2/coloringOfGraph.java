package algoUniv.dfs2;
import java.util.*;

public class coloringOfGraph {
    static List<List<Integer>> adj;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges
        adj = new ArrayList<>();

        // Initialize adjacency list and visited array
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new int[n + 1];

        // Input edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        sc.close();

        // Check for cycle in the graph
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                if (dfs(i, -1)) {
                    System.out.println("CYCLE");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    // DFS function to detect cycle in a directed graph
    static boolean dfs(int node, int parent) {
        visited[node] = 1; // Mark node as visiting

        for (int child : adj.get(node)) {
            if (visited[child] == 0) { // If child is not visited
                if (dfs(child, node)) {
                    return true; // Cycle detected
                }
            } else if (visited[child] == 1 && child != parent) {
                return true; // Cycle detected as child is part of the current path
            }
        }

        visited[node] = 2; // Mark node as fully visited
        return false; // No cycle found
    }
}


