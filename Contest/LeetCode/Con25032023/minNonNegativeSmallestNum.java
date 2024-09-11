package Contest.LeetCode.Con25032023;

public class minNonNegativeSmallestNum {
    public int findSmallestInteger(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] % value + value) % value;
        }
       
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
       
        int mex = 0;
        while (mex < n) {
            if (freq.containsKey(mex % value) && freq.get(mex % value) > 0) {
                freq.put(mex % value, freq.get(mex % value) - 1);
                mex++;
            } else {
                break;
            }
        }
       
        return mex;
    }
}
