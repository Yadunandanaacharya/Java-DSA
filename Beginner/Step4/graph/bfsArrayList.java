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


above we consider 1 as src node
 */

public class bfsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declaring Scanner object to take input
        int n = sc.nextInt(); // taking input of size of graph
        int m = sc.nextInt(); // taking input of number of edges in the graph
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(); // constructing graph using adjacency list

        // creating n number of vertices in graph
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // reading edges of graph
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int topOfQue = sc.nextInt();
            adjList.get(u).add(topOfQue);
            adjList.get(topOfQue).add(u);
            // making un-directed graph
        }

        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("List " + i + ": ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line after printing each sub-list
        }

        Queue<Integer> que = new LinkedList<>(); // declaring a queue

        que.add(1); // pushing the source node = 1 in the queue

        int[] visited = new int[n + 5]; // declaring an empty visited array where in visited[i] = 0 means this node has
                                        // not
                                        // yet been visited in our algorithm
        visited[1] = 1; // 1st node has been visited hence setting it as 1 and it is inserted in the
                        // queue as well

        int[] level = new int[n + 5]; // declaring level array which lets us know level of each node
        level[1] = 0; // level of 1st node, which is the source node, is 0 as we start from here

        while (!que.isEmpty()) {
            // BFS Algo
            int topOfQue = que.remove(); // top most element of queue

            System.out.println("topOfQue " + topOfQue + " and it's level is " + level[topOfQue]); // printing that node with its level

            for (int i = 0; i < adjList.get(topOfQue).size(); i++) {
                // iterating through all nodes connected to node topOfQue
                int u = adjList.get(topOfQue).get(i);
                if (visited[u] == 0) {
                    // if the node u (node connected to topOfQue) has never been visited before then
                    // let's
                    // visit it
                    que.add(u);
                    visited[u] = 1; // it has now been visited hence setting its value as 1
                    level[u] = level[topOfQue] + 1; // level[u] will be 1 greater than level[1] as we move 1 step
                                                    // forward from u to topOfQue
                }
            }
        }
    }

}

