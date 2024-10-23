package Contest.LeetCode.con08042023;
import java.util.*;;

public class convertArrayTo2dArray {
    public List<List<Integer>> findMatrix(int[] nums) { 
        List<List<Integer>> ans = new ArrayList(); 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 

        for(int i = 0;i< nums.length; i++){ 
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
        } 
 
        int  maxRowCount = 1; 
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){ 
            maxRowCount = Math.max(entry.getValue(), maxRowCount); 
        } 

        for(int i = 0; i < maxRowCount; i++){ 
            ans.add(new ArrayList()); 
        } 

        int rowToInsert = 0; 
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){ 
            rowToInsert=0; 

            while(rowToInsert < entry.getValue()){ 
                ans.get(rowToInsert).add(entry.getKey()); 
                rowToInsert++; 
            } 
        } 

        return ans; 
    }  
}
