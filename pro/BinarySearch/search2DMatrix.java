package pro.BinarySearch;

import java.util.List;

public class search2DMatrix {
    public int searchMatrix(List<List<Integer>> A, int B) {
        // Apply binary search on the first column to get the row to search in
        int start = 0;
        int end = A.size() - 1;
        int idx = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A.get(mid).get(0) == B) {
                return 1;
            }
            if (A.get(mid).get(0) < B) {
                idx = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // After finding the appropriate row, apply binary search on that row
        List<Integer> row = A.get(idx);
        return binarySearch(row, B) ? 1 : 0;
    }
    
    // Helper method to perform binary search on a sorted list
    private boolean binarySearch(List<Integer> row, int target) {
        int left = 0;
        int right = row.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row.get(mid) == target) {
                return true;
            }
            if (row.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}








