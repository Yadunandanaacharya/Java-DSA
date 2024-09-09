package pro.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class maxSumSubArraySizeK {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here

        int ws = 0;
        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int we = 0; we < N; we++) {
            sum += Arr.get(we);
            max = Math.max(max, sum);
            if (we - ws + 1 >= K) {
                if (we - ws + 1 == K)
                    max = Math.max(max, sum);
                sum -= Arr.get(ws);
                ws++;
            }
        }
        return max;
    }

    

}
