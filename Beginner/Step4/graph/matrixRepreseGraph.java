
package Step4.graph;
import java.util.ArrayList;
import java.util.Scanner;

public class matrixRepreseGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
 
        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
 
        for (int i = 1; i <= m; i++) {
            // Taking input for an undirected graph.
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            g[x].add(y);
            g[y].add(x);
        }
 
        for (int i = 0; i < n; i++) {
            int c = g[i].size();
            System.out.println(i + " " + c);
        }
    }
}
