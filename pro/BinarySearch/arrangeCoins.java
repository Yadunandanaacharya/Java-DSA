package pro.BinarySearch;

public class arrangeCoins {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        int count = 0;
        while(low<=high){
          long mid = (high-low)/2+low;
          long coin = mid*(mid+1)/2;
          if(coin==n) return (int)mid;
          else if(coin>n) high = mid-1;
          else low = mid+1;
        }
        return (int)high;
    }
}
