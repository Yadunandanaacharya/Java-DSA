package Step4.twoPointer;

import java.util.Scanner;

public class subArraySumLessthanEqualK {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // long k = scanner.nextLong();
        // long[] b = new long[n];

        // for (int i = 0; i < n; i++) {
        //     b[i] = scanner.nextLong();
        // }
        int n = 5;
        long k = 4;
        long[] b = new long[]{2, 1, 1, 5, 8};


        long count = 0;
        long sum = 0;
        for (int i = 0, j = 0; j < n; j++) {
            sum += b[j];
            while (sum > k) {
                sum -= b[i];
                i++;
            }
            count += (j - i + 1);
        }

        System.out.println(count);
    }
}
