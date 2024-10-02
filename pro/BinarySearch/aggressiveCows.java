package pro.BinarySearch;
import java.util.*;

public class aggressiveCows {
    static boolean isPossible(int a[], int n, int cows, int minDist) {
        int count = 1;
        int prev = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i]-prev >= minDist) {
                count++;
                prev = a[i];
            }
        }
        if (count >= cows) return true;
        return false;
    }
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int cows=scn.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        Arrays.sort(a);
        int low = 1, high = a[n - 1] - a[0];
        while (low <= high) {
            int mid = (low + high) >> 1;

            if (isPossible(a, n, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("The largest minimum distance is " + high);
    }
}
