package pro.slidingWindow;
import java.util.*;

public class countSubStrContainChar5 {
    public static void main(String[] args) {
        String str = "0505050";
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int strLen = str.length();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < strLen;i++){
            if(str.charAt(i) == '5'){
                count = count + 1;
            }

            sum = sum + map.getOrDefault(count-k, 0);
            int val1 = map.getOrDefault(count, 0);
            int val2 = val1+1;
            map.put(count,map.getOrDefault(count, 0)+1);
        }
        System.out.println();
        System.out.println(sum);
    }
}



    
