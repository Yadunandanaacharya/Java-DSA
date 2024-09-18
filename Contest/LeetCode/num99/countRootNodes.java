package Contest.LeetCode.num99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countRootNodes {
    public static int n = 0;
    public static Set<List<Integer>> setGuess;

    public static void main(String[] args) {
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 1, 3 }, { 4, 2 } };
        int[][] guesses = { { 1, 3 }, { 0, 1 }, { 1, 0 }, { 2, 4 } };
        int k = 3;
        n = edges.length + 1;

        List<Integer>[] tree = new List[n];
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n, 0));
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        setGuess = new HashSet<>();
        for (int[] guess : guesses) {
            setGuess.add(Arrays.asList(guess[0], guess[1]));
        }
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }
        dfs(0, -1, tree, dp);
        dfs0(0, -1, tree, dp, ans);
        int ret = 0;
        for (int i : ans) {
            if (i >= k) {
                ret++;
            }
        }

        System.out.println(ret);
    }

    public static void dfs(int node, int parent, List<Integer>[] tree, List<Integer> dp) {
        for (int i : tree[node]) {
            if (i != parent) {
                if (setGuess.contains(Arrays.asList(node, i)))

                    dfs(i, node, tree, dp);
                dp.set(node, dp.get(node) + dp.get(i));
            }
        }
    }

    public static void dfs0(int node, int parent, List<Integer>[] tree, List<Integer> dp, List<Integer> ans) {
        ans.set(node, dp.get(node));
        for (int i : tree[node]) {
            if (i != parent) {
                int ch1 = setGuess.contains(Arrays.asList(node, i)) ? 1 : 0;
                int ch2 = setGuess.contains(Arrays.asList(i, node)) ? 1 : 0;

                dp.set(node, dp.get(node) - dp.get(i) - ch1);
                dp.set(i, dp.get(i) + dp.get(node) + ch2);

                dfs0(i, node, tree, dp, ans);

                dp.set(i, dp.get(i) - dp.get(node) - ch2);
                dp.set(node, dp.get(node) + dp.get(i) + ch1);
            }
        }
    }

    // public static int rootCount(int[][] edges, int[][] guesses, int k) {
    // List<Integer>[] tree = new List[n];
    // List<Integer> dp = new ArrayList<>(Collections.nCopies(n, 0));
    // List<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

    // setGuess = new HashSet<>();
    // for (int[] guess : guesses) {
    // setGuess.add(Arrays.asList(guess[0], guess[1]));
    // }
    // for (int i = 0; i < n; i++) {
    // tree[i] = new ArrayList<>();
    // }
    // for (int[] edge : edges) {
    // tree[edge[0]].add(edge[1]);
    // tree[edge[1]].add(edge[0]);
    // }
    // dfs(0, -1, tree, dp);
    // dfs0(0, -1, tree, dp, ans);
    // int ret = 0;
    // for (int i : ans) {
    // if (i >= k) {
    // ret++;
    // }
    // }
    // return ret;
    // }
}
