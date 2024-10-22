package Contest.LeetCode.num335;

import java.util.*;

public class kthLargestWrittenByMe {
   
    // public static long kthLargestLevelSum(TreeNode root, int k) {
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     List<Long> sums = new ArrayList<>();
    //     queue.offer(root);

    //     while (!queue.isEmpty()) {
    //         int size = queue.size();
    //         long sum = 0;

    //         for (int i = 0; i < size; i++) {
    //             TreeNode node = queue.poll();
    //             sum += node.val;

    //             if (node.left != null) {
    //                 queue.offer(node.left);
    //             }

    //             if (node.right != null) {
    //                 queue.offer(node.right);
    //             }

    //             sums.add(sum);
    //         }
    //     }

    //     Collections.sort(sums);
    //         Collections.reverse(sums);
    //         if (k > sums.size()) {
    //             return -1;
    //         }

    //         return sums.get(k - 1);
    // }

    // //from chatgpt for debug errors in kthlargenum
    // public static TreeNode buildTreeFromAdjList(int rootValue, List<Integer>[] adjList) {
    //     Map<Integer, TreeNode> nodes = new HashMap<>();
    //     TreeNode root = new TreeNode(rootValue);
    //     nodes.put(rootValue, root);
    //     Queue<Integer> queue = new LinkedList<>();
    //     queue.offer(rootValue);
    //     Set<Integer> visited = new HashSet<>();
    //     visited.add(rootValue);

    //     while (!queue.isEmpty()) {
    //         int current = queue.poll();
    //         TreeNode currentNode = nodes.get(current);

    //         // Add children from adjacency list
    //         int childCount = 0;
    //         for (int neighbor : adjList[current]) {
    //             if (!visited.contains(neighbor)) {
    //                 TreeNode childNode = new TreeNode(neighbor);
    //                 nodes.put(neighbor, childNode);
    //                 visited.add(neighbor);
    //                 queue.offer(neighbor);

    //                 // Attach to left or right
    //                 if (childCount == 0) {
    //                     currentNode.left = childNode;
    //                 } else if (childCount == 1) {
    //                     currentNode.right = childNode;
    //                 }
    //                 childCount++;
    //             }
    //         }
    //     }
    //     return root;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     // Read number of vertices and edges
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();

    //     // Initialize adjacency list
    //     List<Integer>[] adjList = new List[n + 5];
    //     for (int i = 0; i < n + 5; i++) {
    //         adjList[i] = new ArrayList<>();
    //     }

    //     // Read edges and construct the graph
    //     for (int i = 0; i < m; i++) {
    //         int u = sc.nextInt();
    //         int topQue = sc.nextInt();
    //         adjList[u].add(topQue);
    //         adjList[topQue].add(u);
    //     }

    //     // Read the root node
    //     int rootValue = sc.nextInt();

    //     // Build the binary tree from adjacency list
    //     TreeNode root = buildTreeFromAdjList(rootValue, adjList);

    //     // Call the kthLargestLevelSum method
    //     int k = 2; // Example value for k
    //     long result = kthLargestLevelSum(root, k);
    //     System.out.println("The " + k + "th largest level sum is: " + result);

    //     sc.close();
    // }

    // public class TreeNode {
    //     int val;
    //     TreeNode left;
    //     TreeNode right;
    
    //     TreeNode(int val) {
    //         this.val = val;
    //         this.left = null;
    //         this.right = null;
    //     }
    // }


}

