package Contest.LeetCode.con19032023;
import java.util.*;
import Contest.LeetCode.con19032023.PairClass1.Pair;

public class findScoreAfterMark {
    public long findScore(int[] nums) {
        List<Pair<Integer, Integer>> a = new ArrayList<>();
        int n = nums.length;

        // Populate the list with pairs of (value, index)
        for (int i = 0; i < n; i++) {
            a.add(new Pair<>(nums[i], i));
        }

        // Sort the list based on the values
        Collections.sort(a, Comparator.comparingInt(Pair::getKey));

        Map<Integer, Integer> vis = new HashMap<>();
        long sc = 0;

        // Calculate the score
        for (int i = 0; i < n; i++) {
            Pair<Integer, Integer> p = a.get(i);
            int idx = p.getValue();
            // Check if the current index is already visited
            if (vis.getOrDefault(idx, 0) == 0) {
                sc += (long) p.getKey(); // Add the score
                // Mark the adjacent indices as visited
                vis.put(idx - 1, vis.getOrDefault(idx - 1, 0) + 1);
                vis.put(idx + 1, vis.getOrDefault(idx + 1, 0) + 1);
            }
        }
        return sc; // Return the total score
    }

    public static void main(String[] args) {
        findScoreAfterMark sol = new findScoreAfterMark();
        int[] nums = {2,3,5,1,3,2}; // Example input
        System.out.println(sol.findScore(nums)); // Output the score
    }
}

