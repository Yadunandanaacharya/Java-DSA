package Step4.graph;
import java.util.*;

/*
9 8
5 8
5 9
8 2
8 1
9 3
9 7
2 4
2 6
5

copy till after 5 above or else breakpoint won't hit after sc.nextint
 */
public class shortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // taking input --> size of graph and number of edges in the graph

        List<Integer>[] adjList = new List[n + 5];
        // constructing a graph using adjacency list
        for (int i = 0; i < n + 5; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int topQue = sc.nextInt();
            // reading the number of edges in the graph
            adjList[u].add(topQue);
            adjList[topQue].add(u);
            // making undirected graph
        }

        Queue<Integer> que = new LinkedList<Integer>();
        // declaring a queue

        int source = sc.nextInt();
        que.add(source);
        // pushing the source node in the queue

        int[] visited = new int[n + 5];
        Arrays.fill(visited, 0);
        // declaring an empty visited array where in visited[i] = 0 means this node has not
        // yet been visited in our algorithm
        visited[source] = 1;
        // source node has been visited hence setting it = 1 and it is inserted in the
        // queue as well

        int[] lvl = new int[n + 5];
        Arrays.fill(lvl, 0);
        // declaring level array this basically lets us know level of each node
        lvl[source] = 0;
        // lvl of source node which we mean the source node is 0 as we start from here

        while (!que.isEmpty()) {
            // BFS Algo

            int topQue = que.poll();
            // top most element of queue

            for (int u : adjList[topQue]) {
                // this simply means you're iterating through all nodes connected to node topQue
                if (visited[u] == 0) {
                    // if the node u(node connected to topQue) has never been visited before then lets
                    // visit it
                    que.add(u);
                    visited[u] = 1;
                    // it has now been visited hence setting its values as 1
                    lvl[u] = lvl[topQue] + 1;
                    // lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to topQue
                }
            }
        }

        int i = 1;
        while (i <= n) {
            System.out.print(lvl[i] + " ");
            // lvl[i] gives the shortest distance of each node from source.
            i++;
        }
    }
}
