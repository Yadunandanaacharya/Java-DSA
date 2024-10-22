package Contest.LeetCode.con08042023;

import java.util.*;

public  class longZeroOneSubStringLen1 {
    public static int FindLongZeroOneSubStringLen(String str){
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> onesList = new ArrayList<>();
        int zero = 0;
        int one=0;
        int chkZero = 0; int chkOne = 0;
        int leadingOneSkip = 0;

        //this while loop check only for initial 1's example 11000 here at index
        //0 to 1 we have 1's while loop checks them
        while(leadingOneSkip < str.length() && str.charAt(leadingOneSkip) == '1'){
            leadingOneSkip++;
        }

        for(int i = leadingOneSkip; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                if(chkOne > 0){
                    onesList.add(one);
                    chkOne = 0;
                }
                one = 0;
                zero++;
                chkZero = 1;
            }
            else{
                if(chkZero > 0){
                    zeroList.add(zero);
                    chkZero = 0;
                }
                chkOne=1;
                zero=0;
                one++;
            }
        }

        int ans = 0;
        if(zero>0){
            zeroList.add(zero);
        }

        if(one > 0){
            onesList.add(one);
        }

        for(int i = 0; i < Math.min(zeroList.size(),onesList.size()); i++){
            ans = Math.max(2*Math.min(zeroList.get(i), onesList.get(i)), ans);
        }

        return ans;
    }

    public static void main(String[] args){
        String str = "01000111";
        System.out.println(FindLongZeroOneSubStringLen(str));
    }
}
