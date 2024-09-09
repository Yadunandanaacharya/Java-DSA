package Step1HackerRank.Hashing;

import java.util.Scanner;
import java.util.*;
/*
 print how many times array items present in an
 array without using hashmap or hashin

input is below first you pass n=6 next line pass
6 integers of array, after that for query you pass n=2 means 
to check which number's count in array so 
6 is present 4 times in array, 1 is present 0 times in array
***below input start
6
6 6 6 6 2 2 
2
6
1
***below input end
***output
4
0
 */

public class hasingArrayOrderOfNStarQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int q = scanner.nextInt();
 
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
 
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == query) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
