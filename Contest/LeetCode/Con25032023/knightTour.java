package Contest.LeetCode.Con25032023;

public class knightTour {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }

        int n = grid.length;
        int[][] a = new int[n * n][2]; // To store the coordinates of each number in the grid

        // Store the positions (coordinates) of each number in the array 'a'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[grid[i][j]][0] = i; // Row of the current number
                a[grid[i][j]][1] = j; // Column of the current number
            }
        }

        // Validate the knight's move between consecutive numbers
        for (int i = 0; i + 1 < n * n; i++) {
            int dx = Math.abs(a[i][0] - a[i + 1][0]); // Row difference
            int dy = Math.abs(a[i][1] - a[i + 1][1]); // Column difference
            if (dx + dy != 3 || a[i][0] == a[i + 1][0] || a[i][1] == a[i + 1][1]) {
                return false; // Invalid knight's move
            }
        }

        return true;
    }
}
