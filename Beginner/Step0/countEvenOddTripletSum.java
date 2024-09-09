package Step0;

public class countEvenOddTripletSum {
    public static void main(String[] args) throws Exception {
        int [] arr1= {1,2,3,4,5,6,7};
        
        int sumEven = 0;
        int sumOdd = 0;
        for(int i =0; i<arr1.length;i++){
            for(int j=i+1; j<arr1.length;j++){
                for(int k=j+1; k<arr1.length;k++){
                    if(( arr1[i]+arr1[j]+arr1[k])%2==0){
                        sumEven++;
                    }
                    else{
                        sumOdd++;
                    }
                }
            }
        }
        System.out.println("even " + sumEven + " odd " + sumOdd);
    }
}


