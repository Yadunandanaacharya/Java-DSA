import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
7 
8
1 2
1 3
1 5
1 4 
3 6 
4 7 
3 7 
6 7
 */

public class noOfShortestPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] adjList = new List[n + 5];
        for (int i = 0; i < n + 5; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int topQueue = sc.nextInt();
            adjList[u].add(topQueue);
            adjList[topQueue].add(u);
        }

        Queue<Integer> que = new LinkedList<Integer>();
        // int src = sc.nextInt();
        que.offer(1);
        int[] visited = new int[n + 5];
        int[] level = new int[n + 5];
        int[] ways = new int[n + 5];
        Arrays.fill(visited, 0);
        Arrays.fill(level, 0);

        visited[1] = 1;
        level[1] = 0; // level of 0th level or root is 0
        ways[1] = 1; // ways to reach root from root is 1
        while (!que.isEmpty()) {
            int topQue = que.poll();
            // System.out.println("paths " + topQue + " " + ways[topQue]); // printing that node with its number of ways to visit
            // System.out.println();
            for (int node : adjList[topQue]) {
                if (visited[node] == 0) {
                    que.offer(node);
                    visited[node] = 1; // it has now been visited hence setting its values as 1
                    level[node] = level[topQue] + 1; // level[node] will be 1 greater than level[1] as we move 1 step
                                                     // forward from node to topQue
                    ways[node] = ways[node] + ways[topQue];
                } else {
                    if (level[topQue] + 1 == level[node]) {
                        ways[node] = ways[node] + ways[topQue];
                    }
                }
            }
        }

        // Printing the number of ways to reach each node from node 1
        for (int i = 1; i <= n; i++) {
            System.out.println("Shortest paths to node " + i + ": " + ways[i]);
        }
    }
}
