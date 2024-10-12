package Contest.LeetCode.con19032023;

public class minTimeRepairCars {
    public static long repairCars(int[] ranks, int cars){
        long l = 0;
        long r = (long)1e14;
        while (l<=r) {
            // long mid = l + (r-1)/2;
            long mid = (l+r)/2;
            long car = 0;
            for(int i : ranks){
                car += Math.sqrt(mid/i);
            }
            if(car >= cars){
                r=mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,3,1};
        int cars = 10;
        System.out.println(repairCars(arr,cars));
    }
}
