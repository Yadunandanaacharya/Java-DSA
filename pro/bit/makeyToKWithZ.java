package pro.bit;

import java.util.Scanner;

public class makeyToKWithZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long y = scanner.nextLong();
        long k = scanner.nextLong();

        long d = 0;
        long vv = 0;

        for (long i = 10; i >= 0; i--) {
            long start = 0;
            long g = y >> i;

            if ((g & 1) == 1) {
                start = 1;
            } else {
                start = 0;
            }

            long finalBit = 0;
            g = k >> i;

            if ((g & 1) == 1) {
                finalBit = 1;
            } else {
                finalBit = 0;
            }

            if (start == finalBit) {

            } else {
                if (start == 0) {
                    vv |= (1L << i);
                } else {
                    d = -1;
                }
            }
        }

        if (d == -1) {
            System.out.println(d);
        } else {
            System.out.println(vv);
        }
    }


    
}
