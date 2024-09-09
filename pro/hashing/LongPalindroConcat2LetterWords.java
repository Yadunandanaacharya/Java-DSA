package pro.hashing;

import java.util.HashMap;

public class LongPalindroConcat2LetterWords {
    public static int longestPalindrome(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = 0, flag = 0;
        for (int i = 0; i < words.length; i++) {
            hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
        }
        for (String word : hm.keySet()) {
            char ch = word.charAt(0);
            char ch1 = word.charAt(1);
            String reverse = "" + ch1 + ch;
            if (hm.containsKey(reverse)) {
                if (ch == ch1) {
                    System.out.println(hm.get(word) % 2);
                    if (hm.get(word) % 2 == 0) {
                        ans += hm.get(word) * 2;
                    } else {
                        if (flag == 0) {
                            ans += hm.get(word) * 2;
                            flag = 1;
                        } else {
                            ans += (hm.get(word) - 1) * 2;
                        }
                    }
                }
                if (ch != ch1)
                    ans += Math.min(hm.get(word), hm.get(reverse)) * 2;

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = { "lc", "cl", "gg" };
        System.out.println(longestPalindrome(words));
    }
}

