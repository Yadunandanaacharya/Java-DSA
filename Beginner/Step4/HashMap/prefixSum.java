
public class prefixSum {
    public static int[] calculatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    
    public static int rangeSumQuery(int[] prefixSum, int start, int end) {
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] prefix = calculatePrefixSum(nums);

        int l = 3, r = 7; // Example range [l, r]
        System.out.println("Optimized Sum: " + rangeSumQuery(prefix, l, r));
    }
}
