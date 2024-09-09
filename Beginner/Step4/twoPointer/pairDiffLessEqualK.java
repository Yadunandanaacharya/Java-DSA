package Step4.twoPointer;

/*
3 2
1 3 2 
 */
import java.util.Arrays;
import java.util.Scanner;

public class pairDiffLessEqualK {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // long k = scanner.nextLong();
        // long[] arr = new long[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = scanner.nextLong();
        // }

        int n = 3;
        long k = 2;
        long[] arr = new long[] { 1, 3, 2 };

        long count = 0;

        Arrays.sort(arr);

        for (int i = 0, j = 0; j < n; j++) {
            long diff = arr[j] - arr[i]; // [i............j]
            while (diff > k) {
                i++;
                diff = arr[j] - arr[i];
            }
            count += (j - i + 1);
        }

        System.out.println(count - n);
    }
}
