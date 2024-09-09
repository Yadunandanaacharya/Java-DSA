package Contest.LeetCode.num334;

import java.util.Arrays;

public class divisibleArrayOfString {
    public int[] divisibilityArray(String arr, int m) {
        int n = arr.length();
        int[] div = new int[n];
        long d = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(arr.charAt(i) - '0');
            d = d * 10 + (arr.charAt(i) - '0');
            div[i] = ((int) (d % m == 0 ? 1 : 0));
            d = d % m;
            System.out.println("d % m is " + d % m);
        }

        return div;
    }

    public static void main(String[] args) {
        String str = "998244353";
        int m = 3;
        divisibleArrayOfString dd = new divisibleArrayOfString();
        System.out.println(Arrays.toString(dd.divisibilityArray(str,m)));
    }
}
