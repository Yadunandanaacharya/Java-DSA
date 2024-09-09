package Step0;

public class sumPairsSingleArray {
    public static void main(String[] args) throws Exception {
        int [] arr= {1,2,3,4,5,6};
        
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
             sum += arr[i]+ arr[j];   
            }
        }
        System.out.println(sum);
    }
}
