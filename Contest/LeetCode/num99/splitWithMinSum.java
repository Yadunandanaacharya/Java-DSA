package Contest.LeetCode.num99;

import java.util.*;

public class splitWithMinSum {
    public static void main(String[] args) {
        int num = 4325;
        splitNum(num);
    }

    public static int splitNum(int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String num1="";
        String num2="";
        
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                num1 = num1 + arr[i];
            }
            else{
                num2  = num2 + arr[i];
            }
        }

        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
}
