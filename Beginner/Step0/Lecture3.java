package Step0;
import java.util.*;

/*   
A
B C
C D E
D E F G 

in ascii value format
65
66 67
67 68 69
68 69 70 71


question2
n=5
E
D E
C D E
B C D E
A B C D E

69
68 69
67 68 69
66 67 68 69
65 66 67 68 69

 */

public class Lecture3 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 2*i; j++) {
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }

        System.out.println((char)(65+5-1));

        int val=65+5-1;
        for (int i = val; i >= 65; i--) {
            for (int j = i; j <= val; j++) {
                System.out.print((char)(j) + " ");
            }
            System.out.println();
        }
    }
}
