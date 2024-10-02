package Contest.LeetCode.con26032023;
import java.util.*;;
public class minOperationss {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,6,8};
        int[] queries = new int[]{1,5};
        System.out.println(minOperations(nums,queries));
    }

    public static List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ansList = new ArrayList<>();
        List<Long> numsList = new ArrayList<>();

        for (int i : nums) {
            numsList.add((long) i);
        }

        Collections.sort(numsList);
        long arrLen = numsList.size();
        List<Long> prefixSum = new ArrayList<>(numsList);

        for (int i = 1; i < arrLen; i++) {
            prefixSum.set(i, prefixSum.get(i) + prefixSum.get(i - 1));
        }

        for (int i : queries) {
            long idx = Collections.binarySearch(numsList, (long) i);
            if (idx < 0) {
                idx = -idx - 1;
            }

            long sum = 0;
            if (idx == 0) {
                sum = prefixSum.get((int)(arrLen - 1)) - arrLen * i;
            } else {
                sum = i * idx - prefixSum.get((int)(idx - 1)) + (prefixSum.get((int) (arrLen - 1)) - prefixSum.get((int)(idx - 1)) - (arrLen - idx) * i);
            }
            ansList.add(sum);
        }
        return ansList;
    }
}
