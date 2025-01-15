package JavaInterview;

import java.util.HashMap;

public class printRepeatedChars {
    // S = “geeksforgeeks”
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),count+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " count is " + entry.getValue());
            }
        }
    }
}
