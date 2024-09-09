package pro.TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class pairSumLessThanEqualK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = 8;
        long k = 5;
        long[] arr = new long[]{3, 2, 0, 1, 4, 5, 7, 6};
        long count = 0;

        // Sort the array
        Arrays.sort(arr);

        // Two-pointer approach
        for (int i = 0, j = (int) n - 1; i < n; i++) {
            long sum = arr[j] + arr[i];
            while (sum > k && i != j) {
                j--;
                sum = arr[j] + arr[i];
            }
            if (i == j) {
                break;
            }
            System.out.println(i + " " + j);
            count += (j - i);
        }
        System.out.println(count);
    }
}




    // Two-pointer approach
    