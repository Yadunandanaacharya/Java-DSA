package pro.BinarySearch;

public class median9 {
    public static int findLessThanEqualCount(int[][] matrix, int r, int tar) {
        int idx = -1;
        int lo = 0;
        int hi = matrix[r].length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (matrix[r][mid] <= tar) {
                idx = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        int nEleLessThanEqual = idx + 1;
        return nEleLessThanEqual;
    }
 
    static int median(int matrix[][], int R, int C) {
        int l = 1;
        int r = (int) 1e9;
        int median = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int total = n * m;
        while (l <= r) {
            int mid = (l + r) / 2;
            int nEleLessThanEqual = 0;
            for (int row = 0; row < n; row++) {
                nEleLessThanEqual = nEleLessThanEqual + findLessThanEqualCount(matrix, row, mid);
            }
            if (nEleLessThanEqual > total / 2) {
                median = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return median;
    }
}
