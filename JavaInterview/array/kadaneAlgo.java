

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-2,5};
        int sum = 0;
        int maxSum = 0;
        System.out.println();
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
                maxSum = 0;
            }
        }
    }

    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
// Find the maximum sum ending at index i by either extending  the maximum sum subarray ending at index 
// i - 1 or by starting a new subarray from index i
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
// Update res if maximum subarray sum ending at index i > res
            res = Math.max(res, maxEnding);
        }
        return res;
    }

}
