package Contest.LeetCode.num334;

import java.util.PriorityQueue;

public class minTime {

    public int minimumTime(int[][] grid) {
        if (grid[1][0] > 1 && grid[0][1] > 1)
            return -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int n = grid.length, m = grid[0].length;
        // direction down,right,up, left respectively
        int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } }, visited = new int[n][m];
        pq.add(new int[] { grid[0][0], 0, 0 });

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int time = top[0], row = top[1], col = top[2];
            // below means we reached end of the matrix we can return time
            if (row == n - 1 && col == m - 1)
                return time;
            // if already visited then don’t visit again
            if (visited[row][col] > 0)
                continue;

            visited[row][col]++;

            for (int[] i : direction) {
                int newRow = row + i[0], newCol = col + i[1];
                if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m || visited[newRow][newCol] > 0)
                    continue;
                int waitTime = (grid[newRow][newCol] - time) % 2 == 0 ? 1 : 0;
                pq.add(new int[] { Math.max(grid[newRow][newCol] + waitTime, time + 1), newRow, newCol });
            }
        }
        return -1;
    }

    
}
