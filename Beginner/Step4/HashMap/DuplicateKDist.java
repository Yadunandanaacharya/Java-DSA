import java.util.*;

public class DuplicateKDist {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 3, 4, 1, 2, 5}; //no
        int[] arr1= new int[]{1,2,3,1}; //yes
        int k = 5;
        HashMap<Integer,Integer> map = new HashMap();
        System.out.println(duplicateCheck(arr,map,k));
        map.clear();
        k=3;
        System.out.println(duplicateCheck(arr1,map,k));
    }

    public static boolean duplicateCheck(int[] arr, HashMap<Integer,Integer> map, int k){
        for(int i = 0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                if(Math.abs(i-value) <=k){
                    return true;
                }
            }
            else{
                map.put(arr[i], i);
            }
        }

        return false;
    }
}
