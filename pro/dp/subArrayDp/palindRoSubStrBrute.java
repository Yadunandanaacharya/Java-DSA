package pro.dp.subArrayDp;

public class palindRoSubStrBrute {
    public static void main(String[] args) {
        //we use 3loops
        String s = "aba";
        int n = s.length();
        int i,j,k;
        i=0;int countPalindrom =0;
        while(i<n){
            j=i;
            while(j<n){
                //substring starts at i and substring ends at j
                //[i...j]

                int count=0; //if count is 1 means substring is not palindrome
                //we keep updating count for every substring
                k=i; int p=0;
                while (k<=j) {
                    if(s.charAt(k)==s.charAt(j-p)){
                        countPalindrom++;
                    }
                    else{
                        count=1;
                    }
                    p++;
                    k++;
                }

                if(count == 0){
                    //yes palindrome
                }
                else{
                    //no
                }

                j++;
            }
            i++;
        }

        System.out.println(countPalindrom);
    }
    
    


}
