package Contest.LeetCode.num335;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class splitArrayMakeCoPrimeProducts {
    public static  List<Integer> distinctprimeFactors(int num) {
        List<Integer> distinctprimes = new ArrayList<Integer>();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                while (num % i == 0)
                    num /= i;
                distinctprimes.add(i);
            }
        }
        if (num > 1)
            distinctprimes.add(num);

        return distinctprimes;
    }

    public static  int findValidSplit(int[] nums) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();

        for (int i : distinctprimeFactors(nums[0]))
            s1.add(i);

        int n = nums.length, ans = 0;

        for (int i = 1; i < n; i++) {
            boolean ch = false;

            for (int j : distinctprimeFactors(nums[i])) {
                if (s1.contains(j)) {
                    ch = true;
                    ans = i;
                } else {
                    s2.add(j);
                }
            }

            if (ch) {
                for (int j : s2) {
                    s1.add(j);
                }
                s2.clear();
            }
        }

        if (ans == n - 1)
            return -1;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,8,15,3,5};
        System.out.println(findValidSplit(arr));
    }
}
