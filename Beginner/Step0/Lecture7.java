package Step0;

import java.util.Scanner;

/*
***
 ***
  ***

 */

public class Lecture7 {
    public static void main(String[] args) throws Exception {
        int n =5;
        for (int i = 0; i < n; i++) {
            //for printing spaces
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}


