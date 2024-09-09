package Step4.twoPointer;

/*
3 3 
1 2 3

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countSubArrayDistintctLessThanEqualK {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int k = scanner.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scanner.nextInt();
        // }

        int n = 3;
        int k = 3;
        int[] arr = new int[]{1, 2 ,3};

        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            int mapSize = map.size();
            while (mapSize > k) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
                mapSize = map.size();
            }
            count += (j - i + 1);
        }
        System.out.println(count);
    }
}
