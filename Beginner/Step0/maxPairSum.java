package Step0;

public class maxPairSum {
    public static void main(String[] args) throws Exception {
        int [] arr1= {1,2,3};
        int [] arr2= {4,5,6};
        
        int sum = 0;
        int maxI=0;
        int maxJ=0;
        for(int i =0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if (arr1[i]+ arr2[j]>sum){
                    maxI=i;
                    maxJ=j;
                }
             sum = Math.max(sum,arr1[i]+ arr2[j]);
             
            }
        }
        System.out.println(sum);
        System.out.println(maxI);
        System.out.println(maxJ);
    }
}
