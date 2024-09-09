package Step0;
import java.util.*;
import java.io.*;
/*
n=5
    1
   232
  34543
 4567654
567898765

question diamond pattern
n=5
  *
 ***
*****
 ***
  *

 */

public class Lecture5 {
    public static void main(String[] args) throws Exception {
        int n =5;
        for (int i = 0; i < n; i++) {
            //for printing spaces
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = i+1; j <= 2*i+1; j++) {
                System.out.print(j);
            }

            for (int k=2*i; k>=i+1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        
        System.out.println();
        //question2 diamond patten
        Scanner scn = new Scanner(System.in);
        // int nIs = scn.nextInt();
        int nIs =5;
        int x= (nIs/2) +1;

        for (int i = 0; i < x; i++) {
            //for printing spaces
            for (int j = 1; j <= x-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= nIs-x; i++) {
            //for printing spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=nIs-(2*i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
