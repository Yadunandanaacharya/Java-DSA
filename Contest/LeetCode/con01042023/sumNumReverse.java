package Contest.LeetCode.con01042023;

public class sumNumReverse {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
            String s = Integer.toString(i);
            String rs = new StringBuilder(s).reverse().toString();
            int ri = Integer.parseInt(rs);
            if (i + ri == num) {
                return true;
            }
        }
        return false;
    }
}
