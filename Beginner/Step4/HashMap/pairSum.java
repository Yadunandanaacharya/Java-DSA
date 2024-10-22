package Step4.HashMap;
import java.util.HashSet;

public class pairSum {
    public static int pairSumIs(int[] arr, int x) {
        HashSet<Integer> pairSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // We are using temp to take the difference which will help us in finding the
            // remaining number in the set
            int temp = x - arr[i];
            // Checking if pairSet contains the element temp
            if (pairSet.contains(temp)) {
                return 0;
            }
            // Every element will be inserted in the set if we didn't find the answer using
            // the current element
            pairSet.add(arr[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -1, 1, 3 };
        int x = -2;
        if (pairSumIs(arr, x) == -1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
