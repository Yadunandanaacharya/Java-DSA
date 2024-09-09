package Step0;

public class sumPairsTwoArray {
    public static void main(String[] args) throws Exception {
        int [] arr1= {1,2,3};
        int [] arr2= {4,5,6};
        
        int sum = 0;
        for(int i =0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
             sum += arr1[i]+ arr2[j];   
            }
        }
        System.out.println(sum);
    }
}
