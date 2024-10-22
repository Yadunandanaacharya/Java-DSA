package Step4.graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
adjList which is list of arraylist will look
like below in breakpoint
0:[1,2]
1:[0,1]
2:[0,1]
 */

public class printIthNodeFromSrcNode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] adjList = new ArrayList[n + 5];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);
        }

        Queue<Integer> que = new LinkedList<>();
        int source = sc.nextInt();
        que.offer(source);

        int[] visited = new int[n +1];
        Arrays.fill(visited, 0);
        visited[source] = 1;

        int[] level = new int[n+1 ];
        Arrays.fill(level, 0);
        level[source] = 0;

        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adjList[v]) {
                if (visited[u] == 0) {
                    que.offer(u);
                    visited[u] = 1;
                    level[u] = level[v] + 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                System.out.println("You cannot visit the node " + i + " from the source node = " + source);
            } else {
                System.out.println("You can visit the node " + i + " from the source node = " + source);
            }
        }
    }
}
