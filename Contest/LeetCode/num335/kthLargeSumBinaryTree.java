package Contest.LeetCode.num335;

import java.util.*;

import javax.swing.tree.TreeNode;


/*
array list: [5,8,9,2,1,3,7,4,6]
inputs to pass
5 8
5 9
8 2
8 1
9 3
9 7
2 4
2 6
5

check above input graph in below link
https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/description/
 */

public class kthLargeSumBinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Long> sums = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            sums.add(sum);
        }
        Collections.sort(sums);
        Collections.reverse(sums);
        if (k > sums.size()) {
            return -1;
        }

        //since we use 0 based indexing 
        return sums.get(k - 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static void main(String[] args) {
        int n = 9;
        Scanner sc = new Scanner(System.in);
        List<Integer>[] adjList = new List[n + 5];
        // constructing a graph using adjacency list
        for (int i = 0; i < n + 5; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < 8; i++) {
            int u = sc.nextInt();
            int topQue = sc.nextInt();
            // reading the number of edges in the graph
            adjList[u].add(topQue);
            adjList[topQue].add(u);
            // making undirected graph
        }

        int source = sc.nextInt();
        System.out.println("hi");
    }
}

