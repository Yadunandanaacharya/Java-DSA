package Step0;

import java.util.*;

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 

A
BB
CCC
to print this ascii of A is 65 so convert char(65) will give me A
for 65+1 =66 convert to char this will print B
 
 */

public class Lecture2 {
    public static void main(String[] args) throws Exception {
        for (int index1 = 1; index1 < 6; index1++) {
            for (int index2 = 0; index2 < index1; index2++) {
                System.out.print(index1 + " ");
            }

            System.out.println();
        }

        for (int index1 = 0; index1 < 6; index1++) {
            for (int index2 = 0; index2 < index1; index2++) {
                char ssd = (char)(64+index1);
                System.out.print((char)(64+index1) + " ");
            }

            System.out.println();
        }
    }
}
