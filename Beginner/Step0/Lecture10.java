package Step0;

/*
Sample Input 1 :
3
Sample Output 1 :
135
351
513

looks like rotate 3 times for n rotate n times
 */

public class Lecture10 {
    public static void main(String[] args) throws Exception {
        int n=3;
        // Initialize 'n' with the desired value

        for (int i = 0; i < n; i++) {
            for (int j = 2 * i + 1; j < 2 * n; j += 2) {
                System.out.print(j + " ");
            }
            int a = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
        
    }
}
