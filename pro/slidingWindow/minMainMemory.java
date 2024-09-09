package pro.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class minMainMemory {
    

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 4, 8, 13, 20 };
        int m = 2;
        long totalSum = 0;
        long finalAns = 0;
        long maxSumWindowM = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        maxSumWindowM = maximumSumSubarray(m, arr, arr.length);
        finalAns = totalSum - maxSumWindowM;
        System.out.println(finalAns);
    }

}
