package pro.slidingWindow;

import java.util.ArrayList;

public class slidingWindowKSize {
    public static void main(String[] args) {
        int[] arr = new int[]{100,200,300,400};
        int k=2;
        SlidingWindow(arr);
    }

    public static void SlidingWindow(int[] arr){
        int i = 0, j=0,sum=0,max=0;
        int k = 2;
        int n = arr.length;
        while (j<n) {
            //will do some calc here
            sum += arr[j];
    
            //j-i+1 is current window size
            if(j-i+1 < k) j++;
            else if(j-i+1 == k){
                //but before doing i++ j've to uneffect the ith index element from
                //calculation means j've to subtract ith index element 
                max= Math.max(max,sum); //ans calculation
                sum -= arr[j]; //slide the window
                i++;j++;        //slide the window
            }
        }

        System.out.println(max);
    }

    
}
