package Contest.LeetCode.con26032023;
import java.util.*;


public class kItemsMaxSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i < numOnes;i++){
            list.add(1);
        }
        
        for(int i = 0; i < numZeros;i++){
            list.add(0);
        }
        
        for(int i = 0; i < numNegOnes;i++){
            list.add(-1);
        }
        
        for(int i = 0; i < k;i++){
            ans = ans + list.get(i);
        }
        
        return ans;
    }
}
