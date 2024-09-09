package pro.TwoPointers;

import java.util.Scanner;

public class pairSumFrom2SortedArrayLessX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 6;
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        //with below we created n+1 size array and start filling
        //array from index1
        // int i = 1;
        // while (i <= n) {
        //     a[i] = scanner.nextInt();
        //     i++;
        // }
        // i = 1;
        // while (i <= n) {
        //     b[i] = scanner.nextInt();
        //     i++;
        // }

        a = new int[] { 0, 1, 2, 3, 4, 5, 6 };
        b = new int[] { 0, 800, 1000, 1200, 1500, 1550, 1800 };
        
        int target = 1100;
        int first = 0;
        int second = 0;
        int v = 0;
        int start = 1;
        int end = n;
        start = 1;
        while (start <= n && end >= 1) {
            if (a[start] + b[end] <= target) {
                int sum = a[start] + b[end];
                if (sum > v) {
                    v = sum;
                    first = a[start];
                    second = b[end];
                }
                start = start + 1;
            } else {
                end = end - 1;
            }
        }
        System.out.println(v);
    }
}





