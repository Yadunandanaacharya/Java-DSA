package Step1HackerRank;

import java.util.ArrayList;
import java.util.List;

public class billDivision {
    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k = 1;
        int b = 12;

        int billSum = 0;
        for(int i = 0; i < bill.size();i++){
            if(bill.get(i) == bill.get(k)){
                continue;
            }
            else{
                billSum += bill.get(i);
            }
        }
        
        if(billSum/2 ==b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-billSum);
        }
    }

    
}


