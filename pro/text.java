package pro;
import java.util.*;

public class text {
    public static void main(String[] args) {
        int num = 6; // Number of lines to print
        char letter = 'A';

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            letter++;
            System.out.println();
        }
    }
}