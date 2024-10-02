package pro.BinarySearch;
import java.util.*;;

/*
9 8
2 4
1 2
2 3
1 5
5 6
5 7
1 8
8 9

 */

public class bigNumberInSubtree {
    public static int n, m;
    public static List<List<Integer>> graph;
    public static int[] visited;
    public static int[] subtreeSize;
    public static int dfs(int index) {
        // Marking the node as visited
        visited[index] = 1;
        subtreeSize[index] = index; // This is to denote the current node
    
        // Visiting children
        for (int child : graph.get(index)) {
            if (visited[child] == 0) {
                subtreeSize[index] = Math.max(subtreeSize[index], dfs(child));
            }
        }
    
        // Returning this value to the parent
        return subtreeSize[index];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n+5; i++) {
            graph.add(new ArrayList<>());
        }
    
        visited = new int[n + 1];
        int[] values = new int[n + 1]; // To store the values of each node
        int[] maxInSubtree = new int[n + 1];
    
        // Read the graph edges
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u); // Assuming it's an undirected graph
        }
    
        // Read the values for each node
        for (int i = 1; i <= n; i++) {
            values[i] = scanner.nextInt(); // Input the value for each node
        }
    
        // Start DFS from a node (for example, node 1)
        dfs(1);
    
        // Output the maximum values in the subtree for each node
        for (int i = 1; i <= n; i++) {
            System.out.println("Max value in the subtree for node " + i + ": " + maxInSubtree[i]);
        }
    
        scanner.close();
    }
}








