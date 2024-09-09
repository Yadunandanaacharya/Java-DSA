/*1.create  the given pattern 
000000
000000
000000
000000
2.create the given pattern 
0
00
000
0000

*/
package Step0;
import java.util.*;

public class Lecture1{
    public static void main(String[] args) throws Exception{
            for(int index1=0; index1<6;index1++){
                for(int index2=0; index2<6;index2++){
                    System.out.print("0");
                }

                System.out.println();
            }

            System.out.println();

            for(int index1=0; index1<5;index1++){
                for(int index2=0; index2<index1;index2++){
                    System.out.print("0");
                }

                System.out.println();
            }
    }
}