package pro.BinarySearch;
import java.util.*;

public class allocateMinBooks {
    static boolean isPossible(int[]a,int pages,int students) {
        int cnt = 0;
        int sumAllocated = 0;
        for (int i = 0; i < a.length; i++) {
            if (sumAllocated + a[i] > pages) {
                cnt++;
                sumAllocated = a[i];
                if (sumAllocated > pages) return false;
            } else {
                sumAllocated += a[i];
            }
        }
        if (cnt<students) return true;
        return false;
    }
    public static int books(int[]a,int students) {
        if (students > a.length) return -1;
        int low = a[0];
        int high = 0;
        for (int i = 0; i < a.length; i++) {
            high = high + a[i];
            low = Math.min(low, a[i]);
        }
        int res = -1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (isPossible(a,mid,students)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        int students=scn.nextInt();
        System.out.println("Minimum number of pages ="+books(a,students));
    }
}
