package pro.dp.partition;
import java.util.*;

public class num38LongSubStrWithout2ContinuousOccu {
    public static void main(String[] args) {
        String str ="aaab";
                   //0123
        String ans = "";
        // a, aa,aaa,aaab
        // a,aa,ab
        // a,ab
        for(int i = 0; i <str.length();i++){
            for(int j = i; j<str.length();j++){
                ans = ans + Character.toString(str.charAt(j));

                if(isValidSubString(ans)){
                    System.out.println(ans);
                }
            }
            ans="";
        }
    }

    public static boolean isValidSubString(String ans){
        int count = 1;
        Character prevChr = ans.charAt(0);
        boolean valid = true;
        for(int i = 1; i<ans.length();i++){
            if(ans.charAt(i) == prevChr){
                count++;
                if(count>2){
                    return false;
                }
                else{
                    valid = true;
                }
            }
            else{
                count=0;
                valid= true;
            }
        }

        return valid;
    }
}

// a=true
// aa=true
// aaa=false
// aaab=false
// abab

