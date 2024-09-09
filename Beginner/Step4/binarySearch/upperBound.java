package Step4.binarySearch;

public class upperBound {
    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
 
        while (left < right) {
            int mid = left + (right - left) / 2;
 
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
 
        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 6, 7, 7, 9 };
        int target = 6;
        int upperBoundIndex = upperBound(arr, target);

        if (upperBoundIndex < arr.length) {
            System.out.println("Upper bound of " + target + " is at index " + upperBoundIndex);
        } else {
            System.out.println("Upper bound of " + target + " is at index " + arr.length);
        }
    }
}








    