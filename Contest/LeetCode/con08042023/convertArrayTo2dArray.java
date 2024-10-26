package Contest.LeetCode.con08042023;
import java.util.*;;

public class convertArrayTo2dArray {
    public List<List<Integer>> findMatrix(int[] nums) { 
        List<List<Integer>> ansList = new ArrayList(); 
        HashMap<Integer,Integer> mapArrItemCounter = new HashMap<Integer,Integer>(); 

        for(int i = 0;i< nums.length; i++){ 
            mapArrItemCounter.put(nums[i],mapArrItemCounter.getOrDefault(nums[i],0)+1); 
        } 
 
        int  maxRowCount = 1; 
        for(HashMap.Entry<Integer,Integer> entry : mapArrItemCounter.entrySet()){ 
            maxRowCount = Math.max(entry.getValue(), maxRowCount); 
        } 

        for(int i = 0; i < maxRowCount; i++){ 
            ansList.add(new ArrayList()); 
        } 

        int rowToInsert = 0; 
        for(HashMap.Entry<Integer,Integer> entry : mapArrItemCounter.entrySet()){ 
            rowToInsert=0; 

            while(rowToInsert < entry.getValue()){ 
                ansList.get(rowToInsert).add(entry.getKey()); 
                rowToInsert++; 
            } 
        } 

        return ansList; 
    }  
}
