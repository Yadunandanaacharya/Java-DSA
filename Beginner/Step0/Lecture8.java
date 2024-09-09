package Step0;
/*
Sample Input 1 :
3
Sample Output 1 
1=1
1+2=3
1+2+3=6

total 3 char
total 5 char
total 7 char

 */
public class Lecture8 {
    public static void main(String[] args) throws Exception {
        int n =3;
        String ans="";
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum=0;

            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
                sum= sum+j;

                if(j<i+1){
                    System.out.print( "+");
                }
            }
            
            System.out.print( "="+sum);
            System.out.println();
        }
        
    }
}
