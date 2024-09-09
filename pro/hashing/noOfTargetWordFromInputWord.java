package pro.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class noOfTargetWordFromInputWord {
    public static void main(String[] args) {
        // String s = "mononom";
        // String t = "mon";
        // String s = "";
        // String t = "mon";
        String s = "mon";
        String t = "";

        if (t.isEmpty()) {
            System.out.println(-1);
            return;
        }
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        Map<Character, Integer> freq_s = new HashMap<>();
        Map<Character, Integer> freq_t = new HashMap<>();

        for (char letter : s.toCharArray()) {
            freq_s.put(letter, freq_s.getOrDefault(letter, 0) + 1);
        }
        for (char letter : t.toCharArray()) {
            freq_t.put(letter, freq_t.getOrDefault(letter, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        for (char letter : t.toCharArray()) {
            ans = Math.min(freq_s.getOrDefault(letter, 0) / freq_t.getOrDefault(letter, 0), ans);
        }

        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }

        System.out.println(ans);
    }
    
}


