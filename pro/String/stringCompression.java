package pro.String;

public class stringCompression {
    public static void main(String[] args) {
        String str = "wwwwaaadexxxxxx";
        int count = 1;
        String result = str.substring(0,1);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)){
                if(count > 1){
                    result += count;
                    count = 1;
                }
                result+=str.charAt(i);
            }
            else {
                count++;
            }
        }

        if(count>1){
            result += count;
        }
        System.out.println();
        System.out.println(result);
    }
}
