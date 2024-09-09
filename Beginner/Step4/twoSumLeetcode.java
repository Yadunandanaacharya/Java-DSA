package Step4;

import java.util.*;
import java.io.*;

/*
4
2 2 1 3
4
 */

public class twoSumLeetcode {
    static Map<Integer, Integer> hmap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int[] out = new int[n];

        out = twoSum(arr,target);
        System.out.println(out[0] + " " + out[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        Map<Integer,Integer> hmap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(target - nums[i])) {
                out[0] = hmap.get(target - nums[i]);
                out[1] = i;
                return out;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hmap.put(nums[i], i);
            }
        }

        return out;
    }

}
