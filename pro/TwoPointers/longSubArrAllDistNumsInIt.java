package pro.TwoPointers;
import java.util.*;

public class longSubArrAllDistNumsInIt {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        int[] arr = new int[]{1, 3, 1, 5, 2, 4, 1, 7, 9, 3};
        int n = arr.length;

        // for(int i = 0; i<n;i++){
        //     arr[i] = scn.nextInt();
        // }

        int maxSubArrLen = 0;
        int i = 0, j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(i < n && j < n){
            if (!map.containsKey(arr[j])) {
                map.put(arr[j], j);
                int lenCurrent = j - i + 1;
                maxSubArrLen = Math.max(maxSubArrLen, lenCurrent);
                j++;
            } else {
                int indexOfRepeatItem = map.get(arr[j]);
                while (i <= indexOfRepeatItem) {
                    map.remove(arr[i]);
                    i++;
                }
                i = indexOfRepeatItem + 1;
                map.put(arr[j], j);
                j++;
            }
        }

        System.out.println(maxSubArrLen);
    }
}












