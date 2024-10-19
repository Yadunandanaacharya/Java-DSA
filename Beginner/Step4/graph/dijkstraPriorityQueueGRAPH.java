package Step4.graph;
import java.util.*;

public class dijkstraPriorityQueueGRAPH {
    private int V; // Number of vertices
    private List<List<VertexDistancePair>> adj; // Adjacency list representation of the graph

    // Constructor for the graph
    dijkstraPriorityQueueGRAPH(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Adds an undirected edge between vertices u and v with weight w
    void addEdge(int u, int v, int w) {
        adj.get(u).add(new VertexDistancePair(v, w)); // u -> v with weight w
        adj.get(v).add(new VertexDistancePair(u, w)); // v -> u with weight w (since it's undirected)
    }

    // Dijkstra's algorithm to find the shortest path from the source vertex
    void shortestPath(int src) {
        // PriorityQueue to process the vertices with the smallest distance first
        PriorityQueue<VertexDistancePair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.distance));

        // Distance array to store the shortest distance from source to each vertex
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances to infinity

        // Start from the source vertex
        pq.add(new VertexDistancePair(src, 0)); // Source has distance 0
        dist[src] = 0;

        // Process the graph
        while (!pq.isEmpty()) {
            // Extract the vertex with the smallest distance
            VertexDistancePair current = pq.poll();
            int u = current.vertex;

            // Traverse all adjacent vertices of u
            for (VertexDistancePair neighbor : adj.get(u)) {
                int v = neighbor.vertex; // Adjacent vertex
                int weight = neighbor.distance; // Edge weight

                // If a shorter path to v is found, update the distance and push it into the priority queue
                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                    pq.add(new VertexDistancePair(v, dist[v]));
                }
            }
        }

        // Print the results: distances from source to all vertices
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    // Inner class to represent a pair of (vertex, distance)
    static class VertexDistancePair {
        int vertex, distance;

        VertexDistancePair(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 9; // Number of vertices
        dijkstraPriorityQueueGRAPH g = new dijkstraPriorityQueueGRAPH(V);

        // Adding edges between the vertices
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 8, 2);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);

        // Perform Dijkstra's algorithm starting from vertex 0
        g.shortestPath(0);
    }
}




