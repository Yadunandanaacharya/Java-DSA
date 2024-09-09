package Step0;

/*
n=4
   1 
  12
 123
1234
space needed to print

question2
4444
333
22
1

 */

public class Lecture4 {
    public static void main(String[] args) throws Exception {
        int n =4;
        for (int i = 1; i <= n; i++) {
            //for printing spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        //question2
        int nIs =6;
        int spaceCount = 0;
        for (int i = nIs; i >= 1; i--) {
            //for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            //for printing spaces
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }

            spaceCount++;
            System.out.println();
        }
    }
}
    