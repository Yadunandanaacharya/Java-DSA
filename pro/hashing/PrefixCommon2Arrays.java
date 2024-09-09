package pro.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrefixCommon2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Long> A = new ArrayList<>(n);
        List<Long> B = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            A.add(scanner.nextLong());
        }

        for (int i = 0; i < n; i++) {
            B.add(scanner.nextLong());
        }

        List<Long> ans = new ArrayList<>();

        int i = 1;
        if (A.get(0).equals(B.get(0))) {
            ans.add(1L);
        } else {
            ans.add(0L);
        }

        while (i < A.size()) {
            Map<Long, Integer> mp = new HashMap<>();
            for (int j = i; j >= 0; j--) {
                mp.put(A.get(j), mp.getOrDefault(A.get(j), 0) + 1);
            }

            int cnt = 0;

            for (int j = i; j >= 0; j--) {
                if (mp.containsKey(B.get(j))) {
                    cnt++;
                    mp.put(B.get(j), mp.get(B.get(j)) - 1);
                    if (mp.get(B.get(j)) == 0) {
                        mp.remove(B.get(j));
                    }
                }
            }

            ans.add((long) cnt);

            i++;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(ans.get(j) + " ");
        }
    }

    //for leetcode submit to increase rank
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
            int[] ans = new int[A.length];

        int i = 1;
        if (A[0] == B[0]) {
            ans[0] = 1;
        } else {
            ans[0] = 0;
        }

        while (i < A.length) {
            Map<Integer, Integer> mp = new HashMap<>();
            for (int j = i; j >= 0; j--) {
                mp.put(A[j], mp.getOrDefault(A[j], 0) + 1);
            }

            int cnt = 0;

            for (int j = i; j >= 0; j--) {
                if (mp.containsKey(B[j])) {
                    cnt++;
                    mp.put(B[j], mp.get(B[j]) - 1);
                    if (mp.get(B[j]) == 0) {
                        mp.remove(B[j]);
                    }
                }
            }

            ans[i]=cnt;

            i++;
        }

        return ans;
    }
}
