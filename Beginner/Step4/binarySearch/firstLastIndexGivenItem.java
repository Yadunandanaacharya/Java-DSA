package Step4.binarySearch;

public class firstLastIndexGivenItem {
    public static int first(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == k) {
                ans = mid;
                j = mid - 1;
            } else if (arr[mid] > k) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int last(int[] arr, int k) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == k) {
                ans = mid;
                i = mid + 1;
            } else if (arr[mid] > k) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
}
