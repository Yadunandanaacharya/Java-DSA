package array;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2, 0, 1, 2 };
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 0) {
                ones++;
            } else if (arr[i] == 0) {
                twos++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }
        for (int i = zeros; i < ones; i++) {
            arr[i] = 1;
        }
        for (int i = ones; i < twos; i++) {
            arr[i] = 2;
        }

    }
}
