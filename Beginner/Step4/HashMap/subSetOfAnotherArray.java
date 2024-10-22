package Step4.HashMap;
import java.util.*;

/*
int[] arr1= new int[]{2,4,7,1,5,5};
        int[] arr2= new int[]{5,4,2,2};
as in arr2 2 is present 2 times but in
arr1 2 is present once 
so arr2 not subset of arr1

logic: is we iterate through arr2 again and keep
subtracting frequencies if we find match in arr2

 */

public class subSetOfAnotherArray {
    public static void main(String[] args) throws Exception{
        int[] arr1= new int[]{2,4,7,1,5,5};
        int[] arr2= new int[]{5,4,2,2};
        boolean isSubSet = IsSubSet(arr1, arr2);
        System.out.println(isSubSet);
    }

    public static boolean IsSubSet(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map1 = new HashMap();
        for(int i = 0; i < arr1.length; i++){
            map1.put(arr1[i], map1.getOrDefault(arr1[i],0)+1);
        }

        for(int i = 0; i < arr2.length; i++){
            if(!map1.containsKey(arr2[i])) return false;
            if(map1.get(arr2[i]) == 0) return false;
            
            int countOfItem = map1.get(arr2[i]);
            map1.put(arr2[i],countOfItem-1);
        }

        return true;
    }
    
}
