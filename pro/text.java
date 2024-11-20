package pro;
import java.util.*;

public class text {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(reverse("yadu"));
    }

    public static String reverse(String str){
        StringBuilder strBuilder = new StringBuilder();
        for(int i = str.length()-1; i >= 0 ; i--){
            strBuilder.append(str.charAt(i));
        }

        return strBuilder.toString();
    }
}




