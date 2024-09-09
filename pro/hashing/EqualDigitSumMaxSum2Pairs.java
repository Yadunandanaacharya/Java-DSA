package pro.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class EqualDigitSumMaxSum2Pairs {
    public static long digitSumFinder(long v) {
        long sum = 0;
        while (v != 0) {
            sum = sum + v % 10;
            v = v / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        long[] b = {51 ,71, 17, 42};

        int i = 1;
        HashMap<Long, Long> digitSumValMap = new HashMap<>();
        i = 0;
        long answer = -1;

        while (i < n) {
            if (digitSumValMap.containsKey(digitSumFinder(b[i]))) {
                long pairSum = b[i] + digitSumValMap.get(digitSumFinder(b[i]));
                answer = Math.max(answer, pairSum);
                long oldValFromMap = digitSumValMap.get(digitSumFinder(b[i]));
                digitSumValMap.put(digitSumFinder(b[i]), Math.max(digitSumValMap.get(digitSumFinder(b[i])), b[i]));
            } else {
                digitSumValMap.put(digitSumFinder(b[i]), b[i]);
            }
            i++;
        }

        System.out.println(answer);
    }
}


    