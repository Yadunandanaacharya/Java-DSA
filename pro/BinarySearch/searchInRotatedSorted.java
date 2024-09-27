package pro.BinarySearch;

public  class searchInRotatedSorted {
    
    public static int search(int[] nums, int target){
        int start=0;
        int end= nums.length-1;
        while (start<=end) {
            System.out.println(start-end);
            int mid= end+ (start-end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[mid]<=nums[end]){
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
    
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{10, 12,  15,  20,  25,  30,  0,  1,   4,  8};
        System.out.println(search(arr,0));
    }
}
 

