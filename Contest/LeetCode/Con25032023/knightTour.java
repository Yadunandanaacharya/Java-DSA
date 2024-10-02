package Contest.LeetCode.con25032023;

public class knightTour {
    public static boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }

        int n = grid.length;
        int[][] ijArr = new int[n * n][2]; // To store the coordinates of each number in the grid
        
        // Store the positions (coordinates) of each number in the array 'ijArr'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ijArr[grid[i][j]][0] = i; // Row of the current number
                ijArr[grid[i][j]][1] = j; // Column of the current number
            }
        }

        // Validate the knight's move between consecutive numbers
        for (int i = 0; i + 1 < n * n; i++) {
            int rowDiff = Math.abs(ijArr[i][0] - ijArr[i + 1][0]); // Row difference
            int colDiff = Math.abs(ijArr[i][1] - ijArr[i + 1][1]); // Column difference
            if (rowDiff + colDiff != 3 || ijArr[i][0] == ijArr[i + 1][0] || ijArr[i][1] == ijArr[i + 1][1]) {
                return false; // Invalid knight's move
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception{
        int[][] grid = new int[][]{{0,  3,  6},{5,  8,  1},{2,  7,  4}};
        System.out.println(checkValidGrid(grid));;
    }
}

