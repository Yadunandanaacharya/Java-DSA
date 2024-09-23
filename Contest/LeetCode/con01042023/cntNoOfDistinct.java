package Contest.LeetCode.con01042023;
import java.util.*;;

public class cntNoOfDistinct {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(reverse(nums[i]))) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                map.put(reverse(nums[i]), map.getOrDefault(nums[i], 0) + 1);
            }
        }

        return map.size();
    }

    public int reverse(int num) {
        String str = Integer.toString(num);
        int len = str.length() - 1;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse + ((num % 10) * (int) Math.pow(10, len));
            num = num / 10;
            len--;
        }

        return reverse;
    }
}


