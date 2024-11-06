package algoUniv.binaryTree.bottomView;
import java.util.*;


public class bottomViewTree {
    static ArrayList<Integer> bottomView(NodeBottomView root) {
     
        if (root == null) return new ArrayList<>();


        // Map to store the last node at each
        // horizontal distance (HD)
        Map<Integer, Integer> horizonDistMap = new TreeMap<>();


        // Queue to store nodes and their
        // horizontal distance
        Queue<PairBottomView.Pair> que = new LinkedList<>();
       
        // Start level order traversal with
          // root at HD 0
        que.add(new PairBottomView.Pair(root, 0));
       
        while (!que.isEmpty()) {
         
            // Get current node and its HD
            NodeBottomView curr = que.peek().node;
            int horizonDist = que.peek().horizonDist;
            que.poll();

            // Update the map with the current
            // node's data
            horizonDistMap.put(horizonDist, curr.data);

            // Traverse the left subtree, HD - 1
            if (curr.left != null) {
                que.add(new PairBottomView.Pair(curr.left, horizonDist - 1));
            }

            // Traverse the right subtree, HD + 1
            if (curr.right != null) {
                que.add(new PairBottomView.Pair(curr.right, horizonDist + 1));
            }
        }


        // Extract bottom view nodes
          // from the map
        ArrayList<Integer> result = new ArrayList<>();
       
        // Iterate through the map in
        // sorted HD order
        for (int value : horizonDistMap.values()) {
            result.add(value);
        }
       
        return result;
    }


    public static void main(String[] args) {
     
        // Representation of the input tree:
        //       20
        //      /  \
        //     8   22
        //    / \    \
        //   5   3   25
        //      / \
        //     10 14
        NodeBottomView root = new NodeBottomView(20);
        root.left = new NodeBottomView(8);
        root.right = new NodeBottomView(22);
        root.left.left = new NodeBottomView(5);
        root.left.right = new NodeBottomView(3);
        root.left.right.left = new NodeBottomView(10);
        root.left.right.right = new NodeBottomView(14);
        root.right.right = new NodeBottomView(25);


        ArrayList<Integer> result = bottomView(root);


        for (int val : result) {
          System.out.print(val + " ");
      }
    }

}
