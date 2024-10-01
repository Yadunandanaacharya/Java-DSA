package Contest.LeetCode.con18032023;

public class maxDiffDigit {
    public static int minMaxDifference(int num) {  
        String str = Integer.toString(num);  
        int maxVal = 0, minVal = Integer.MAX_VALUE;  
    
        for (char charIs : str.toCharArray()) {  
            for (char charIterat = '0'; charIterat <= '9'; charIterat++) {  
                StringBuilder strBuilder = new StringBuilder(str);  
    
                for (int k = 0; k < strBuilder.length(); k++) {  
                    if (strBuilder.charAt(k) == charIs) {  
                        strBuilder.setCharAt(k, charIterat);  
                    }  
                }  
    
                maxVal = Math.max(maxVal, Integer.parseInt(strBuilder.toString()));  
                minVal = Math.min(minVal, Integer.parseInt(strBuilder.toString()));  
            }  
        }  
    
        return maxVal - minVal;  
    }

    public static void main(String[] args) {
        int num = 90;
        System.out.println(minMaxDifference(num));
    }
}

