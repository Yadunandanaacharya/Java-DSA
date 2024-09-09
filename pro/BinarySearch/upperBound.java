package pro.BinarySearch;

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

    public static int upperBound2(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                if (mid == 0) {
                    return 0;
                } else {
                    if (arr[mid - 1] <= target) {
                        return mid;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }

        return left;
    }

    // public static void main(String[] args) {
    // int[] arr = { 1, 3, 5, 6, 6, 7, 7, 9 };
    // int target = 6;
    // // int target = 3;
    // int upperBoundIndex = upperBound(arr, target);
    // int upperBoundIndex2 = upperBound2(arr, target);

    // if (upperBoundIndex < arr.length) {
    // System.out.println("Upper bound of " + target + " is at index " +
    // upperBoundIndex);
    // System.out.println("Upper bound of " + target + " is at index " +
    // upperBoundIndex2);
    // } else {
    // System.out.println("Upper bound of " + target + " is not found in the array.
    // n = " + arr.length);
    // }
    // }

    
}



