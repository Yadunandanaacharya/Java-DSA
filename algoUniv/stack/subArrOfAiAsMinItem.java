package algoUniv.stack;
import java.util.*;

public class subArrOfAiAsMinItem {
    public static void findLeftRange(int[] arr, int[] range, int n) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if (stk.isEmpty())
                range[i] = 0;
            else
                range[i] = stk.peek() + 1;
            stk.push(i);
        }
    }
 
    public static void findRightRange(int[] arr, int[] range, int n) {
        Stack<Integer> stk = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i])
                stk.pop();
            if (stk.isEmpty())
                range[i] = n - 1;
            else
                range[i] = stk.peek() - 1;
            stk.push(i);
        }
    }
 
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] arr = new int[n];
        int[] arr = new int[]{100, 80, 61, 70, 60, 75, 85};
        int n = arr.length;

        // for (int i = 0; i < n; i++) {
        //     arr[i] = scanner.nextInt();
        // }
        
        int[] leftRange = new int[n];
        int[] rightRange = new int[n];
        findLeftRange(arr, leftRange, n);
        findRightRange(arr, rightRange, n);
 
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Left range of " + arr[i] + ": " + leftRange[i] + ", Right range of " + arr[i] + ": " + rightRange[i] );
            // System.out.println((leftRange[i]+1) * (rightRange[i] +1 ));
        }
    }
}





