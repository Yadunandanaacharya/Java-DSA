package Step1HackerRank;

import java.util.*;

public class numberLine {
    public static void main(String[] args) {

        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        a1.add(5);
        a1.add(6);
        a1.add(8);
        a1.add(11);

        int sum = 0;
        for (int i = 0; i < a1.size(); i++) {
            sum += a1.get(i);
        }
        int new_sum = 0;
        for (int i = 0; i < a1.size(); i++) {
            new_sum += a1.get(i);
            if (sum == new_sum)
                System.out.println("YES");
            ;
            sum -= a1.get(i);
        }
    }
}
