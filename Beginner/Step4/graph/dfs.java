package Step4.graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class dfs {
    public static void DFS(int node, List<Integer>[] G, List<Integer> used, List<Integer> parent) {
        System.out.println(node);
        used.set(node, 1);

        for (int u : G[node]) {
            if (used.get(u) == 0) {
                parent.set(u, node);
                DFS(u, G, used, parent);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer>[] G = new List[n + 5];
        for (int i = 0; i < n + 5; i++) {
            G[i] = new ArrayList<>();
        }

        int i = 1;
        while (i <= m) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            G[u].add(v);
            G[v].add(u);
            i++;
        }

        List<Integer> used = new ArrayList<>(n + 5);
        List<Integer> parent = new ArrayList<>(n + 5);
        for (int j = 0; j < n + 5; j++) {
            used.add(0);
            parent.add(0);
        }

        DFS(1, G, used, parent);
    }
}
