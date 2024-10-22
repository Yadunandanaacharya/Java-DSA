package Step4.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countKPairsSum {
    static int countPairsWithSum(int[] b, int k) {
        int count = 0;
        Map<Integer, Integer> seen = new HashMap<>();
 
        for (int j = 0; j < b.length; ++j) {
            int complement = k - b[j];
            if (seen.containsKey(complement)) {
                count++;
            }
            seen.put(b[j], j);
        }
 
        return count;
    }
 
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        int k = 6;
        int count = countPairsWithSum(b, k);
 
        System.out.println("Count of pairs with sum " + k + " is: " + count);
    }
}
