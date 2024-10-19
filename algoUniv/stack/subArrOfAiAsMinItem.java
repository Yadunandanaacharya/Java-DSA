package algoUniv.stack;
import java.util.*;

public class subArrOfAiAsMinItem {
    public static void findLeftRange(int[] arr, int[] range, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            if (s.isEmpty())
                range[i] = 0;
            else
                range[i] = s.peek() + 1;
            s.push(i);
        }
    }
 
    public static void findRightRange(int[] arr, int[] range, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i])
                s.pop();
            if (s.isEmpty())
                range[i] = n - 1;
            else
                range[i] = s.peek() - 1;
            s.push(i);
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        int[] leftRange = new int[n];
        int[] rightRange = new int[n];
        findLeftRange(arr, leftRange, n);
        findRightRange(arr, rightRange, n);
 
 
        for (int i = 0; i < n; i++) {
            System.out.println("Left range of " + arr[i] + ": " + leftRange[i] + ", Right range of " + arr[i] + ": " + rightRange[i]);
        }
        scanner.close();
    }
}
