package Step1HackerRank.Hashing;

import java.util.Scanner;
/*
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
public class hashingOrderOfNAskedInInterviewForMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
 
        int[] array = new int[n];
        int[] hash = new int[51];
 
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            hash[array[i]]=hash[array[i]] + 1;
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            int count = hash[query];
            System.out.println(count);
        }
    }
}






