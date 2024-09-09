package pro.slidingWindow;

import java.util.*;

public class consecutiveIntFromDataStream {

}

class DataStream {
    List<Integer> streamList = new ArrayList();
    int value;
    int k;

    // sliding window variables
    int i = 0, j = 0, count = 0;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        streamList.add(num);
        boolean ans = false;

        if (streamList.get(j) == value)
            count++;
        if (j - i + 1 < k) {
            j++;
            ans = false;
        } else if (j - i + 1 == k) {
            if (count == k) {
                ans = true;
            } else {
                ans = false;
            }

            // unaffect it's like previous item ignoring
            if (streamList.get(i) == value)
                count--;
            i++;
            j++;
        }

        return ans;
    }
}