package Step4.HashMap;
import java.util.*;;

public class cumulativeSumQuery {
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
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] prefix = calculatePrefixSum(arr);

        int query = scn.nextInt();
        for (int i = 0; i < query; i++) {
            int l = scn.nextInt();
            int r = scn.nextInt();
            System.out.println(rangeSumQuery(prefix, l, r));
        }
    }
}
