package pro.BinarySearch;
import java.util.*;;

public class midOccurencXInArr {
    public static void findans(int[] ans, int[] nums, int target) {
        //I think finding lower occurence of x here
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                r = mid - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        //I think finding upper occurence of x here
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 2, 2, 3, 4, 5, 6, 7 };
        Arrays.sort(nums);
        int[] ans = new int[2];
        findans(ans, nums, 2);
        System.out.println("ans[0] " + ans[0]);
        System.out.println("ans[1] " + ans[1]);
        int retans = (ans[0] + ans[1]) / 2;
        System.out.println("retans " + retans);
    }

    
}





    











