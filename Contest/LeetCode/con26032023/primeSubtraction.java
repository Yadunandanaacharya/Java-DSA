package Contest.LeetCode.contest26032023;
import java.util.*;

public class primeSubtraction {
    public static void main(String[] args) {
        // primeTillN(15);
    }

    public List<Integer> sieve(int n) {
        List<Integer> pr = new ArrayList<>();
        boolean[] prime = new boolean[1010];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                pr.add(p);
            }
        }
        return pr;
    }
    
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        List<Integer> prime = sieve(1001);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                for (int j = 0; j < prime.size() && prime.get(j) < nums[i]; j++) {
                    if (nums[i] - prime.get(j) < nums[i + 1]) {
                        nums[i] -= prime.get(j);
                        break;
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public void primeTillN(int n) {
        ArrayList<Integer> distinctPrimes = new ArrayList<Integer>();
        for (int i = 2; i * i <= n; i++) {
              if (n % i == 0) {
                while (n % i == 0) {
                    n = n / i;
                }
                distinctPrimes.add(i);
            }
        }

        for (int i = 0; i < distinctPrimes.size(); i++) {
            System.out.println(distinctPrimes.get(i));
        }
    }

    
}



