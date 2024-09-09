package Step0;
import java.util.*;

public class countOfDistinct {
    public static void main(String[] args) throws Exception {
        int [] arr={10,30,40,20,10,20,50,10};
        //ans: 10,20,30,40,50 so 5 distinct elements
        Set<Integer> distinct = new HashSet();
        for(int i=0;i<arr.length;i++){
            distinct.add(arr[i]);
        }
        System.out.println(distinct.size());

        //approach2
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    j++;
                }
                else{
                    i=j;
                    j=i+1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
