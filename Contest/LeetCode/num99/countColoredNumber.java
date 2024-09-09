package Contest.LeetCode.num99;

public class countColoredNumber {
    public static void main(String[] args) {
        
    }

    public long coloredCells(int n) {
        return (long)n * n + (long)(n - 1) * (n - 1);
    }
}
