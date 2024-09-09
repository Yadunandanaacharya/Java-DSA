package Step0;

import java.util.*;

/*
Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */

public class Lecture6 {
    public static void main(String[] args) throws Exception {
        // int n = 4;
        // for (int i = 0; i < 4 * 2 - 1; i++) {
        //     for (int j = 0; j < 4 * 2 - 1; j++) {

        //         if (i == 0 || j == 0 || i == 4 * 2 - 2 || j == 4 * 2 - 2) {
        //             System.out.print(4 + " ");
        //         } else {
        //             // System.out.println(" ");
        //         }
        //     }

        //     System.out.println();
        // }

        printSquare(4);
    }


    //designa solution
    public static void printSquare(int n) {
        int total = (n * 2) - 1;
        for (int i = 0; i < (total / 2) + 1; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(n - j + " ");
            }

            for (int j = i; j < total - i; j++) {
                System.out.print(n - i + " ");
            }

            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

        int x = total / 2;
        for (int i = 0; i < x; i++) {
            for (int j = n; j >= 3 + i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 3 + (2 * i); j++) {
                System.out.print(i + 2 + " ");
            }
            for (int j = x - 2 - i; j >= 0; j--) {
                System.out.print(n - j + " ");
            }
            System.out.println();
        }
    }
}

/*
 * code from desiqna for gfg pattern code
 * https://www.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source
 * =youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22
 * 
 * 
 * 
 */